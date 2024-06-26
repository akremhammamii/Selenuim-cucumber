@connexion
Feature: Je souhaite verifier la page de connexion

  @cnx
  Scenario: Je souhaite verifier la page de connexion avec des donnees invalides
    Given Je visite le site nopecommerce
    When Je saisie adresse mail "manel@gmail.com"
    When Je saisie le mot de passe "Manel"
    When Je clique sur le bouton login
    Then Je verifie les messages d'erreur "wrong mail"
