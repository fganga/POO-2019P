/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fredy
 */
public class Operacion {
    //Crear objeto de la clase conexión
    Conexion conexion = new Conexion();
    
    //Creamos método para consultar datos (SELECT)
    public ResultSet listar(String operacion){
        //Implementamos un manejo de excepciones
        try{
            //Creamos una nueva instancia de clase Conexion
            Class.forName(conexion.getDriver()).newInstance();
            //Creamos un objeto de clase Connection
            Connection connection = DriverManager.getConnection(conexion.getUrl(),conexion.getUser(),conexion.getPwd());
            //Preparamos la instrucción SQL a ejecutar
            PreparedStatement preparedStatement = connection.prepareStatement(operacion);
            //Ejecutamos la consulta
            ResultSet resultset = preparedStatement.executeQuery();
            //Retornamos el resultset con los datos obtenidos
            return resultset;
        }catch(Exception excepcion){
            javax.swing.JOptionPane.showMessageDialog(null,"Se ha producido un error :"+excepcion.getMessage());
            return null;
           
        }
    }
    //Método para insertar (insert...), actualizar (update...) o eliminar (delete ...).
    public void ejecutar(String operacion){
        try{
             //Creamos una nueva instancia de clase Conexion
            Class.forName(conexion.getDriver()).newInstance();
            //Creamos un objeto de clase Connection
            Connection connection = DriverManager.getConnection(conexion.getUrl(),conexion.getUser(),conexion.getPwd());
             //Preparamos la instrucción SQL a ejecutar
            PreparedStatement preparedStatement = connection.prepareStatement(operacion);
            //Ejecutamos la operación de manipulación de datos
            int filasAfectadas = preparedStatement.executeUpdate();
            //Mostramos un mensaje indicando el resultado de la operación
            javax.swing.JOptionPane.showMessageDialog(null,"Operación ejecutada correctamente. Filas afectadas :"+filasAfectadas);
            
            
        }catch(SQLException excepcion){
            javax.swing.JOptionPane.showMessageDialog(null,"Se ha producido un error :"+excepcion.getMessage());
            
        } catch (ClassNotFoundException excepcion) {
            javax.swing.JOptionPane.showMessageDialog(null,"Se ha producido un error :"+excepcion.getMessage());
        } catch (InstantiationException excepcion) {
            javax.swing.JOptionPane.showMessageDialog(null,"Se ha producido un error :"+excepcion.getMessage());
        } catch (IllegalAccessException excepcion) {
            javax.swing.JOptionPane.showMessageDialog(null,"Se ha producido un error :"+excepcion.getMessage());
        }
    }
    
    
}
