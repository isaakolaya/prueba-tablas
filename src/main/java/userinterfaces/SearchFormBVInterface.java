package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchFormBVInterface extends PageObject {
    public static final Target BUTTON_MENU = Target.the("click menu").
            located(By.xpath("//span[contains(text(),'Forms')]"));
    public static final Target BUTTON_SUBMENU = Target.the("click submenu").
            located(By.cssSelector("#menu > li.active > ul > li:nth-child(2) > a"));
}
