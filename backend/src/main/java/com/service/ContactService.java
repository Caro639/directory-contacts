package com.service;

import com.model.Contact;

import java.util.Optional;
import java.util.List;

public interface ContactService {
    List<Contact> findAll();
    Optional<Contact> findById(Long id);
    Contact create(Contact contact);
    Contact update(Long id, Contact contact);
    void delete(Long id);
    List<Contact> searchByNom(String nom);

}
