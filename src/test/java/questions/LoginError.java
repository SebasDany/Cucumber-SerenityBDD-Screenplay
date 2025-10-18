package questions;
import interfaces.SauceDemoInterface;
import net.serenitybdd.screenplay.Question;
public class LoginError {
    public static Question<String> message() {
        return actor -> SauceDemoInterface.ERRORLOGIN.resolveFor(actor).getText();
    }
}
