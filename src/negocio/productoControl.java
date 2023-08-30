/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.productoDAO;
import entidades.producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JcarlosAd7
 */
public class productoControl {
    private final productoDAO DATOS;
    private final producto obj;
    private DefaultTableModel modeloTabla;
    public int registrosMostrados;
    
    public productoControl(){
        this.DATOS=new productoDAO();
        this.obj=new producto();
        this.registrosMostrados=0;
    }
    
    public DefaultTableModel listar(String texto){
        List<producto> lista=new ArrayList();
        lista.addAll(DATOS.listar(texto));
        
        String[] titulos={"Cod_producto","Cant_prod","Nombre_prod","Precio","Idcategoria","Descripción_prod","Cod_usuario","Estado"};
        this.modeloTabla=new DefaultTableModel(null,titulos);        
        String estado;
        String[] registro = new String[8];
        
        this.registrosMostrados=0;
        for (producto item:lista){
            if (item.isActivo()){
                estado="Activo";
            } else{
                estado="Inactivo";
            }

            
            registro[0]=Integer.toString(item.getCod_producto());
            registro[1]=Integer.toString(item.getCant_prod());
            registro[2]=item.getNombre_prod();
            registro[3]=Integer.toString(item.getPrecio());
            registro[4]=Integer.toString(item.getIdcategoria());
            registro[5]=item.getDescripcion_prod();
            registro[6]=Integer.toString(item.getCod_usuario());
            registro[7]=estado;
            this.modeloTabla.addRow(registro);
            this.registrosMostrados=this.registrosMostrados+1;
        }
        return this.modeloTabla;
    }
    
    public String insertar(int cant_prod, String nombre_prod, int precio, int idcategoria, String descripcion_prod, int cod_usuario){
        if (DATOS.existe(nombre_prod)){
            return "El registro ya existe.";
        }else{
            obj.setCant_prod(cant_prod);
            obj.setNombre_prod(nombre_prod);
            obj.setPrecio(precio);
            obj.setIdcategoria(idcategoria);
            obj.setDescripcion_prod(descripcion_prod);
            obj.setCod_usuario(cod_usuario);
            if (DATOS.insertar(obj)){
                return "OK";
            }else{
                return "Error en el registro.";
            }
        }
    }
    
    public String actualizar(int cod_producto, int cant_prod, String nombre_prod, int precio, int idcategoria, String nombreAnt,String descripcion_prod, int cod_usuario){
        if (nombre_prod.equals(nombreAnt)){
            obj.setCod_producto(cod_producto);
            obj.setCod_producto(cod_producto);
            obj.setCant_prod(cant_prod);
            obj.setNombre_prod(nombre_prod);
            obj.setPrecio(precio);
            obj.setIdcategoria(idcategoria);
            obj.setDescripcion_prod(descripcion_prod);
            obj.setCod_usuario(cod_usuario);
            if(DATOS.actualizar(obj)){
                return "OK";
            }else{
                return "Error en la actualización.";
            }
        }else{
            if (DATOS.existe(nombre_prod)){
                return "El registro ya existe.";
            }else{
                obj.setCod_producto(cod_producto);
                obj.setCant_prod(cant_prod);
                obj.setNombre_prod(nombre_prod);
                obj.setPrecio(precio); 
                obj.setIdcategoria(idcategoria);
                obj.setDescripcion_prod(descripcion_prod);
                obj.setCod_usuario(cod_usuario);
                if (DATOS.actualizar(obj)){
                    return "OK";
                }else{
                    return "Error en la actualización.";
                }
            }
        }
    }
    
    public String desactivar(int cod_producto){
        if (DATOS.desactivar(cod_producto)){
            return "OK";
        }else{
            return "No se puede desactivar el registro";
        }
    }
    
    public String activar(int cod_producto){
        if (DATOS.activar(cod_producto)){
            return "OK";
        }else{
            return "No se puede activar el registro";
        }
    }
    
    public int total(){
        return DATOS.total();
    }
    
    public int totalMostrados(){
        return this.registrosMostrados;
    }
}
