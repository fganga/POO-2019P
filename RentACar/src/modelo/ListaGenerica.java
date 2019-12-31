/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Operacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;


/**
 *
 * @author fredy
 */
public class ListaGenerica {
    //Obtener diferentes marcas
    public HashMap<String,Integer> generarValoresMarca(){
        //Declaramos HashMap
        HashMap<String, Integer> mapMarca = new HashMap<String, Integer>();
        //Instanciamos clase Operación
        Operacion operacion = new Operacion();
        //Consulta SQL para obtener marcas
        String sql ="SELECT idMarca,nombreMarca FROM Marca";
        //Retornamos resultset
        ResultSet resultSet = operacion.listar(sql);
        
        //Cargamos los valores obtenidos en HashMap
        try {
            //CReamos una variable de objeto para almacenar una marca
            Marca marca;
            //Generamos un ciclo para recorrer el resultset y agregar valores al HashMap
            while(resultSet.next()){
                marca = new Marca(resultSet.getInt(1),resultSet.getString(2));
                //Agregamos el objeto a HashMap
                mapMarca.put(marca.getNombreMarca(),marca.getIdMarca());
            }
            
        }catch(SQLException ex){
             javax.swing.JOptionPane.showMessageDialog(null,"Se ha producido un error :"+ex.getMessage());
           
        }
        //Retornamos el HashMap
        return mapMarca;
    }
    //Obtener diferentes tipos de vehículo
    public HashMap<String,Integer> generarValoresTipoVehiculo(){
        //Declaramos HashMap
        HashMap<String, Integer> mapMarca = new HashMap<String, Integer>();
        //Instanciamos clase Operación
        Operacion operacion = new Operacion();

        String sql ="SELECT idTipoVehiculo,nombreTipovehiculo FROM TipoVehiculo";
        //Retornamos resultset
        ResultSet resultSet = operacion.listar(sql);
        
        //Cargamos los valores obtenidos en HashMap
        try {

            TipoVehiculo tipoVehiculo;
            //Generamos un ciclo para recorrer el resultset y agregar valores al HashMap
            while(resultSet.next()){
                tipoVehiculo = new TipoVehiculo(resultSet.getInt(1),resultSet.getString(2));
                //Agregamos el objeto a HashMap
                mapMarca.put(tipoVehiculo.getNombreTipoVehiculo(),tipoVehiculo.getIdTipoVehiculo());
            }
            
        }catch(SQLException ex){
             javax.swing.JOptionPane.showMessageDialog(null,"Se ha producido un error :"+ex.getMessage());
           
        }
        //Retornamos el HashMap
        return mapMarca;
    }
    //Obtener diferentes tipos de carroceria
    public HashMap<String,Integer> generarValoresTipoCarroceria(){
        //Declaramos HashMap
        HashMap<String, Integer> mapTipoCarroceria = new HashMap<String, Integer>();
        //Instanciamos clase Operación
        Operacion operacion = new Operacion();

        String sql ="SELECT idTipoCarroceria,nombreTipoCarroceria FROM TipoCarroceria";
        //Retornamos resultset
        ResultSet resultSet = operacion.listar(sql);
        
        //Cargamos los valores obtenidos en HashMap
        try {

            TipoCarroceria tipoCarroceria;
            //Generamos un ciclo para recorrer el resultset y agregar valores al HashMap
            while(resultSet.next()){
                tipoCarroceria = new TipoCarroceria(resultSet.getInt(1),resultSet.getString(2));
                //Agregamos el objeto a HashMap
                mapTipoCarroceria.put(tipoCarroceria.getNombreTipoCarroceria(),tipoCarroceria.getIdTipoCarroceria());
            }
            
        }catch(SQLException ex){
             javax.swing.JOptionPane.showMessageDialog(null,"Se ha producido un error :"+ex.getMessage());
           
        }
        //Retornamos el HashMap
        return mapTipoCarroceria;
    }
    //Obtener diferentes colores
    public HashMap<String,Integer> generarValoresColores(){
        //Declaramos HashMap
        HashMap<String, Integer> mapColor = new HashMap<String, Integer>();
        //Instanciamos clase Operación
        Operacion operacion = new Operacion();

        String sql ="SELECT idColorVehiculo,nombreColor FROM ColorVehiculo";
        //Retornamos resultset
        ResultSet resultSet = operacion.listar(sql);
        
        //Cargamos los valores obtenidos en HashMap
        try {

            Color color;
            //Generamos un ciclo para recorrer el resultset y agregar valores al HashMap
            while(resultSet.next()){
                color= new Color(resultSet.getInt(1),resultSet.getString(2));
                //Agregamos el objeto a HashMap
                mapColor.put(color.getNombreColor(),color.getIdColorVehiculo());
            }
            
        }catch(SQLException ex){
             javax.swing.JOptionPane.showMessageDialog(null,"Se ha producido un error :"+ex.getMessage());
           
        }
        //Retornamos el HashMap
        return mapColor;
    }
     //Obtener diferentes estados de vehículo
    public HashMap<String,Integer> generarValoresEstadoVehiculo(){
        //Declaramos HashMap
        HashMap<String, Integer> mapEstadoVehiculo = new HashMap<String, Integer>();
        //Instanciamos clase Operación
        Operacion operacion = new Operacion();

        String sql ="SELECT idEstadoVehiculo,nombreEstadoVehiculo FROM EstadoVehiculo";
        //Retornamos resultset
        ResultSet resultSet = operacion.listar(sql);
        
        //Cargamos los valores obtenidos en HashMap
        try {

            EstadoVehiculo estadoVehiculo;
            //Generamos un ciclo para recorrer el resultset y agregar valores al HashMap
            while(resultSet.next()){
                estadoVehiculo= new EstadoVehiculo(resultSet.getInt(1),resultSet.getString(2));
                //Agregamos el objeto a HashMap
                mapEstadoVehiculo.put(estadoVehiculo.getNombreEstadoVehiculo(),estadoVehiculo.getIdEstadoVehiculo());
            }
            
        }catch(SQLException ex){
             javax.swing.JOptionPane.showMessageDialog(null,"Se ha producido un error :"+ex.getMessage());
           
        }
        //Retornamos el HashMap
        return mapEstadoVehiculo;
    }
    
}
