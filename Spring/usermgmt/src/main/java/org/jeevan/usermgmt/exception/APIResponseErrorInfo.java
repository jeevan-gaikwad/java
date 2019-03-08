/* Author: Jeevan Gaikwad  Description: Self Learning Project*/
package org.jeevan.usermgmt.exception;

public class APIResponseErrorInfo {
    int errorCode;
    String errorMsg;

    public APIResponseErrorInfo(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
    public int getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
    public String getErrorMsg() {
        return errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    
}
