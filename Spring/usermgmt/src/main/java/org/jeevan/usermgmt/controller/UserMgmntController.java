package org.jeevan.usermgmt.controller;

import java.util.List;
import org.jeevan.usermgmt.dto.User;
import org.jeevan.usermgmt.exception.UserNotFoundException;
import org.jeevan.usermgmt.service.UserMgmtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserMgmntController {

    @Autowired
    UserMgmtService userMgmtService;
    
    @RequestMapping(value = "/usermgmt", method = RequestMethod.GET)
    @ResponseBody
    public  ResponseEntity<List<User>> listUsers() {

        List<User> users = userMgmtService.listUsers();
        
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/usermgmt/{id}", method = RequestMethod.GET)
    @ResponseBody
    public  ResponseEntity<User> getUserDetails(@PathVariable("id") long userId) throws UserNotFoundException {
        
        User user = userMgmtService.getUserDetails(userId);
        
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    
    @PostMapping(value = "/usermgmt")
    public ResponseEntity<Void> createUser(@RequestBody User userDetails) {
        System.out.println("User with id:" + userDetails.getId() + " created!");
        
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
}
