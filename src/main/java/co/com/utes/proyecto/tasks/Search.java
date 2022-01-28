package co.com.utes.proyecto.tasks;

import co.com.utes.proyecto.userinterface.SearchTheLargest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import  net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Search  implements Task {
    private String City;


    public Search(String City){
        this.City = City;


    }

    public static  Search the(String City){
        return Tasks.instrumented(Search.class,City);
    }





    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(SearchTheLargest.BUTTON_CITY),
                Enter.theValue(City).into(SearchTheLargest.INPUT_CITY),
                Click.on(SearchTheLargest.BUTTON_CITY2),
                Enter.theValue("507").into(SearchTheLargest.INPUT_COD),
                //Enter.theValue(City).into(SearchTheLargest.INPUT_CITY3),

               // Click.on(SearchTheLargest.BUTTON_COUN),
               // Enter.theValue("Panama").into(SearchTheLargest.BUTTON_COUN2),

                Click.on(SearchTheLargest.BUTTON_NEXTD),
                Click.on(SearchTheLargest.BUTTON_NEXTL),
                Enter.theValue("Sanchezyeyo1996%").into(SearchTheLargest.INPUT_P),
                Enter.theValue("Sanchezyeyo1996%").into(SearchTheLargest.INPUT_PC),
               Click.on(SearchTheLargest.BUTTON_IN),
                Click.on(SearchTheLargest.BUTTON_TU),
                Click.on(SearchTheLargest.BUTTON_PP),
                Click.on(SearchTheLargest.BUTTON_COMPLETE)




        );

    }
}
