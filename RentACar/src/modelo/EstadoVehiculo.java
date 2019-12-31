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
public class EstadoVehiculo {
    private int idEstadoVehiculo;
    private String nombreEstadoVehiculo;
    private Date fechaRegistro;
    private int usuarioRegistro;

    public EstadoVehiculo(int idEstadoVehiculo, String nombreEstadoVehiculo) {
        this.idEstadoVehiculo = idEstadoVehiculo;
        this.nombreEstadoVehiculo = nombreEstadoVehiculo;
    }

    public int getIdEstadoVehiculo() {
        return idEstadoVehiculo;
    }

    public void setIdEstadoVehiculo(int idEstadoVehiculo) {
        this.idEstadoVehiculo = idEstadoVehiculo;
    }

    public String getNombreEstadoVehiculo() {
        return nombreEstadoVehiculo;
    }

    public void setNombreEstadoVehiculo(String nombreEstadoVehiculo) {
        this.nombreEstadoVehiculo = nombreEstadoVehiculo;
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
