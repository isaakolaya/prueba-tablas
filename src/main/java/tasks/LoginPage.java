package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginPageInterface;

public class LoginPage implements Task {
    public static Performable page() {
        return Tasks.instrumented(LoginPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("demo").into(LoginPageInterface.INPUT_USER),
                Enter.theValue("demo").into(LoginPageInterface.INPUT_PASSWORD),
                Click.on(LoginPageInterface.ENTER_BUTTON));
    }
}
