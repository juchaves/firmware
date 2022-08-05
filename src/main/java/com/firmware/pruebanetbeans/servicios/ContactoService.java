/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firmware.pruebanetbeans.servicios;

import com.firmware.pruebanetbeans.excepciones.ContactoException;
import com.firmware.pruebanetbeans.modelo.Contacto;
import java.util.List;
import java.util.Optional;

/**
 * Exposicion de servicios de una capa de negocio simulada, esto a traves de
 * una interfaz que debe ser implementada
 * @author jmcp1
 */
public interface ContactoService {
    List<Contacto> obtener( Optional<Long> identificacion, Optional<Long> telefono ) throws ContactoException;
    void crear( Contacto contacto );
    void borrar( Long identificacion ) throws ContactoException;

}
