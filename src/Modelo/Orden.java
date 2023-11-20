/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Time;
import java.util.*;

/**
 *
 * @author HP
 */
public class Orden {
 private int id_orden;
    private Date fecha_orden;
    private java.sql.Time hora_orden;
    private String no_mesa;
    private int id_cliente;

    public Orden(int id_orden, Date fecha_orden, Time hora_orden, String no_mesa, int id_cliente) {
        this.id_orden = id_orden;
        this.fecha_orden = fecha_orden;
        this.hora_orden = hora_orden;
        this.no_mesa = no_mesa;
        this.id_cliente = id_cliente;
    }

    public Orden(Date fecha_orden, Time hora_orden, String no_mesa, int id_cliente) {
        this.fecha_orden = fecha_orden;
        this.hora_orden = hora_orden;
        this.no_mesa = no_mesa;
        this.id_cliente = id_cliente;
    }

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public Date getFecha_orden() {
        return fecha_orden;
    }

    public void setFecha_orden(Date fecha_orden) {
        this.fecha_orden = fecha_orden;
    }

    public Time getHora_orden() {
        return hora_orden;
    }

    public void setHora_orden(Time hora_orden) {
        this.hora_orden = hora_orden;
    }

    public String getNo_mesa() {
        return no_mesa;
    }

    public void setNo_mesa(String no_mesa) {
        this.no_mesa = no_mesa;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}
