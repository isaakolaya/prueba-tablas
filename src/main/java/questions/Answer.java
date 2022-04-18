package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.FormBV;

public class Answer implements Question<Boolean> {

    public static Question<Boolean> toThe() {
        return new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String question = "Block Validation";
        String nameCourse = Text.of(FormBV.NAME_QUESTION).viewedBy(actor).asString();

        if (question.equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
