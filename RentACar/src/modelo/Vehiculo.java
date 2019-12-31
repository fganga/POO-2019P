/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Operacion;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 *
 * @author fredy
 */
public class Vehiculo {
    private int idVehiculo;
    private int marca;
    private int tipoVehiculo;
    private int tipoCarroceria;
    private String modelo;
    private int ano;
    private int cilindrada;
    private String patente;
    private int color;
    private int estadoVehiculo;
    private double valorArriendo;
    private int kilometrajeActual;
    private Date fechaRegistro;
    private int usuarioRegistro;

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(int tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(int estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public double getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(double valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public int getKilometrajeActual() {
        return kilometrajeActual;
    }

    public void setKilometrajeActual(int kilometrajeActual) {
        this.kilometrajeActual = kilometrajeActual;
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
    public void agregarVehiculo(){
    //Mostramos valores del vehículo
    //JOptionPane.showMessageDialog(null, "Modelo ->" + this.modelo + " - Año ->" + this.ano + " - Valor Arriendo "+ this.valorArriendo);
        //Generamos la inserción en la tabla de Vehiculo
    //Instrucciones necesarias para insertar el dato en la BD
    Operacion operacion = new Operacion();
    //Definimos la instrucción SQL a enviar
    //Obtenemos fecha
    java.sql.Timestamp fechaHora = new java.sql.Timestamp(new java.util.Date().getTime());
    String sql = "insert into Vehiculo(idMarca,idTipoVehiculo,idTipoCarroceria,modelo,año,cilindrada,patente,idColor,idEstadoVehiculo,valorArriendo,kilometrajeActual,fechaRegistro,usuarioRegistro) values('"+this.marca+"','"+this.tipoVehiculo+"','"+this.tipoCarroceria+"','"+this.modelo+"','"+this.ano+"','"+this.cilindrada+"','"+this.patente+"','"+this.color+"','"+this.estadoVehiculo+"','"+this.valorArriendo+"','"+this.kilometrajeActual+"','"+fechaHora+"','"+this.usuarioRegistro+"')";
    //Ejecutamos la operación contra la base de datos (insertar)
    operacion.ejecutar(sql);
    }
    public void actualizarVehiculo(){
    Operacion operacion = new Operacion();
    //Definimos la instrucción SQL a enviar
    String sql = "update Vehiculo set valorArriendo ='"+this.valorArriendo+"' where idVehiculo ='"+this.idVehiculo+"' ";
    //Ejecutamos la operación contra la base de datos (insertar)
    operacion.ejecutar(sql);
        
    }
    public void eliminarVehiculo(int idVehiculo){
    Operacion operacion = new Operacion();
    String sql = "delete from Vehiculo where idVehiculo = '"+idVehiculo+"'";
    operacion.ejecutar(sql);
        
    }
    public void listarVehiculos(){
        
    }
}
