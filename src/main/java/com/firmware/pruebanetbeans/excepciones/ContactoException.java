/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firmware.pruebanetbeans.excepciones;

/**
 * Excepcion para ser usada en situaciones particulares del aplicativo de
 * prueba para propagar una condicion anormal o de error
 * @author jmcp1
 */
public class ContactoException extends Exception {
    public ContactoException(String reason) {
        super(reason);
    }
}
