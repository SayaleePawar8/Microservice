package com.contacts.service;

import com.contacts.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts
    List<Contact> list=List.of(
            new Contact(1L, "Sayalee@gmail.com", "Sau", 8989L ),
            new Contact(2L, "Dhiraj@gmail.com", "Dhiru", 8980L ),
            new Contact(3L, "Sanjay@gmail.com", "Sanju", 8989L ),
            new Contact(4L, "Renuka@gmail.com", "Renu", 1144L )

    );
    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
