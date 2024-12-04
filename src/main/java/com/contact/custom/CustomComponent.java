package com.contact.custom;

import com.contact.model.Contact;
import com.contact.repository.ContactRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomComponent {


    private ContactRepository repo;

    public CustomComponent(ContactRepository repo) {
        this.repo = repo;
    }

    @EventListener
        public void appReady(ApplicationReadyEvent event) {
            repo.save(Contact
                    .builder()
                    .contactId(4L)
                    .contactName("Rajendra Prasad")
                    .emailId("rajendra.prasad@gmail.com")
                    .customerId(101L)
                    .build());
        }
    }

