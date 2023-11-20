/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Categoria {
    private int id_catg;
    private String cate_produ;

    public Categoria(String cate_produ) {
        this.cate_produ = cate_produ;
    }

    public Categoria(int id_catg, String cate_produ) {
        this.id_catg = id_catg;
        this.cate_produ = cate_produ;
    }

    public int getId_catg() {
        return id_catg;
    }

    public void setId_catg(int id_catg) {
        this.id_catg = id_catg;
    }

    public String getCate_produ() {
        return cate_produ;
    }

    public void setCate_produ(String cate_produ) {
        this.cate_produ = cate_produ;
    }
    
    
}
