package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Utilisateur;
import com.repository.UtilisateurRepository;

@RestController
public class TestController {

    private final UtilisateurRepository utilisateurRepository;

    public TestController(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @GetMapping("/api/test")
    public String testDatabase() {
        Utilisateur utilisateur = new Utilisateur("testuser", "0600000000", "test@test.com", "Développeur", "DSI", "Bureau 1");
        

        utilisateurRepository.save(utilisateur);
        return "Utilisateur de test ajouté à la base de données avec succès !" + utilisateur.getId();
    }
}
