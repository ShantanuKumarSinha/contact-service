package com.contact.service;

import java.util.List;

import com.contact.model.Contact;
import com.contact.repository.ContactRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactRepository contactRepository;

    @PostConstruct
    private void createRecords(){
        var list = List.of(Contact
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
        contactRepository.saveAll(list);
    }



    @Override
    public List<Contact> getContact(Long customerId) {
        var list = contactRepository.findByCustomerId(customerId);
        return list.stream()
                .filter(contact -> contact.getCustomerId().equals(customerId))
                .toList();
    }
}
