package com.contact.service;

import com.contact.model.Contact;
import java.util.List;


public interface ContactService {

    public List<Contact> getContact(Long customerId);

}
