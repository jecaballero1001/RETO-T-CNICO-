package co.com.utes.proyecto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class TheLargestCommunityPageLoginPage  extends PageObject {
    public static final Target BUTTON_JOIN = Target.the("Button tha shows us the form to Join Today")
            .located(By.linkText("Join Today"));
    public static final Target INPUT_FIRSTNAME = Target.the("First Name Entry")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Entry of the first surname")
            .located(By.name("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Entry email")
            .located(By.id("email"));
    public static final Target BUTTON_MONTH = Target.the("ButtonMONTH")
            .located(By.id("birthMonth"));
    public static final Target BUTTON_MONTH2 = Target.the("Button MONTH2")
            .located(By.xpath("//option[contains(text(),'December')]"));
    public static final Target BUTTON_BIRTHDAY = Target.the("Button BIRTHDAY")
            .located(By.id("birthDay"));
    public static final Target BUTTON_BIRTHDAY2 = Target.the("Button BIRTHDAY2")
            .located(By.xpath("//option[contains(text(),'1')]"));
    public static final Target BUTTON_YEAR = Target.the("Button YEAR")
            .located(By.id("birthYear"));
    public static final Target BUTTON_YEAR2 = Target.the("Button YEAR2")
            .located(By.xpath("//option[contains(text(),'1996')]"));
    public static final Target BUTTON_NEXT = Target.the("Button Next: Location")
            .located(By.xpath("//span[contains(text(),'Next: Location')]"));








}
