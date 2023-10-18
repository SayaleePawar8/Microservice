package com.contacts.controller;
import com.contacts.entity.Contact;
import java .util.*;
import com.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact")
public class ContactController {
    @Autowired
    private ContactService contactService;
    @RequestMapping("/user/{userId}")
    public List<Contact>getContacts(@PathVariable("userId") Long userId){
        return this.contactService.getContactOfUser(userId);

    }

}
