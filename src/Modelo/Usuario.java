
package Modelo;


public class Usuario {
    private String nombre;
    private String usuario;
    private String contraseña;
    private String permisos;

    public Usuario(String nombre, String usuario, String contraseña, String permisos) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.permisos = permisos;
    }
    
    public Usuario (){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }
    
    
    public void login(String id){
        
    }
    
}
