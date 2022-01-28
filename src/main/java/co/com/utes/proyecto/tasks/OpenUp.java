package co.com.utes.proyecto.tasks;


import co.com.utes.proyecto.userinterface.TheLargestCommunityPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {


    private TheLargestCommunityPage theLargestCommunityPagePage;

    public static OpenUp thePage() {
return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

actor.attemptsTo(Open.browserOn(theLargestCommunityPagePage));
    }
}
