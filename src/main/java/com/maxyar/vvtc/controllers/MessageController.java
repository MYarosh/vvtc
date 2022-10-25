package com.maxyar.vvtc.controllers;

import com.maxyar.vvtc.entities.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    /**
     * Добавление сообщения в БД и отправка его получателю
     * @param message - сообщение
     * @return - хз
     */
    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody Message message){
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
