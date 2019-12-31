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
public class TipoCarroceria {
    private int idTipoCarroceria;
    private String nombreTipoCarroceria;
    private Date fechaRegistro;
    private int usuarioRegistro;

    public TipoCarroceria(int idTipoCarroceria, String nombreTipoCarroceria) {
        this.idTipoCarroceria = idTipoCarroceria;
        this.nombreTipoCarroceria = nombreTipoCarroceria;
    }

    public int getIdTipoCarroceria() {
        return idTipoCarroceria;
    }

    public void setIdTipoCarroceria(int idTipoCarroceria) {
        this.idTipoCarroceria = idTipoCarroceria;
    }

    public String getNombreTipoCarroceria() {
        return nombreTipoCarroceria;
    }

    public void setNombreTipoCarroceria(String nombreTipoCarroceria) {
        this.nombreTipoCarroceria = nombreTipoCarroceria;
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
