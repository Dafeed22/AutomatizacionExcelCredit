package co.dafeed.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class SelectoresPaginaWeb {
    public static final Target TXT_USUARIO = Target.the("Donde escribimos el usuario").located(By.id("user-name"));
    public static final Target TXT_CONTRASENA = Target.the("Donde escribimos la contrasena").located(By.id("password"));
    public static final Target BOTON_LOGIN = Target.the("Boton para Iniciar sesion").located(By.id("login-button"));
    public static final Target BOTON_ADD = Target.the("Boton para agregar producto al carrito").located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target BOTON_ADD1 = Target.the("Boton para agregar producto al carrito").located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target BOTON_ADD2 = Target.the("Boton para agregar producto al carrito").located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    public static final Target BOTON_ADD3 = Target.the("Boton para agregar producto al carrito").located(By.id("add-to-cart-sauce-labs-fleece-jacket"));

    public static final Target BOTON_ADD4 = Target.the("Boton para agregar producto al carrito").located(By.id("add-to-cart-sauce-labs-onesie"));
    public static final Target BOTON_ADD5 = Target.the("Boton para agregar producto al carrito").located(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
}
