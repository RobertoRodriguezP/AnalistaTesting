package co.com.chourcair.testing.analistatesting.tasks;

import  co.com.chourcair.testing.analistatesting.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUps implements Task {
    private UtestPage UtestPage;
    public static Performable ThePage() {
        return Tasks.instrumented(OpenUps.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(UtestPage));

    }
}
