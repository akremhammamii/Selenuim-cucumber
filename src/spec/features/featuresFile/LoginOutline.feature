@login-multiUsers
Feature: Je souhaite me connecter avec plusieurs comptes

  @login-multiUsers
  Scenario Outline: Je souhaite me connecter avec plusieurs comptes
    Given Je visite le site nopecommerce
    When Je saisie adresse mail "<email>"
    When Je saisie un mot de passe "<password>"
    When Je clique sur le bouton login

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |
      | akrem@gmail.com     | akrem    |
      | olfa@gmail.com      | olfa     |
      | ahmed@gmail.com     | ahmed    |
