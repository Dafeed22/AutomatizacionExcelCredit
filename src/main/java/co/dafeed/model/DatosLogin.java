package co.dafeed.model;

public class DatosLogin {
    public String getTextoContrasena() {
        return textoContrasena;
    }

    public void setTextoContrasena(String textoContrasena) {
        this.textoContrasena = textoContrasena;
    }

    public String getTextoUsuario() {
        return textoUsuario;
    }

    public void setTextoUsuario(String textoUsuario) {
        this.textoUsuario = textoUsuario;
    }

    private String textoContrasena;

    private String textoUsuario;
}
