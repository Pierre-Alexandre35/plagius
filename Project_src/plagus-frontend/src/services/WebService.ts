import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable()
export class WebService {

    constructor(private readonly http: HttpClient) { }

    /** Sends 2 files to the server */
    async postFilesToServer(file1: File, file2: File, fileTypeSelection: string) {

        // Instantiate a FormData to store form fields and encode the file
        const body = new FormData();

        // Add file content to prepare the request
        body.append('file1', file1);
        body.append('file2', file2);
        body.append('fileType', fileTypeSelection);

        // Launch post request
        const res = this.http.post('http://localhost:8080/postFiles', body, { responseType: 'json' }).toPromise();
        return res;
    }
}
