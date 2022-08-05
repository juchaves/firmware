/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firmware.pruebanetbeans.servicios;

import com.firmware.pruebanetbeans.datos.ContactoRepositorio;
import com.firmware.pruebanetbeans.excepciones.ContactoException;
import com.firmware.pruebanetbeans.modelo.Contacto;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Implementacion de servicio, usando el repositorio ficticio y proveyendo
 * funcionalidad a los componentes graficos.
 * @author jmcp1
 */
public class ContactoServiceImpl implements ContactoService {
        private static ContactoService instance = null;

    private ContactoServiceImpl() {

    }

    @Override
    public List<Contacto> obtener( Optional<Long> identificacion, Optional<Long> telefono )
            throws ContactoException {
        List<Contacto> toReturn = ContactoRepositorio.getInstance().listar().stream().collect(Collectors.toList());
        if( toReturn.isEmpty() && ( identificacion.isPresent() || telefono.isPresent() ) ) {
            throw new ContactoException( "No debe buscar nada en una lista de contactos vacia" );
        }
        identificacion.ifPresent( iden -> toReturn.removeIf( c -> !c.identificacion().equals( iden ) ) );
        telefono.ifPresent( tele -> toReturn.removeIf( c -> !c.telefono().equals( tele ) ) );
        return toReturn;
    }

    @Override
    public void crear( Contacto contacto ) {
        ContactoRepositorio.getInstance().agregar(contacto);
    }

    @Override
    public void borrar( Long identificacion )
            throws ContactoException {
        if( !ContactoRepositorio.getInstance().eliminar( identificacion ) )
            throw new ContactoException("Registro no encontrado para eliminar");
    }

    public static ContactoService getInstance() {
        if( instance != null )
            return instance;
        else
        {
            synchronized( ContactoServiceImpl.class ) {
                if( instance != null )
                    return instance;
                else
                    return instance = new ContactoServiceImpl();
            }
        }
    }
}
