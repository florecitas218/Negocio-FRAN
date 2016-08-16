/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Persistencia.Persistencia;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Admin
 */
@Entity
public class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private long idEmpresa;
    private String nombre;
    private String telefono;
    private String direccion;
    @OneToMany (mappedBy = "Empresa")
    private List <Producto> productos;
    
    private static Persistencia persistencia;
    //contructor

    public Empresa() {
        this.productos = new ArrayList<>();
        //Empresa.getPersistencia().insertar(this);
    }
    public Empresa(long idEmpresa, String nombre, String telefono, String direccion) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
        Empresa.persistencia.insertar(this);
    }
    
    //set y get

    public long getIdEmpresa() {
        return idEmpresa;
    }
    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public List<Producto> getProductos() {
        return productos;
    }
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
    //atributos estaticos
    static{ persistencia = new Persistencia();}
    public static Persistencia getPersistencia(){
        return persistencia;
    }
    
    public void agregarProducto (long codigoProducto, String nombre, String descripcion, double precioUnitario, String marca){
        Producto producto = new Producto (codigoProducto, nombre, descripcion, precioUnitario, marca,this);
        this.getProductos().add(producto);
        Empresa.getPersistencia().insertar(producto);
    }
}
