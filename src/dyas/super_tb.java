/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dyas;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public abstract class super_tb {
    Scanner in= new Scanner(System.in);
  
    String nama_ruang;
    private String lokasi_ruang;
    private String fakultas;

    public String getNama_ruang() {
        return nama_ruang;
    }

    public void setNama_ruang(String nama_ruang) {
        this.nama_ruang = nama_ruang;
    }

    public String getLokasi_ruang() {
        return lokasi_ruang;
    }

    public void setLokasi_ruang(String lokasi_ruang) {
        this.lokasi_ruang = lokasi_ruang;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    
//    public void identitas(){
//        System.out.println("masukan nama ruang");
//        setNama_ruang(in.next());
//        System.out.println("masukan nama fakultas");
//        setFakultas(in.next());
//        System.out.println("masukan nama lokasi");
//        setLokasi_ruang(in.next());
//    }
    abstract public void input_identitas_ruang_kelas(String nama_ruang, String lokasi_ruang, String fakultas);
  
}
