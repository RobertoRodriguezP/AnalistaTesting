package co.com.chourcair.testing.analistatesting.tasks;

import co.com.chourcair.testing.analistatesting.userinterface.UtestPage;
import co.com.chourcair.testing.analistatesting.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {

    public static Performable OnThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.JoinToday),
        Enter.theValue("").into(UtestRegisterPage.FirstName),
                Enter.theValue("").into(UtestRegisterPage.LastName)
        );


    }
}
