package com.contact.service;

import com.contact.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {
    public List<Contact> getContact(Long customerId);

}
