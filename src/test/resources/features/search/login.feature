@login
Feature: Login en SauceDemo

  Scenario Outline: Usuario inicia sesión correctamente
    Given que <actor> está en la página de login
    When <actor> inicia sesión con "<username>" y "<password>"
    Then <actor> debería ver la página de productos
    When <actor> agrega los sguientes productos  al carrito:
      | producto               |
      | add-to-cart-sauce-labs-backpack    |
      | add-to-cart-sauce-labs-fleece-jacket |
    Then <actor> debería ver los productos seleccionados en el carrito
    When <actor> completa el checkout con "<firstmane>" "<lastname>" "<postalcode>"
    Then <actor> debería ver el mensaje de confirmación "Thank you for your order!"
    Examples:
      | actor | username      | password      |  firstmane | lastname| postalcode|
      | Sebas | standard_user | secret_sauce  |  Sebas | guandinango | 17523  |



  Scenario Outline: Usuario intenta iniciar sesión con credenciales inválidas
    Given que <actor> está en la página de login
    When <actor> inicia sesión con "<username>" y "<password>"
    Then <actor> debería ver el mensaje de error "<mensajeError>"

    Examples:
      | actor | username    | password | mensajeError                                                             |
      | Sebas | wrong_user  | 12345    | Epic sadface: Username and password do not match any user in this service |
      | Sebas |             | secret   | Epic sadface: Username is required                                        |
