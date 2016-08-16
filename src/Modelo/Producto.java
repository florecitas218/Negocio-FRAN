/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Admin
 */
@Entity
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private long codigoProducto;
    private String nombre;
    private String descripcion;
    private double precioUnitario;
    private String marca;
    @OneToOne
    private Empresa empresa;
    
    //contructores
    public Producto() {    
    }
    public Producto(long codigoProducto, String nombre, String descripcion, double precioUnitario, String marca, Empresa empresa) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.marca = marca;
        this.empresa = empresa;
    }
    
    //set y get
    public long codigoProdcuto() {
        return codigoProducto;
    }
    public void setCodigoProducto(long codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    

    @Override
    public String toString() {
        return "Modelo.Producto[ id=" +" ]";
    }
    
}
