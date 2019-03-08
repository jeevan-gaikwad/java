/* Author: Jeevan Gaikwad  Description: Self Learning Project*/

package org.jeevan.usermgmt.exception;

import javax.servlet.http.HttpServletRequest;
import org.jeevan.usermgmt.common.ErrorConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestControllerExceptionHandler {

    //@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR, reason = "User not found")
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<APIResponseErrorInfo> handleUserNotFoundException(HttpServletRequest request,
                    Exception ex) {
        return new ResponseEntity<> (new APIResponseErrorInfo(ErrorConstants.EC_NOT_FOUND,ex.getMessage()), 
                        HttpStatus.NOT_FOUND);
    }
}
