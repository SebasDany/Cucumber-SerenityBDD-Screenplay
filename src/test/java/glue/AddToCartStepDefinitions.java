package glue;

import interfaces.SauceDemoInterface;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.navigation.NavigateTo;
import task.SauceDemoPage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddToCartStepDefinitions {


    @When("{actor} agrega los sguientes productos  al carrito:")
    public void actor_agrega_los_sguientes_productos_al_carrito(Actor actor, io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> filas = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> fila : filas) {
            String producto = fila.get("producto");
            actor.attemptsTo(
                    WaitUntil.the(SauceDemoInterface.productButtonByName(producto), isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(SauceDemoInterface.productButtonByName(producto))
            );
        }
    }

    @Then("{actor} debería ver los productos seleccionados en el carrito")
    public void actor_debería_ver_los_productos_seleccionados_en_el_carrito(Actor actor) {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(SauceDemoPage.selectProducts());
    }
}
