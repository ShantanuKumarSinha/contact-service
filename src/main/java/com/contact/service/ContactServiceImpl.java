package com.contact.service;

import java.util.List;

import com.contact.model.Contact;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

  List<Contact> list = List.of(Contact
          .builder()
          .contactId(1L)
          .contactName("Shantanu")
          .emailId("shan.raj93@gmail.com")
          .customerId(101L)
          .build(),
          Contact
                  .builder()
                  .contactId(2L)
                  .contactName("Sita")
                  .emailId("sita@gmail.com")
                  .customerId(102L)
                  .build(),
          Contact
                  .builder()
                  .contactId(3L)
                  .contactName("Ram")
                  .emailId("ram9@gmail.com")
                  .customerId(102L)
                  .build());

    @Override
    public List<Contact> getContact(Long customerId) {
        return this.list.stream()
                .filter(contact -> contact.getCustomerId()==customerId)
                .toList();
    }
}
