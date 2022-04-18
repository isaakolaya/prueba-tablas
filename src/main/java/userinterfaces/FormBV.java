package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormBV extends PageObject {
    public static final Target INPUT_REQUIRED = Target.the("Where do we write the ").
            located(By.id("required2"));
    public static final Target INPUT_EMAIL = Target.the("Where do we write the ").
            located(By.id("email2"));
    public static final Target INPUT_PASS = Target.the("Where do we write the ").
            located(By.cssSelector("#password2"));
    public static final Target INPUT_CONFIRM_PASS = Target.the("Where do we write the ser").
            located(By.cssSelector("#confirm_password2"));
    public static final Target INPUT_DATE = Target.the("Where do we write the ").
            located(By.id("date2"));
    public static final Target INPUT_URL = Target.the("Where do we write the ").
            located(By.id("url2"));
    public static final Target INPUT_DIGITS = Target.the("Where do we write the ").
            located(By.cssSelector("#digits"));
    public static final Target INPUT_RANGE = Target.the("Where do we write the ").
            located(By.cssSelector("#range"));
    public static final Target INPUT_CHECK = Target.the(" ").
            located(By.id("agree2"));
    public static final Target BTN_VALIDATE = Target.the(" ").
            located(By.xpath("//*[@id='block-validate']/div[10]/input"));
    public static final Target NAME_QUESTION = Target.the("extract Question")
            .located(org.openqa.selenium.By.xpath("//h5[contains(text(),'Block Validation')]"));
}
