package interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SauceDemoInterface {
    public static Target  USERNAME = Target.the("user-name").located(By.id("user-name"));
    public static Target PASSWORD = Target.the("password").located(By.id("password"));
    public static Target  LOGINBUTTON = Target.the("login-button").located(By.id("login-button"));
    public static Target SELECT_PRODUCT1 = Target.the("select product1").located(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
    public static Target SELECT_PRODUCT2 = Target.the("select product1").located(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
    public static Target VIEWCAR = Target.the("view cart").located(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
    public static Target  CHECKOUT = Target.the("checkout").located(By.id("checkout"));
    public static Target FIRSTNAME = Target.the("first-name").located(By.id("first-name"));
    public static Target  LASTNAME = Target.the("last-name").located(By.id("last-name"));
    public static Target POSTALCODE = Target.the("postal-code").located(By.id("postal-code"));
    public static Target CONTINUE = Target.the("continue").located(By.id("continue"));
    public static Target FINISH = Target.the("finish").located(By.id("finish"));

    public static Target TITLE = Target.the("title").located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

    public static Target ERRORLOGIN = Target.the("error login").located(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
    public static Target CONFIRMMESSAGE = Target.the("confirm message").located(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));

    public static Target productButtonByName(String productName) {
        return

    Target.the("producto "+ productName).located(By.id(productName));

    }
}
