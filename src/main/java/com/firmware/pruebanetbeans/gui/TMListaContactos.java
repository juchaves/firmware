/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.firmware.pruebanetbeans.gui;

import com.firmware.pruebanetbeans.modelo.Contacto;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 * Un TableModel muy simple para representar los datos que expone la capa de
 * servicio
 * @author jmcp1
 */
public class TMListaContactos implements TableModel{
    private List<Contacto> lista;
    
    public TMListaContactos( List<Contacto> lista ) {
        this.lista = lista;
    }
            

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> "Nombre";
            case 1 -> "Telefono";
            case 2 -> "Direccion";
            case 3 -> "Identificacion";
            default -> "-";
        };
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> String.class;
            case 1 -> Long.class;
            case 2 -> String.class;
            case 3 -> Long.class;
            default -> String.class;
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> lista.get(rowIndex).nombre();
            case 1 -> lista.get(rowIndex).telefono();
            case 2 -> lista.get(rowIndex).direccion();
            case 3 -> lista.get(rowIndex).identificacion();
            default -> "";
        };
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
}
