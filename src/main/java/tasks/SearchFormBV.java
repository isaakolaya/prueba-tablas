package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.SearchFormBVInterface;

public class SearchFormBV implements Task {
    public static SearchFormBV formBV() {
        return Tasks.instrumented(SearchFormBV.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchFormBVInterface.BUTTON_MENU)
                ,Click.on(SearchFormBVInterface.BUTTON_SUBMENU)
        );
    }
}
