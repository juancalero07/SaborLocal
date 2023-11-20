/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Cliente {
    
    private int id_cliente;
    private String nom_cl;
    private String apelli_cl;
    private String cedula_cl;
    private String tele_cl;

    public Cliente(String nom_cl, String apelli_cl, String cedula_cl, String tele_cl) {
        this.nom_cl = nom_cl;
        this.apelli_cl = apelli_cl;
        this.cedula_cl = cedula_cl;
        this.tele_cl = tele_cl;
    }

    public Cliente(int id_cliente, String nom_cl, String apelli_cl, String cedula_cl, String tele_cl) {
        this.id_cliente = id_cliente;
        this.nom_cl = nom_cl;
        this.apelli_cl = apelli_cl;
        this.cedula_cl = cedula_cl;
        this.tele_cl = tele_cl;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNom_cl() {
        return nom_cl;
    }

    public void setNom_cl(String nom_cl) {
        this.nom_cl = nom_cl;
    }

    public String getApelli_cl() {
        return apelli_cl;
    }

    public void setApelli_cl(String apelli_cl) {
        this.apelli_cl = apelli_cl;
    }

    public String getCedula_cl() {
        return cedula_cl;
    }

    public void setCedula_cl(String cedula_cl) {
        this.cedula_cl = cedula_cl;
    }

    public String getTele_cl() {
        return tele_cl;
    }

    public void setTele_cl(String tele_cl) {
        this.tele_cl = tele_cl;
    }
}

