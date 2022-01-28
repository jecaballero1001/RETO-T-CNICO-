package co.com.utes.proyecto.tasks;


import co.com.utes.proyecto.userinterface.TheLargestCommunityPageLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class Login implements Task {

    private TheLargestCommunityPageLoginPage theLargestCommunityPageLoginPage;

    public static Login onThePage() {

        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(theLargestCommunityPageLoginPage.BUTTON_JOIN),
                Enter.theValue("Jesus").into(theLargestCommunityPageLoginPage.INPUT_FIRSTNAME),
                Enter.theValue("Caballero").into(theLargestCommunityPageLoginPage.INPUT_LASTNAME),
                Enter.theValue("jesuscaballero1001@gmail.com").into(theLargestCommunityPageLoginPage.INPUT_EMAIL),
                Click.on(theLargestCommunityPageLoginPage.BUTTON_MONTH),
                Click.on(theLargestCommunityPageLoginPage.BUTTON_MONTH2),
                Click.on(theLargestCommunityPageLoginPage.BUTTON_BIRTHDAY),
                Click.on(theLargestCommunityPageLoginPage.BUTTON_BIRTHDAY2),
                Click.on(theLargestCommunityPageLoginPage.BUTTON_YEAR),
                Click.on(theLargestCommunityPageLoginPage.BUTTON_YEAR2),
                Click.on(theLargestCommunityPageLoginPage.BUTTON_NEXT)









        );

    }
}
