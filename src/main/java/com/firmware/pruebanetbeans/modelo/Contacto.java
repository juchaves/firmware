/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firmware.pruebanetbeans.modelo;

/**
 * Se aprovecha este novedoso metodo de creacion de enidades de modelo, con
 * sintaxis muy resumida ya en JDK 17
 * @author jmcp1
 */
public class Contacto {
    private String nombre;
    private Long telefono; 
    private String direccion;
    private Long identificacion;

    public Contacto( String nombre, Long telefono, String direccion, Long identificacion ) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.identificacion = identificacion;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public Long getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the identificacion
     */
    public Long getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }
    
    public String nombre() {
        return getNombre();
    }
    
    public void nombre(String n){
        setNombre(n);
    }
    
    public Long telefono() {
        return getTelefono();
    }
    
    public void telefono(Long t){
        setTelefono(t);
    }
            
    public String direccion() {
        return getDireccion();
    }
    
    public void direccion(String d){
        setDireccion(d);
    }
    
    public Long identificacion() {
        return getIdentificacion();
    }
    
    public void direccion(Long i){
        setIdentificacion(i);
    }
            
}
