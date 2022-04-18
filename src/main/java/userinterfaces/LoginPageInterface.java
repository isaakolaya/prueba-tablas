package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPageInterface extends PageObject {
    public static final Target INPUT_USER = Target.the("Where do we write the user").
            located(By.cssSelector("#login > form > input.form-control.top"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password").
            located(By.cssSelector("#login > form > input.form-control.bottom"));
    public static final Target ENTER_BUTTON = Target.the("button that confirm the login").
            located(By.className("btn-primary"));
}
