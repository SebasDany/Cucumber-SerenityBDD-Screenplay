package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import questions.LoginError;
import questions.PageTitle;
import starter.navigation.NavigateTo;
import task.SauceDemoPage;

import javax.xml.transform.Source;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinitions {

    @Given("que {actor} está en la página de login")
    public void usuario_en_pagina_login(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }

    @When("{actor} inicia sesión con {string} y {string}")
    public void inicia_sesion(Actor actor, String username, String password) {
        actor.attemptsTo(SauceDemoPage.login(username, password));
    }

    // ✅ Escenario de login exitoso
    @Then("{actor} debería ver la página de productos")
    public void deberia_ver_pagina_productos(Actor actor) {
        actor.should(seeThat(PageTitle.is(), equalTo("Products")));
    }

    // ✅ Escenario de login fallido
    @Then("{actor} debería ver el mensaje de error {string}")
    public void deberia_ver_mensaje_error(Actor actor, String mensajeEsperado) {
        actor.should(seeThat(LoginError.message(), equalTo(mensajeEsperado)));
    }

}
