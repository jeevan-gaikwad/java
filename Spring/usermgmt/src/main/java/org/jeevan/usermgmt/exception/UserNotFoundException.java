/* Author: Jeevan Gaikwad  Description: Self Learning Project*/

package org.jeevan.usermgmt.exception;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(long userId) {
        super("User with Id:" + userId + " not found!");
    }
}
