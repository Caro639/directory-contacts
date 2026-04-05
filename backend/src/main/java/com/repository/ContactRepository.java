package com.repository;

import com.model.Contact;
import com.model.Utilisateur;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByUtilisateur(Utilisateur utilisateur);
    List<Contact> findByNomContainingIgnoreCase(String nom);

}
