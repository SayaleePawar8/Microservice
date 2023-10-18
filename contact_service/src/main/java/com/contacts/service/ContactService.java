package com.contacts.service;
import com.contacts.entity.Contact;
import java.util.List;

public interface ContactService {
    public List<Contact> getContactOfUser(Long userId);
}
