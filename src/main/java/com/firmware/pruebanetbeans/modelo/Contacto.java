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
public record Contacto( String nombre, Long telefono, String direccion, Long identificacion ) {

}
