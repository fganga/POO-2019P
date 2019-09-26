/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author fredy
 */
public class Estadistica {
    private int cantidadAlumnos;
    private double promedioEdad;
    private double promedioEstatura;
    private double porcentajeHombres;
    private double porcentajeMujeres;
    private int edadMaxima =0;
    private int estaturaMaxima =0;

    public double getPromedioEdad() {
        return promedioEdad;
    }

    public void setPromedioEdad(double promedioEdad) {
        this.promedioEdad = promedioEdad;
    }

    public double getPromedioEstatura() {
        return promedioEstatura;
    }

    public void setPromedioEstatura(double promedioEstatura) {
        this.promedioEstatura = promedioEstatura;
    }

    public double getPorcentajeHombres() {
        return porcentajeHombres;
    }

    public void setPorcentajeHombres(double porcentajeHombres) {
        this.porcentajeHombres = porcentajeHombres;
    }

    public double getPorcentajeMujeres() {
        return porcentajeMujeres;
    }

    public void setPorcentajeMujeres(double porcentajeMujeres) {
        this.porcentajeMujeres = porcentajeMujeres;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public int getEstaturaMaxima() {
        return estaturaMaxima;
    }

    public void setEstaturaMaxima(int estaturaMaxima) {
        this.estaturaMaxima = estaturaMaxima;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }
    public void calcularPromedioEdad(ArrayList<Alumno> listaAlumnos){
        int suma=0;
        for(int i=0;i< listaAlumnos.size();i++){
            suma = suma + listaAlumnos.get(i).getEdad();
        }
        this.promedioEdad = (double)suma/listaAlumnos.size();
    }
    public void calcularPromedioEstatura(ArrayList<Alumno> listaAlumnos){
        int suma=0;
        for(int i=0;i< listaAlumnos.size();i++){
            suma = suma + listaAlumnos.get(i).getEstatura();
        }
        this.promedioEstatura = (double)suma/listaAlumnos.size();
    }
    public void calcularPorcentajeHombres(ArrayList<Alumno> listaAlumnos){
        int contador =0;
        for(int i=0;i< listaAlumnos.size();i++){
            if(listaAlumnos.get(i).getGenero().equals("M")){
                contador++;
            }
        }
        this.porcentajeHombres = (double)(100* contador)/listaAlumnos.size();  
    }
    public void calcularPorcentajeMujeres(ArrayList<Alumno> listaAlumnos){
        int contador =0;
        for(int i=0;i< listaAlumnos.size();i++){
            if(listaAlumnos.get(i).getGenero().equals("F")){
                contador++;
            }
        }
        this.porcentajeMujeres = (double)(100* contador)/listaAlumnos.size();  
    }
    
    
}
