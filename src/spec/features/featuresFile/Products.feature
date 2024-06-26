@product
Feature: Je veux chercher un produit
  en tant que utilisateur je veux choisir un prodiot

  Background: 
    Given Je visite le site nopecommerce
    When Je saisie adresse mail
    And Je saisie le mot de passe "admin"
    And Je clique sur le bouton login

  @research-product
  Scenario: je souhaite chercher un produit
    When Je clique sur catalog
    When Je clique sur le menu product
    And Je saisie le product name "HP Spectre XT Pro UltraBook"
    And Je clique sur le bouton search
    Then Je verifie le produit souhaiter "HP Spectre XT Pro UltraBook"
