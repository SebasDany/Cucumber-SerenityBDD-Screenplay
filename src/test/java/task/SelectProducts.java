package task;


import interfaces.SauceDemoInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Arrays;
import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectProducts implements Task {

    private final List<String> productos;

    public SelectProducts(List<String> productos) {
        this.productos = productos;
    }

    public static SelectProducts with(String... productos) {
        return new SelectProducts(Arrays.asList(productos));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (String producto : productos) {
            actor.attemptsTo(
                    WaitUntil.the(SauceDemoInterface.productButtonByName(producto), isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(SauceDemoInterface.productButtonByName(producto))
            );
        }

       // actor.attemptsTo(
              //  WaitUntil.the(ProductPage.CART_BTN, isVisible()).forNoMoreThan(10).seconds(),
            //    Click.on(ProductPage.CART_BTN),
              //  WaitUntil.the(ProductPage.CHECKOUT_BTN, isVisible()).forNoMoreThan(10).seconds(),
              //  Click.on(ProductPage.CHECKOUT_BTN)
       // );
    }
}
