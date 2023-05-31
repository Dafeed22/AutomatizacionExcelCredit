package co.dafeed.tasks;

import co.dafeed.userinterface.SelectoresPaginaWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Sesion implements Task {
    private String textoUsuario;
    private String textoContrasena;

    public Sesion(String textoUsuario, String textoContrasena) {
        this.textoUsuario = textoUsuario;
        this.textoContrasena = textoContrasena;
    }

    public static Sesion onThePage(String textoUsuario, String textoContrasena) {
        return Tasks.instrumented(Sesion.class , textoUsuario,textoContrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(textoUsuario).into(SelectoresPaginaWeb.TXT_USUARIO),
                Enter.theValue(textoContrasena).into(SelectoresPaginaWeb.TXT_CONTRASENA),
                Click.on(SelectoresPaginaWeb.BOTON_LOGIN),
                Click.on(SelectoresPaginaWeb.BOTON_ADD),
                Click.on(SelectoresPaginaWeb.BOTON_ADD1),
                Click.on(SelectoresPaginaWeb.BOTON_ADD2),
                Click.on(SelectoresPaginaWeb.BOTON_ADD3),
                Click.on(SelectoresPaginaWeb.BOTON_ADD4),
                Click.on(SelectoresPaginaWeb.BOTON_ADD5)





        );

    }
}
