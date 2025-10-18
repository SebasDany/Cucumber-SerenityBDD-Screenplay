package questions;
import net.serenitybdd.screenplay.Question;
import interfaces.SauceDemoInterface;

public class PageTitle {
    public static Question<String> is() {
        return actor -> SauceDemoInterface.TITLE.resolveFor(actor).getText();

    }
    public static Question<String> completeBuy() {
        return actor -> SauceDemoInterface.CONFIRMMESSAGE.resolveFor(actor).getText();

    }
}
