/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Productos {
 private int id_produ;
 private String nom_produ;
 private float precio_comp;
 private String descrip_produ;
 private int id_catg;

    public Productos(int id_produ, String nom_produ, float precio_comp, String descrip_produ, int id_catg) {
        this.id_produ = id_produ;
        this.nom_produ = nom_produ;
        this.precio_comp = precio_comp;
        this.descrip_produ = descrip_produ;
        this.id_catg = id_catg;
    }

    public Productos(String nom_produ, float precio_comp, String descrip_produ, int id_catg) {
        this.nom_produ = nom_produ;
        this.precio_comp = precio_comp;
        this.descrip_produ = descrip_produ;
        this.id_catg = id_catg;
    }

    public int getId_produ() {
        return id_produ;
    }

    public void setId_produ(int id_produ) {
        this.id_produ = id_produ;
    }

    public String getNom_produ() {
        return nom_produ;
    }

    public void setNom_produ(String nom_produ) {
        this.nom_produ = nom_produ;
    }

    public float getPrecio_comp() {
        return precio_comp;
    }

    public void setPrecio_comp(float precio_comp) {
        this.precio_comp = precio_comp;
    }

    public String getDescrip_produ() {
        return descrip_produ;
    }

    public void setDescrip_produ(String descrip_produ) {
        this.descrip_produ = descrip_produ;
    }

    public int getId_catg() {
        return id_catg;
    }

    public void setId_catg(int id_catg) {
        this.id_catg = id_catg;
    }
 


}
