/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listrik;

/**
 *
 * @author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi Program : Program menghitung hasil tegangan
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public void Baterai(){
        System.out.printf("======Hukum Ohm=======\n");
        System.out.printf("Kuat arus yang mengalir pada suatu kawat penghantar\nakan berbanding lurus dengan beda potensial\npada ujung-ujung kawat penghantar tersebut\nasalkan suhu kawat dijaga konstan\n\n");
    }
    
    public void Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getKuatArus(){
        return kuatArus;
    }
    
    public float getHambatan(){
        return hambatan;
    }
    
    public float hitungTegangan(){
        return hambatan * kuatArus;
    } 
}
