package glue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import questions.PageTitle;
import starter.navigation.NavigateTo;
import task.SauceDemoPage;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CheckoutStepDefinitions {

    @When("{actor} completa el checkout con {string} {string} {string}")
    public void actor_completa_el_checkout_con(Actor actor, String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(SauceDemoPage.completeBuy(string, string2,string3));
    }

    @Then("{actor} debería ver el mensaje de confirmación {string}")
    public void actor_debería_ver_el_mensaje_de_confirmación(Actor actor, String string) {
        // Write code here that turns the phrase above into concrete actions
        actor.should(seeThat(PageTitle.completeBuy(), equalTo(string)));

    }
}
