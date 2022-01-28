package co.com.utes.proyecto.questions;

import co.com.utes.proyecto.tasks.Search;
import co.com.utes.proyecto.userinterface.SearchTheLargest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer (String question){

        this.question = question;

    }


    public static Answer toThe(String question){

      return null;

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String City = Text.of(SearchTheLargest.INPUT_CITY).viewedBy(actor).asString();
        if (question.equals(City)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
;