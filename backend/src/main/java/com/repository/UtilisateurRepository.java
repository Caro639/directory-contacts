package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
