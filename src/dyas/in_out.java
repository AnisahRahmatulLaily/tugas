package dyas;

import java.util.Scanner;
public abstract class in_out extends super_tb {
    Scanner in = new Scanner(System.in);
    ruang d;
    int i,r,LCD=0,AC=0,lampu=0, kipas=0,steker=0,CCTV=0;
    @Override
    public void input_identitas_ruang_kelas(String nama_ruang, String lokasi_ruang, String fakultas) {
		System.out.println("input ruang kelas");
		nama_ruang = in.next();
		System.out.println("input lokasi ruang kelas");
		lokasi_ruang=in.next();
		System.out.println("pilih fakultas");
		fakultas = in.next();
     d=new ruang(d.getNama_ruang(),d.getLokasi_ruang(),d.getFakultas());
    }
    public void input_kondisi_ruang_kelas(int panjang_ruang, int lebar_ruang, int jumlah_kursi, int pintu, int jendela) {
		System.out.println("masukan panjang");
		panjang_ruang = in.nextInt();
		System.out.println("masukan lebar");
		lebar_ruang = in.nextInt();
		System.out.println("masukan jumlah kursi");
		jumlah_kursi = in.nextInt();
		System.out.println("masukan jumlah pintu");
		pintu = in.nextInt();
		System.out.println("masukan jumlah jendela");
		jendela = in.nextInt();
                d=new ruang (d.getPanjang_ruang(),d.getLebar_ruang(),d.getJumlah_kursi(),d.getJumlah_pintu(),d.getJumlah_jendela());
	}
    public void kondisi_dan_posisi_sarana(int jumlah_steker, String kondisi_steker, String posisi_steker, int jumlah_kabel_LCD, 
            String kondisi_kabel_LCD, String posisi_kabel_LCD, int jumlah_lampu,String kondisi_lampu ,
            String posisi_lampu, int jumlah_kipas_angin, String kondisi_kipas_angin, String posisi_kipas_angin,
            int jumlah_AC, String kondisi_AC,String posisi_AC,String SSID, String bandwidth, int jumlah_CCTV, String kondisi_CCTV, String posisi_CCTV) {
		System.out.println("masukan jumlah steker atau stop kontak");
		jumlah_steker = in.nextInt();
                for(i=0;i<d.getJumlah_steker();i++){
                    r=i+1;
                    System.out.println("Kondisi steker baik/buruk ke  : "+r);
                    d.setKondisi_steker(in.next());
                    if (d.getKondisi_steker().equalsIgnoreCase("baik")){
                        steker++;
                    }
                }
		System.out.println("posisi steker \n1. Di pojok Ruang dan di dekat dosen n\2. Di pojok ruang n\3. dekat dosen  ");
		posisi_steker = in.next();
		System.out.println("input jumlah kabel LCD");
		jumlah_kabel_LCD = in.nextInt();
		System.out.println("posisi kabel LCD n\1. dekat dosen n\2. tidak dekat dosen");
		posisi_kabel_LCD 
		System.out.println("jumlah lampu");
		d.setJumlah_lampu(in.nextInt());
                System.out.println("posisi :n\1. atap ruang n\2. bukan di atap ruang");
                d.setPosisi_lampu(in.next());
		System.out.println("jumlah kipas angin");
		d.setJumlah_kipas_angin(in.nextInt());
                System.out.println("posisi kipas n\1. atap ruang n\2. bukan atap ruang ");
                d.setPosisi_kipas_angin(in.next());
		System.out.println("jumlah AC");
		d.setJumlah_AC(in.nextInt());
		System.out.println("posisi AC n\1. dibelakang atau di samping n/2. bukan dibelakang ataupun bukan disamping");
		d.setPosisi_AC(in.next());
		System.out.println("pilih SSID");
		d.setSSID(in.next());
		System.out.println("bandwidth");
		d.setBandwidth(in.next());
		System.out.println("jumlah cctv");
		d.setJumlah_CCTV(in.nextInt());
                System.out.println("posisi cctv n\1. depan dan belakang n\2.belakang n\3. depan n\4. bukan depan dan belakang");
		d.setPosisi_CCTV(in.next());
		//analisis_CCTV();
    }
    public void input_lingkungan_ruang_kelas() {
		System.out.println("kondisi lantai");
		d.setKondisi_lantai(in.next());
		System.out.println("kondisi dinding");
		d.setKondisi_dinding(in.next());
		System.out.println("kondisi atap");
		d.setKondisi_atap(in.next());
		System.out.println("kondisi pintu");
		d.setKondisi_pintu(in.next());
		System.out.println("kondisi jendela");
		d.setKondisi_jendela(in.next());
	}
    public void kebersihan_ruang_kelas() {
		System.out.println("masukan sirkulasi udara");
		d.setSirkulasi_udara(in.nextLine());
		System.out.println("masukan nilai pencahaan");
		d.setPencahayaan(in.nextInt());
		System.out.println("masukan kelembapan");
		d.setKelembapan(in.nextInt());
		System.out.println("Masukan suhu Celcius");
		d.setSuhu(in.nextInt());

	}
    public void kenyamanan_ruang_kelas() {
		System.out.println("masukan kebisingan");
		d.setKebisingan(in.nextInt());
		System.out.println("masukan bau");
		d.setBau(in.nextLine());
		System.out.println("masukan kebocoran");
		d.setKebocoran(in.nextLine());
		System.out.println("masukan kerusakan");
		d.setKerusakan(in.nextLine());
		//analisis_kerusakan();
		System.out.println("masukan keausan");
		d.setKeausan(in.nextLine());
		//analisis_keausan();
	}
    public void keamanan_ruang() {
		System.out.println("input kekokohan");
		d.setKekokohan(in.next());
		System.out.println("jumlah kunci pintu");
		d.setJumlah_kunci(in.nextInt());
		System.out.println("jumlah jendela");
		d.setJumlah_jendela(in.nextInt());
		System.out.println("bahaya atau aman ?");
	}
    public void tampil (){
            System.out.println("ruang : "+d.getNama_ruang());
            System.out.println("lokasi:"+d.getLokasi_ruang());
            System.out.println("fakultas : "+d.getFakultas());
            System.out.println("panjang ruang :"+d.getPanjang_ruang());
            System.out.println("lebar ruang :"+d.getLebar_ruang());
            //System.out.println("luas ruang : "+d.hitung_luas_ruang());
            //System.out.println("bentuk ruang :" +d.hitung_bentuk_ruang());
            System.out.println("jumlah kursi di dalam ruang : "+d.getJumlah_kursi());
           // System.out.println("rasio luas ruang :" +d.hitung_rasio_luas());
            System.out.println("jumlah pintu : "+d.getJumlah_pintu());
            System.out.println("jumlah jendela :"+d.getJumlah_jendela());
            //System.out.println("analisis pintu dan jendela : "+this.analisis_pintu_dan_jendela());
//            System.out.println("jumlah steker : "+super.getJumlah_steker());
//            System.out.println("kondisi steker "+super.getKondisi_steker());
//            System.out.println("posisi steker :"+super.getPosisi_steker());
//            System.out.println("analisis kelistrikan "+ this.analisis_kelistrikan());
//            System.out.println("jumlah kabel LCD : "+super.getJumlah_kabel_LCD());
//            System.out.println("kondisi kabel LCD : "+super.getKondisi_kabel_LCD());
//            System.out.println("posisi kabel LCD : "+super.getPosisi_kabel_LCD());
//            System.out.println("analisis kabel LCD : "+this.analisis_LCD());
//            System.out.println("jumlah lampu dalam ruang : "+ super.getJumlah_lampu());
//            System.out.println("kondisi lampu dalam ruang : "+super.getKondisi_lampu());
//            System.out.println("posisi lampu dalam ruang: "+super.getKondisi_lampu());
//            System.out.println("analisis lampu : "+this.analisis_lampu());
//            System.out.println("jumlah kipas angin : "+super.getJumlah_kipas_angin());
//            System.out.println("kondisi kipas angin :"+ super.getKondisi_kipas_angin());
//            System.out.println("posisi kipas angin dalam ruang : " +super.getKondisi_kipas_angin());
//            System.out.println("analisis kipas angin :"+this.analisis_kipas_angin());
//            System.out.println("jumlah AC dalam ruangan : "+super.getJumlah_AC());
//            System.out.println("kondisi AC dalam ruangan:  "+super.getKondisi_AC());
//            System.out.println("posisi AC dalam ruangan : "+super.getPosisi_AC());
//            System.out.println("analisis AC dalam ruang : "+ this.analisis_AC());
//            System.out.println("inputan SSID : "+super.getSSID());
//            System.out.println("inputan bandwidth :"+super.getBandwidth());
//            System.out.println("analisis internet : "+this.analisis_internet());
        }
 public ruang getruang(){
        return d;
            }
    
}
