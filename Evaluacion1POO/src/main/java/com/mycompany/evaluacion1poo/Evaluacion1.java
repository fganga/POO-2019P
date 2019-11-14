/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.evaluacion1poo;

import clases.Alumno;
import clases.Estadistica;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class Evaluacion1 {

    /**
     * @param args the command line arguments
     */
    //Declaraciones globales. Pueden usarse en cualquier método.
    static ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
    
    public static void main(String[] args) {
        String respuesta;
        //Creamos un objeto de la clase Estadistica
        //<Clase> <nombreObjeto> = new <constructor>
        do{
            Estadistica estadistica = new Estadistica();
            solicitarCantidadAlumnos();
            //Capturamos la cantidad de alumnos y la asignamos a la propiedad del objeto
            estadistica.setCantidadAlumnos(capturarCantidadAlumnos());

            //Solicitamos los datos de los alumnos
            solicitarYAlmacenarDatos(estadistica);
            //Mostramos valor ingresados al ArrayList listaAlumnos
            //mostrarDatos();

            estadistica.calcularPromedioEdad(listaAlumnos);
            estadistica.calcularPromedioEstatura(listaAlumnos);
            estadistica.calcularPorcentajeHombres(listaAlumnos);
            
            mostrarPromedioEdad(estadistica);
            mostrarPromedioEstatura(estadistica);
            mostrarPorcentajeHombres(estadistica);
            mostrarConsulta();
           
            respuesta = capturarRespuesta();
            
            listaAlumnos.clear();
        }while(respuesta.equals("s"));
        mostrarFin(); 
    }

    private static void solicitarCantidadAlumnos() {
         System.out.print("Ingrese cantidad de alumnos:");
    }
    private static int capturarCantidadAlumnos(){
        
        Scanner scanner = new Scanner(System.in);
        //Declaración de variable local. Nace y muere aquí.
        int cantidadAlumnos = scanner.nextInt();
        return cantidadAlumnos;
    }

    private static void solicitarYAlmacenarDatos(Estadistica estadistica) {
        
        //Efectuamos una iteración para solicitar y almacenar datos
        for(int i =0; i < estadistica.getCantidadAlumnos();i++){
            //Creamos objeto de la clase alumno
            Alumno alumno = new Alumno();
            //Solicitamos nombre
            solicitarNombre();
            //Capturamos el nombre
            String nombre = capturarNombre();
            //A la propiedad nombre del objeto asociamos el dato capturado
            alumno.setNombre(nombre);
            //Efectuamos las siguientes capturas
            solicitarEdad();
            int edad = capturarEdad();
            alumno.setEdad(edad);
            
            solicitarEstatura();
            int estatura = capturarEstatura();
            alumno.setEstatura(estatura);
            
            solicitarGenero();
            String genero = capturarGenero();
            alumno.setGenero(genero);
            //Incorporamos el objeto al ArrayList llamado listaAlumnos
            listaAlumnos.add(alumno);
            
            
        }
    }
    private static void solicitarNombre() {
        System.out.print("Ingrese nombre :");
    }
    private static String capturarNombre() {
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        return nombre;
    }
     private static void solicitarEdad() {
        System.out.print("Ingrese edad :");
    }

    private static int capturarEdad() {
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();
        return edad;
    }

    private static void solicitarEstatura() {
        System.out.print("Ingrese estatura :");
    }

    private static int capturarEstatura() {
        Scanner scanner = new Scanner(System.in);
        int estatura = scanner.nextInt();
        return estatura; 
    }

    private static void solicitarGenero() {
        System.out.print("Ingrese género :");
    }

    private static String capturarGenero() {
        Scanner scanner = new Scanner(System.in);
        String genero = scanner.nextLine();
        return genero;  
    }

    private static void mostrarDatos() {
    //Obtenemos el tamaño del ArrayList
    int tamano = listaAlumnos.size();
        //Mostramos los valores del arraylist
        for(int i=0;i < tamano;i++ ){
            System.out.println("Nombre :"+ listaAlumnos.get(i).getNombre());
        }
    }

    private static void mostrarPromedioEdad(Estadistica estadistica) {
        System.out.println("Promedio de edad :"+estadistica.getPromedioEdad());
    }
    private static void mostrarPromedioEstatura(Estadistica estadistica) {
        System.out.println("Promedio de estatura :"+estadistica.getPromedioEstatura());
    }

    private static void mostrarPorcentajeHombres(Estadistica estadistica) {
        System.out.println("Porcentaje hombres :" + estadistica.getPorcentajeHombres());
    }

    private static void mostrarConsulta() {
        System.out.println("¿Desea calcular nuevamente?");
    }

    private static String capturarRespuesta() {
         String respuesta;
         Scanner scanner = new Scanner(System.in);
         respuesta = scanner.nextLine();
         return respuesta;
    }

    private static void mostrarFin() {
        System.out.println("Programa Finalizado");
    }
}
