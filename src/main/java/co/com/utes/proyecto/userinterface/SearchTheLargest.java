package co.com.utes.proyecto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchTheLargest extends PageObject {

    public static final Target BUTTON_CITY = Target.the("Button City")
     .located(By.id("city"));
    public static final Target INPUT_CITY = Target.the("Entry City")
     .located(By.id("city"));
    public static final Target BUTTON_CITY2 = Target.the("Button City2")
            .located(By.id("city"));

     public static Target INPUT_COD = Target.the("Entry Postal Code")
             .located(By.id("zip"));
    //public static final Target BUTTON_COUN = Target.the("selecciona la uviversidad choucair")
      //     .located(By.className("ui-select"));
   // public static final Target INPUT_CITY3 = Target.the("selecciona la uviversidad choucair")
     //       .located(By.className("ui-select"));

    public static final Target BUTTON_NEXTD = Target.the("Button Next: Devices")
            .located(By.xpath("//span[contains(text(),'Next: Devices')]"));
    public static final Target BUTTON_NEXTL = Target.the("Button Next: Last Step")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

    public static final Target INPUT_P = Target.the("Entry Password")
            .located(By.id("password"));
    public static final Target INPUT_PC = Target.the("Entry confirm Password")
            .located(By.id("confirmPassword"));
    public static final Target BUTTON_IN = Target.the("Botton to receive information")
           .located(By.className("input-check-box"));
    public static final Target BUTTON_TU = Target.the("Botton to accept the terms of use of uTest")
           .located(By.xpath("//label[contains(text(),'I have read and accept the')]"));
    public static final Target BUTTON_PP = Target.the("Botton to accept the privacy policies of uTest")
      .located(By.name("privacySetting"));

    public static final Target BUTTON_COMPLETE = Target.the("Boton de Complete Setup")
            .located(By.id("laddaBtn"));



















}