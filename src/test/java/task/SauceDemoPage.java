package task;

import interfaces.SauceDemoInterface;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SauceDemoPage {

    public static Performable login( String usuario, String password) {

        return Task.where(

                WaitUntil.the(SauceDemoInterface.USERNAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(usuario).into(SauceDemoInterface.USERNAME),
                WaitUntil.the(SauceDemoInterface.PASSWORD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(password).into(SauceDemoInterface.PASSWORD),
                WaitUntil.the(SauceDemoInterface.LOGINBUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(SauceDemoInterface.LOGINBUTTON)
        );

    }


    public static Performable selectProducts() {

        return Task.where(

                WaitUntil.the(SauceDemoInterface.VIEWCAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(SauceDemoInterface.VIEWCAR),
                WaitUntil.the(SauceDemoInterface.CHECKOUT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(SauceDemoInterface.CHECKOUT)

        );
    }

    public static Performable completeBuy(String firstName, String lastName, String postalCode) {

        return Task.where(

                WaitUntil.the(SauceDemoInterface.FIRSTNAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(firstName).into(SauceDemoInterface.FIRSTNAME),

                WaitUntil.the(SauceDemoInterface.LASTNAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(lastName).into(SauceDemoInterface.LASTNAME),

                WaitUntil.the(SauceDemoInterface.POSTALCODE, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(postalCode).into(SauceDemoInterface.POSTALCODE),

                WaitUntil.the(SauceDemoInterface.CONTINUE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(SauceDemoInterface.CONTINUE),

                WaitUntil.the(SauceDemoInterface.FINISH, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(SauceDemoInterface.FINISH)



        );

    }

}
