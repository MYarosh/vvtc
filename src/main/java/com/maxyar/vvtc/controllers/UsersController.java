package com.maxyar.vvtc.controllers;

import com.maxyar.vvtc.entities.Contacts;
import com.maxyar.vvtc.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class UsersController {

    @PostMapping("/addUzver")
    public ResponseEntity<String> addUser(@RequestBody User user){
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addContact(@RequestBody Contacts contacts){
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseEntity<String> deleteContact(@RequestBody Contacts contacts){
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @PostMapping("/delUzver")
    public ResponseEntity<String> deleteUser(@RequestBody User user){
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
