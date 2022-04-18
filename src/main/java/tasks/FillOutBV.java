package tasks;

import model.TablaDatosFeature;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.FormBV;
import util.PersonalMethods;

public class FillOutBV implements Task {
    private TablaDatosFeature tablaDatosFeature;

    private PersonalMethods personalMethods;

    public FillOutBV(TablaDatosFeature tablaDatosFeature) {
        this.tablaDatosFeature = tablaDatosFeature;
    }

    public static FillOutBV FormBV(TablaDatosFeature tablaDatosFeature) {
        return Tasks.instrumented(FillOutBV.class, tablaDatosFeature);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        personalMethods.clickJS("document.querySelector('#content > div > div > div:nth-child(2) > div > div > header > div.toolbar > nav > a.btn.btn-danger.btn-xs.close-box > i')");
        actor.attemptsTo(Enter.theValue(tablaDatosFeature.getRequired()).into(FormBV.INPUT_REQUIRED)
                ,Enter.theValue(tablaDatosFeature.getEmail()).into(FormBV.INPUT_EMAIL)
                ,Enter.theValue(tablaDatosFeature.getPass()).into(FormBV.INPUT_PASS)
                ,Enter.theValue(tablaDatosFeature.getCpass()).into(FormBV.INPUT_CONFIRM_PASS)
                ,Enter.theValue(tablaDatosFeature.getDate()).into(FormBV.INPUT_DATE)
                ,Enter.theValue(tablaDatosFeature.getUrl()).into(FormBV.INPUT_URL)
                ,Enter.theValue(tablaDatosFeature.getDigits()).into(FormBV.INPUT_DIGITS)
                ,Enter.theValue(tablaDatosFeature.getRange()).into(FormBV.INPUT_RANGE)
                , Click.on(FormBV.INPUT_CHECK)
                ,Click.on(FormBV.BTN_VALIDATE)
        );
    }
}
