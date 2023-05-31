package co.dafeed.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
public class AbrirWeb implements Task{
    private co.dafeed.userinterface.PaginaWeb PaginaWeb;
    public static AbrirWeb thePage() {
        return Tasks.instrumented(AbrirWeb.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(PaginaWeb));
    }
}
