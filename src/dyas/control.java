package dyas;

import java.util.Scanner;

public abstract class control extends in_out{
    
    
    ruang ru = new ruang() {};
    //ru = i.getruang();
    Scanner in = new Scanner(System.in);
    String hasil;
    int i,r,LCD=0,AC=0,lampu=0, kipas=0,steker=0,CCTV=0;
    public  void analisis_hitung_ruang (){
    }
    double hitung_luas_ruang() {
		return ru.getPanjang_ruang() * ru.getLebar_ruang();
	}

	public String hitung_bentuk_ruang() {
		String bentuk = "persegi panjang";
		if (ru.getPanjang_ruang() != ru.getLebar_ruang()) {
			System.out.println(bentuk);
			if (bentuk == "persegi panjang") {
				hasil="sesuai";
			}
		} else {
			hasil="bentuk tidak sesuai";
		}
            return hasil;
	}

	public double hitung_rasio_luas() {
		double hasil;
		hasil = hitung_luas_ruang() / ru.getJumlah_kursi();
		if (hasil >= 0.5) {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
			//input_kondisi_ruang_kelas();
		}
		return hasil;
	}

	public String analisis_pintu_dan_jendela() {
            String hasil;
		if (ru.getJumlah_pintu() >= 2 && ru.getJumlah_jendela() >= 1) {
			hasil="sesuai";
		} else {
			hasil="tidak sesuai";
		}
            return hasil ;
	}
      public String analisis_kelistrikan() {
            if (ru.getPosisi_steker().equalsIgnoreCase("1") && ru.getJumlah_steker() >=4 && steker ==4){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }return hasil;
            
	}

	public String analisis_LCD() {
	if (ru.getPosisi_kabel_LCD().equalsIgnoreCase("1") && ru.getJumlah_steker() >=1 && LCD==1){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }return hasil;
	}
	public String analisis_lampu() {
        if (ru.getPosisi_lampu().equalsIgnoreCase("1") && ru.getJumlah_lampu()>=18 && lampu==18){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }return hasil;
            
	}

	public String analisis_kipas_angin() {
	if (ru.getPosisi_kipas_angin().equalsIgnoreCase("1") && ru.getJumlah_lampu()>=2 && kipas==2){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }return hasil;
	}

	public String analisis_AC() {
	if (ru.getPosisi_kipas_angin().equalsIgnoreCase("1") && ru.getJumlah_lampu()>=2 && kipas==2){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }
        return hasil;
	}

	public String analisis_internet() {
            
		if (ru.getSSID() == "UMM Hotspot") {
			hasil="sesuai";
			if (ru.getBandwidth() == "bisa") {
				hasil="sesuai";
			}
		} else {
			hasil="tidak sesuai";
		}return hasil;

	}

	public String analisis_CCTV() {
	if (ru.getPosisi_CCTV().equalsIgnoreCase("1") && ru.getJumlah_CCTV()>=2 && CCTV==2){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }
        return hasil;

	}

	public String analisis_kebersihan() {
		if (ru.getKondisi_lantai() == "bersih"
				&& ru.getKondisi_dinding() == "bersih"
				&& ru.getKondisi_atap() == "bersih"
				&& ru.getKondisi_pintu() == "baik"
				&& ru.getKondisi_jendela() == "bersih") {
			hasil="sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}
        public String analisis_sirkulasi_udara() {
		if ("lancar".equals(ru.getSirkulasi_udara())) {
			hasil="Sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_Pencahayaan() {
		if ((ru.getPencahayaan() >= 250) && ru.getPencahayaan() <= 350) {
			hasil="sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_Kelembapan() {
		if ((ru.getKelembapan() >= 70) && ru.getKelembapan() <= 80) {
			hasil="Sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_Suhu() {
		if ((ru.getSuhu() >= 25) && ru.getSuhu() <= 35) {
			hasil="sesuai";
		} else {
			hasil="tidak sesuai";
		}
                return hasil;
	}
        public String analisis_kebisingan() {
		if ("tidak bising".equals(ru.getKebisingan())) {
			hasil="Sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_bau() {
		if ("tidak bau".equals(ru.getBau())) {
			hasil="Sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_kebocoran() {
		if ("tidak bocor".equals(ru.getKebocoran())) {
			hasil="Sesuai";
	} else {  		
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_kerusakan() {
		if ("tidak rusak".equals(ru.getKerusakan())) {
			hasil="sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_keausan() {
		if ("tidak aus".equals(ru.getKeausan())) {
			hasil="Sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	
	public void analisis_kekokohan() {
		if (ru.getKekokohan() == "kokoh") {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void analisis_kunci_pintu_jendela() {
		if (ru.getJumlah_kunci() != 0 && ru.getJumlah_jendela() != 0) {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public String analisis_keamanan_ruang() {
		if (ru.getBahaya() == "aman") {
			hasil="sesuai";
		}return hasil;
	}


    
}
