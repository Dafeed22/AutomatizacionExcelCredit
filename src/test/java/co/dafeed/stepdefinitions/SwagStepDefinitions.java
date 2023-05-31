package co.dafeed.stepdefinitions;

import co.dafeed.model.DatosLogin;
import co.dafeed.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
public class SwagStepDefinitions {
    @Before
    public void InicioLoginStepDefintios () {

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Ingresa Datos Login$")
    public void IngresaDatosLogin(List <DatosLogin> datosLogin) throws Exception {
        OnStage.theActorCalled("usuario").wasAbleTo(AbrirWeb.thePage(),Sesion.
                onThePage(datosLogin.get(0).getTextoUsuario(),
                        datosLogin.get(0).getTextoContrasena())
        );
    }

}
