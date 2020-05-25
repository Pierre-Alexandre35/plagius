/**
 * This interface will establish communication with the Spring server API
 */
export interface FrontEndWebService {

    filesToJson();

    presentPercentage();

    PresentDiff();

    ProcessFiles_setOne();

    ProcessFiles_setTwo();
}
