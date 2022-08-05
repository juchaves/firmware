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
        switch (columnIndex) {
            case 0 : return "Nombre";
            case 1 : return "Telefono";
            case 2 : return "Direccion";
            case 3 : return "Identificacion";
            default : return "-";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0 : return String.class;
            case 1 : return Long.class;
            case 2 : return String.class;
            case 3 : return Long.class;
            default : return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return lista.get(rowIndex).nombre();
            case 1 : return lista.get(rowIndex).telefono();
            case 2 : return lista.get(rowIndex).direccion();
            case 3 : return lista.get(rowIndex).identificacion();
            default : return "";
        }
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
