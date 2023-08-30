/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author USER
 */
public class producto {
    private int cod_producto;
    private int cant_prod;
    private String nombre_prod;
    private int precio;
    private int idcategoria;
    private String descripcion_prod;
    private int cod_usuario;
    private boolean activo;
    
    //Constructores
    public producto () {
        
    }

    public producto(int cod_producto, int cant_prod, String nombre_prod, int precio, int idcategoria, String descripcion_prod, int cod_usuario, boolean activo) {
        this.cod_producto = cod_producto;
        this.cant_prod = cant_prod;
        this.nombre_prod = nombre_prod;
        this.precio  = precio;
        this.idcategoria = idcategoria;
        this.descripcion_prod = descripcion_prod;
        this.cod_usuario = cod_usuario;
        this.activo = activo;
    }

    //Setter y getter


    public int getCod_producto() {
        return cod_producto;
  
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public int getCant_prod() {
        return cant_prod;
    }

    public void setCant_prod(int cant_prod) {
        this.cant_prod = cant_prod;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }
    
    public String getDescripcion_prod() {
        return descripcion_prod;
    }
    
    public void setDescripcion_prod(String descripcion_prod) {
        this.descripcion_prod = descripcion_prod;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
        
    }

    //Método toString

    @Override
    public String toString() {
        return "producto{" + "referencia=" + cod_producto + ", cantidad=" + cant_prod + ", nombre=" + nombre_prod + ", precio=" + precio + ", categoria=" + idcategoria + ", descripcion=" + descripcion_prod + ", vendedor=" + cod_usuario + ", activo=" + activo + '}';
    }
    
}