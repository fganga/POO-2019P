/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author fredy 
 */
public class Color {
    private int idColorVehiculo;
    private String nombreColor;
    private Date fechaRegistro;
    private int usuarioRegistro;

    public Color(int idColorVehiculo, String nombreColor) {
        this.idColorVehiculo = idColorVehiculo;
        this.nombreColor = nombreColor;
    }

    public int getIdColorVehiculo() {
        return idColorVehiculo;
    }

    public void setIdColorVehiculo(int idColorVehiculo) {
        this.idColorVehiculo = idColorVehiculo;
    }

    public String getNombreColor() {
        return nombreColor;
    }

    public void setNombreColor(String nombreColor) {
        this.nombreColor = nombreColor;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(int usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }
    
}
