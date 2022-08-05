/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firmware.pruebanetbeans.datos;

import com.firmware.pruebanetbeans.modelo.Contacto;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase con la cual representamos el estado o persistencia, solo que por
 * simplicidad y por que no se solicitó algo distinto se usa una lista en memoria
 * @author jmcp1
 */
public class ContactoRepositorio {
    /**
     * Referencia privada estatica al singleton de esta clase, como use solo
     * java básico, no use inyeccion de dependencias sino este esquema sencillo
     * que tambien se que funciona para tener instancias únicas
     */
    private static ContactoRepositorio instance = null;

    /**
     * Constructor privado del singleton
     */
    private ContactoRepositorio() {
    }
    
    private List<Contacto> contenidoMemoria = new ArrayList<Contacto>();

    public boolean agregar( Contacto contacto ) {
        return contenidoMemoria.add( contacto );
    }

    public boolean eliminar( Long identificacion ) {
        return contenidoMemoria.removeIf( c -> c.identificacion().equals( identificacion ));
    }

    public List<Contacto> listar() {
        return contenidoMemoria;
    }

    /**
     * Creacion de un objeto singleton como solía hacerse en el pasado, hoy
     * en día con spring el ciclo de vida lo gestiona el contenedor del bean.
     * @return 
     */
    public static ContactoRepositorio getInstance() {
        if( instance != null )
            return instance;
        else
        {
            synchronized( ContactoRepositorio.class ) {
                if( instance != null )
                    return instance;
                else
                    return instance = new ContactoRepositorio();
            }
        }
    }    
}
