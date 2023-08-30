
package datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import database.Conexion;
import datos.interfaces.CrudSimpleInterface;
import entidades.producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class productoDAO implements CrudSimpleInterface<producto> {
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public productoDAO(){
        CON=Conexion.getInstancia();
    }
    
    
    @Override
    public List<producto> listar(String texto) {// es una clase publica de categorias y baja el mvc
        List<producto> registros=new ArrayList();//trae los objetos dentro de un objeto
        try {//condicion
            ps=CON.conectar().prepareStatement("SELECT * FROM producto WHERE nombre_prod LIKE ?");//ps hace y llama a a la conexion
            ps.setString(1,"%" + texto +"%");//muestra el resultado yde la conexion y lo guarda en la funcion
            rs=ps.executeQuery();
            while(rs.next()){
                registros.add(new producto(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getBoolean(8)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            ps=null;
            rs=null;
            CON.desconectar();
        }
        return registros;
    }

    @Override
    public boolean insertar(producto obj) {
        resp=false;
        try {
            ps=CON.conectar().prepareStatement("INSERT INTO producto (cant_prod, nombre_prod, precio, idcategoria, descripcion_prod, cod_usuario, activo) VALUES (?,?,?,?,?,?,1)");
            ps.setInt(1, obj.getCant_prod());
            ps.setString(2, obj.getNombre_prod());
            ps.setInt(3, obj.getPrecio());
            ps.setInt(4, obj.getIdcategoria());
            ps.setString(5, obj.getDescripcion_prod());
            ps.setInt(6, obj.getCod_usuario());
            if (ps.executeUpdate()>0){
                resp=true;
            }
            ps.close();
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            ps=null;
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public boolean actualizar(producto obj) {
        resp=false;
        try {
            ps=CON.conectar().prepareStatement("UPDATE producto SET cant_prod=?, nombre_prod=?, precio=?, idcategoria=?, descripcion_prod=?, cod_usuario=?, idcategoria=? WHERE cod_producto=?");
            ps.setInt(1, obj.getCant_prod());
            ps.setString(2, obj.getNombre_prod());
            ps.setInt(3, obj.getPrecio());
            ps.setInt(4, obj.getIdcategoria());
            ps.setString(5, obj.getDescripcion_prod());
            ps.setInt(6, obj.getCod_usuario());
            ps.setInt(7, obj.getCod_producto());
            if (ps.executeUpdate()>0){
                resp=true;
            }
            ps.close();
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            ps=null;
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public boolean desactivar(int cod_producto) {//apunta el primer atributo de la tabla
        resp=false;//que a respuesta sea = falso
        try {
            ps=CON.conectar().prepareStatement("UPDATE producto SET activo=0 WHERE cod_producto=?");//prepara la respuesta y trae los atributos
            ps.setInt(1, cod_producto);//la respuesta es la primera posicion
            if (ps.executeUpdate()>0){//comparacion con la primera posicion de la tabla
                resp=true;//si la posicion  es mayor a 0 va a dar una respuesta en caso contrario se desconecta
            }
            ps.close();//el resultado se cierra
        }  catch (SQLException e) {//muestra que no se puede hacer la conexion
            JOptionPane.showMessageDialog(null, e.getMessage());//finalza la conexion y muestra un mensaje
        } finally{
            ps=null;//sea igual a nulo
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public boolean activar(int cod_producto) {
        resp=false;
        try {
            ps=CON.conectar().prepareStatement("UPDATE producto SET activo=1 WHERE cod_producto=?");
            ps.setInt(1, cod_producto);
            if (ps.executeUpdate()>0){
                resp=true;
            }
            ps.close();
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            ps=null;
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public int total() {//verificar y contar registros
        int totalRegistros=0;//si existe desues de 0 inicia
        try {
            ps=CON.conectar().prepareStatement("SELECT COUNT(cod_producto) FROM producto");//que la respuesta sea igual al parametro            
            rs=ps.executeQuery();
            
            while(rs.next()){//hace comparacion con el metodo 
                totalRegistros=rs.getInt("COUNT(cod_producto)");//muestra el resuktado de los registros
            }            
            ps.close();
            rs.close();
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            ps=null;
            rs=null;
            CON.desconectar();
        }
        return totalRegistros;
    }

    @Override
    public boolean existe(String texto) {
        resp=false;
        try {
            ps=CON.conectar().prepareStatement("SELECT nombre_prod FROM producto WHERE nombre_prod=?");
            ps.setString(1, texto);
            rs=ps.executeQuery();
            rs.last();
            if(rs.getRow()>0){
                resp=true;
            }           
            ps.close();
            rs.close();
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            ps=null;
            rs=null;
            CON.desconectar();
        }
        return resp;
    }
    
}

