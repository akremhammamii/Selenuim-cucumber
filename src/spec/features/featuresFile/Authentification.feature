@login
Feature: Je souhaite verifer la page de connexion
  EtQ utilisateur je souhaite verifer la page de connexion

  @login-valide
  Scenario: authentification avec des donnes valides
    Given Je visite le site nopecommerce
    When Je saisie adresse mail "admin@yourstore.com"
    And Je saisie le mot de passe "admin"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home "Dashboard"