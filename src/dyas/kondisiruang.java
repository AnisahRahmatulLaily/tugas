package dyas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class kondisiruang extends ruangsuper{
    private int panjang_ruang;
    private int lebar_ruang;
    private int jumlah_kursi;
    private int jumlah_pintu;
    private int jumlah_jendela;

    public int getPanjang_ruang() {
        return panjang_ruang;
    }

    public int getLebar_ruang() {
        return lebar_ruang;
    }

    public int getJumlah_kursi() {
        return jumlah_kursi;
    }

    public int getJumlah_pintu() {
        return jumlah_pintu;
    }

    public int getJumlah_jendela() {
        return jumlah_jendela;
    }

    public void setPanjang_ruang(int panjang_ruang) {
        this.panjang_ruang = panjang_ruang;
    }

    public void setLebar_ruang(int lebar_ruang) {
        this.lebar_ruang = lebar_ruang;
    }

    public void setJumlah_kursi(int jumlah_kursi) {
        this.jumlah_kursi = jumlah_kursi;
    }

    public void setJumlah_pintu(int jumlah_pintu) {
        this.jumlah_pintu = jumlah_pintu;
    }

    public void setJumlah_jendela(int jumlah_jendela) {
        this.jumlah_jendela = jumlah_jendela;
    }
    @Override
    public void input_identitas_ruang_kelas(){
        System.out.println("masukan panjang");
	setPanjang_ruang(in.nextInt());
	System.out.println("masukan lebar");
	setLebar_ruang(in.nextInt());
	System.out.println("masukan jumlah kursi");
	setJumlah_kursi(in.nextInt());
	System.out.println("masukan jumlah pintu");
	setJumlah_pintu(in.nextInt());
	System.out.println("masukan jumlah jendela");
	setJumlah_jendela(in.nextInt());
    }

}