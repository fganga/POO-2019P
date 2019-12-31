/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author fredy
 */
public class Conexion {
    //Especificamos el driver a utilizar (Según el motor de base de datos)
    private String driver = "com.mysql.jdbc.Driver";
    //Indicamos donde se encuentra el servidor y el nombre de la base de datos
    private String url    = "jdbc:mysql://192.168.59.3:3306/rentacar";
    //Cuenta de usuario de usuario de base de datos
    private String user   = "dba";
    //Contraseña del usuario de base de datos
    private String pwd    = "inacap.2019";

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    
}
