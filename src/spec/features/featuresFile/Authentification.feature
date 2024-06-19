@login
Feature: Je souhaite verifer la page de connexion
  EtQ utilisateur je souhaite verifer la page de connexion

  Background: 
    Given Je visite le site nopecommerce
    When Je saisie adresse mail
    And Je saisie le mot de passe "admin"
    And Je clique sur le bouton login

  @login-valide
  Scenario: Authentification avec des donnes valides
    Then Je me redirige vers la page home "Dashboard"

  @logout
  Scenario: Je souhaite me deconnecter
    When Je clique sur le bouton Logout
    Then Je me redirige vers la page de connexion