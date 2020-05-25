import { Component } from '@angular/core';
import { WebService } from 'src/services/WebService';
import { resultFormat } from '../assets/report-format.js';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

/**
 * Main class contaiing the logic for our Angular app
 */
export class AppComponent {

  constructor(private webService: WebService) { }

  title = 'plagus-frontend';

  fileText1: any;
  fileText1Lines: string[] = [];
  fileText2: any;
  fileText2Lines: string[] = [];
  fileToUpload1: File = null;
  fileToUpload2: File = null;
  fileTypeSelection: string = null;
  responseReceived = false;
  activeTab = 'lcs';
  classCounterReport = resultFormat.classCountList;
  functionReport = resultFormat.levFuncReports.reportList;
  commentReport: any[] = [];
  LCSReport: any[] = [];

  classCounterReportOne: any = {};
  classCounterReportTwo: any = {};

  /**
   * handle input of file 1
   * @param files FileList
   */
  handleFileInput1(files: FileList) {
    this.fileToUpload1 = files.item(0);
  }

  /**
   * handle input of file 2
   * @param files FileList
   */
  handleFileInput2(files: FileList) {
    this.fileToUpload2 = files.item(0);
  }

  /**
   * Post files to backend
   */
  async submitFiles() {

    if (this.fileToUpload1 === null || this.fileToUpload2 === null || this.fileTypeSelection === null) {
      alert('Please upload two files, and make a file type selection :)');
    } else {
      const reader1 = new FileReader();
      reader1.readAsText(this.fileToUpload1);
      reader1.onload = () => {
        this.fileText1 = reader1.result;

        const file = reader1.result.toString();
        const allLines = file.split(/\r\n|\n/);

        // Reading line by line
        allLines.forEach((line) => {
          this.fileText1Lines.push(line);
        });
      };

      const reader2 = new FileReader();
      reader2.readAsText(this.fileToUpload2);
      reader2.onload = () => {
        this.fileText2 = reader2.result;

        const file = reader2.result.toString();
        const allLines = file.split(/\r\n|\n/);

        // Reading line by line
        allLines.forEach((line) => {
          this.fileText2Lines.push(line);
        });
      };

      const res = await
        this.webService.postFilesToServer(this.fileToUpload1, this.fileToUpload2, this.fileTypeSelection);

      console.log(res);

      this.responseReceived = true;

      this.commentReport = res['commentReport'].reports;
      this.classCounterReport = res['classCountList'];
      this.functionReport = res['levFuncReports'].reportList;
      this.LCSReport = res['minis'];

      console.log(this.LCSReport);

      return res;
    }
  }

  /**
   * handle fileType radio change
   * @param fileType string
   */
  fileTypeChanged(fileType: string) {
    this.fileTypeSelection = fileType;
  }

  /**
   * set active tab
   * @param tabName string
   */
  setActiveTab(tabName: string) {
    this.activeTab = tabName;
  }

  /**
   * sorting function
   * @param field string
   * @param ordering string
   */
  sort(field: string, ordering: string) {
    this.classCounterReport.sort(this.compareValues(field, ordering));
  }

  /**
   * function used for sorting
   * @param key string
   * @param order string
   */
  compareValues(key, order = 'asc') {
    return function innerSort(a, b) {
      if (!a.hasOwnProperty(key) || !b.hasOwnProperty(key)) {
        return 0;
      }

      const varA = (typeof a[key] === 'string')
        ? a[key].toUpperCase() : a[key];
      const varB = (typeof b[key] === 'string')
        ? b[key].toUpperCase() : b[key];

      let comparison = 0;
      if (varA > varB) {
        comparison = 1;
      } else if (varA < varB) {
        comparison = -1;
      }
      return (
        (order === 'desc') ? (comparison * -1) : comparison
      );
    };
  }

}
