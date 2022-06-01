package co.com.chourcair.testing.analistatesting.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class UtestRegisterPage extends PageObject {
    public static final Target JoinToday = Target.the("Selecciona los cursos").located(By.xpath("//*[@id=\"unauthenticated-dropdown-nav\"]/ul/li[6]/a"));
    public static final Target FirstName = Target.the("Escribe cual es el curso").located(By.id("firstName"));
    public static final Target LastName = Target.the("Iniciar la busqueda").located(By.id("lastName"));
    public static final Target Email = Target.the("Seleccionar el resultado de la busqueda").located(By.id("email"));//xpath("//*[@id=\"yui_3_17_2_1_1653658767109_283\"]"));
    public static final Target DD_DATE = Target.the("Extrae el nombre del curso").located(By.id("birthMonth"));
    public static final Target MM_DATE = Target.the("Extrae el nombre del curso").located(By.id("birthDay"));
    public static final Target YY_DATE = Target.the("Extrae el nombre del curso").located(By.id("birthYear"));
    public static final Target Next1 = Target.the("Extrae el nombre del curso").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));


    public static final Target City = Target.the("Escribe cual es el curso").located(By.id("coursesearchbox"));//.xpath("//*[@id=\"coursesearchbox\"]"));
    public static final Target Zip = Target.the("Iniciar la busqueda").located(By.id("yui_3_17_2_1_1653658374939_20"));//.xpath("//*[@id=\"yui_3_17_2_1_1653658374939_20\"]/button"));
    public static final Target Country = Target.the("Seleccionar el resultado de la busqueda").located(By.id("yui_3_17_2_1_1653658767109_283"));//xpath("//*[@id=\"yui_3_17_2_1_1653658767109_283\"]"));
    public static final Target Next2 = Target.the("Extrae el nombre del curso").located(By.xpath("//*[@id=\"region-main\"]/div/div[1]/div/div[1]/h3/a"));


    public static final Target ComputerOS = Target.the("Extrae el nombre del curso").located(By.xpath("//*[@id=\"region-main\"]/div/div[1]/div/div[1]/h3/a"));
    public static final Target Version = Target.the("Extrae el nombre del curso").located(By.xpath("//*[@id=\"region-main\"]/div/div[1]/div/div[1]/h3/a"));
    public static final Target Languaje = Target.the("Extrae el nombre del curso").located(By.xpath("//*[@id=\"region-main\"]/div/div[1]/div/div[1]/h3/a"));
    public static final Target Next3 = Target.the("Extrae el nombre del curso").located(By.xpath("//*[@id=\"region-main\"]/div/div[1]/div/div[1]/h3/a"));

    public static final Target Pass1 = Target.the("Extrae el nombre del curso").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[2]/input"));
    public static final Target Pass2 = Target.the("Extrae el nombre del curso").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[1]/input"));
    public static final Target click1 = Target.the("Extrae el nombre del curso").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/input"));
    public static final Target click2 = Target.the("Extrae el nombre del curso").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/input"));
    public static final Target click3 = Target.the("Extrae el nombre del curso").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/input"));
    public static final Target Next4 = Target.the("Extrae el nombre del curso").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}
