package dyas;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ruangkelas extends ruang{
	Scanner in = new Scanner(System.in);
	//ruang ambil = new ruang();
        int i,r,LCD=0,AC=0,lampu=0, kipas=0,steker=0,CCTV=0;
        String hasil;

	public void input_identitas_ruang_kelas() {
		System.out.println("input ruang kelas");
		setNama_ruang(in.next());
		System.out.println("input lokasi ruang kelas");
		setLokasi_ruang(in.next());
		System.out.println("pilih fakultas");
		setFakultas(in.next());
	}

	public void input_kondisi_ruang_kelas() {
		System.out.println("masukan panjang");
		setPanjang_ruang(in.nextInt());
		System.out.println("masukan lebar");
		setLebar_ruang(in.nextInt());
		System.out.println(+hitung_luas_ruang());
		System.out.println("masukan jumlah kursi");
		setJumlah_kursi(in.nextInt());
		System.out.println(+hitung_rasio_luas());
		System.out.println("masukan jumlah pintu");
		ambil.setJumlah_pintu(in.nextInt());
		System.out.println("masukan jumlah jendela");
		ambil.setJumlah_jendela(in.nextInt());
		analisis_pintu_dan_jendela();
	}

	double hitung_luas_ruang() {
		return ambil.getPanjang_ruang() * ambil.getLebar_ruang();
	}

	public String hitung_bentuk_ruang() {
		String bentuk = "persegi panjang";
		if (ambil.getPanjang_ruang() != ambil.getLebar_ruang()) {
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
		hasil = hitung_luas_ruang() / ambil.getJumlah_kursi();
		if (hasil >= 0.5) {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai kembali memasukan data");
			input_kondisi_ruang_kelas();
		}
		return hasil;
	}

	public String analisis_pintu_dan_jendela() {
            String hasil;
		if (ambil.getJumlah_pintu() >= 2 && ambil.getJumlah_jendela() >= 1) {
			hasil="sesuai";
		} else {
			hasil="tidak sesuai";
		}
            return hasil ;
	}

	public void kondisi_dan_posisi_sarana() {
		System.out.println("masukan jumlah steker atau stop kontak");
		ambil.setJumlah_steker(in.nextInt());
                for(i=0;i>ambil.getJumlah_steker();i++){
                    r=i+1;
                    System.out.println("Kondisi steker baik/buruk : ");
                    ambil.setKondisi_steker(in.next());
                    if (ambil.getKondisi_steker().equalsIgnoreCase("baik")){
                        steker++;
                    }
                }
		System.out.println("posisi steker \n1. Di pojok Ruang dan di dekat dosen n\2. Di pojok ruang n\3. dekat dosen  ");
		ambil.setPosisi_steker(in.next());
		analisis_kelistrikan();
		System.out.println("input jumlah kabel LCD");
		ambil.setJumlah_kabel_LCD(in.nextInt());
                for(i=0;i>ambil.getJumlah_kabel_LCD();i++){
                    r=i+1;
		System.out.println("kondisi kabel LCD baik/ buruk");
		ambil.setKondisi_kabel_LCD(in.next());
                if (ambil.getKondisi_steker().equalsIgnoreCase("baik")){
                        LCD++;
                    }
                }
		System.out.println("posisi kabel LCD n\1. dekat dosen n\2. tidak dekat dosen");
		ambil.setPosisi_kabel_LCD(in.next());
		System.out.println("jumlah lampu");
		ambil.setJumlah_lampu(in.nextInt());
                for(i=0;i>ambil.getJumlah_lampu();i++){
                    r=i+1;
		System.out.println("kondisi lampu baik/buruk");
		ambil.setKondisi_lampu(in.next());
                if (ambil.getKondisi_lampu().equalsIgnoreCase("baik")){
                        lampu++;
                    }
                }
                System.out.println("posisi :n\1. atap ruang n\2. bukan di atap ruang");
                ambil.setPosisi_lampu(in.next());
		System.out.println("jumlah kipas angin");
		ambil.setJumlah_kipas_angin(in.nextInt());
                for(i=0;i>ambil.getJumlah_kipas_angin();i++){
                    r=i+1;
		System.out.println("kondisi kipas angin ");
		ambil.setKondisi_kipas_angin(in.next());
		if(ambil.getKondisi_kipas_angin().equalsIgnoreCase("baik")){
                    kipas++;
                }
                }
                System.out.println("posisi kipas n\1. atap ruang n\2. bukan atap ruang ");
                ambil.setPosisi_kipas_angin(in.next());
		System.out.println("jumlah AC");
		ambil.setJumlah_AC(in.nextInt());
                for(i=0;i>ambil.getJumlah_AC();i++){
                    r=i+1;
		System.out.println("kondisi AC");
		ambil.setKondisi_AC(in.next());
                if(ambil.getKondisi_AC().equalsIgnoreCase("baik")){
                    AC++;
                }}
		System.out.println("posisi AC n\1. dibelakang atau di samping n/2. bukan dibelakang ataupun bukan disamping");
		ambil.setPosisi_AC(in.next());
		System.out.println("pilih SSID");
		ambil.setSSID(in.next());
		System.out.println("bandwidth");
		ambil.setBandwidth(in.next());
		analisis_internet();
		System.out.println("jumlah cctv");
		ambil.setJumlah_CCTV(in.nextInt());
                for(i=0;i>ambil.getJumlah_CCTV();i++){
                    r=i+1;
		System.out.println("kondisi baik cctv");
		ambil.setKondisi_CCTV(in.next());
                if(ambil.getKondisi_CCTV().equalsIgnoreCase("baik")){
                    CCTV++;
		System.out.println("posisi cctv n\1. depan dan belakang n\2.belakang n\3. depan n\4. bukan depan dan belakang");
		ambil.setPosisi_CCTV(in.next());
		analisis_CCTV();
                }
                }
        }
	public String analisis_kelistrikan() {
            if (ambil.getPosisi_steker().equalsIgnoreCase("1") && ambil.getJumlah_steker() >=4 && steker==4){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }return hasil;
            
	}

	public String analisis_LCD() {
	if (ambil.getPosisi_kabel_LCD().equalsIgnoreCase("1") && ambil.getJumlah_steker() >=1 && LCD==1){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }return hasil;
	}
	public String analisis_lampu() {
        if (ambil.getPosisi_lampu().equalsIgnoreCase("1") && ambil.getJumlah_lampu()>=18 && lampu==18){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }return hasil;
            
	}

	public String analisis_kipas_angin() {
	if (ambil.getPosisi_kipas_angin().equalsIgnoreCase("1") && ambil.getJumlah_lampu()>=2 && kipas==2){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }return hasil;
	}

	public String analisis_AC() {
	if (ambil.getPosisi_kipas_angin().equalsIgnoreCase("1") && ambil.getJumlah_lampu()>=2 && kipas==2){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }
        return hasil;
	}

	public String analisis_internet() {
		if (ambil.getSSID() == "UMM Hotspot") {
			hasil="sesuai";
			if (ambil.getBandwidth() == "bisa") {
				hasil="sesuai";
			}
		} else {
			hasil="tidak sesuai";
		}return hasil;

	}

	public String analisis_CCTV() {
	if (ambil.getPosisi_CCTV().equalsIgnoreCase("1") && ambil.getJumlah_CCTV()>=2 && CCTV==2){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }
        return hasil;

	}

	public void input_lingkungan_ruang_kelas() {
		System.out.println("kondisi lantai");
		ambil.setKondisi_lantai(in.next());
		System.out.println("kondisi dinding");
		ambil.setKondisi_dinding(in.next());
		System.out.println("kondisi atap");
		ambil.setKondisi_atap(in.next());
		System.out.println("kondisi pintu");
		ambil.setKondisi_pintu(in.next());
		System.out.println("kondisi jendela");
		ambil.setKondisi_jendela(in.next());
		analisis_kebersihan();
	}

	public void analisis_kebersihan() {
		if (ambil.getKondisi_lantai() == "bersih"
				&& ambil.getKondisi_dinding() == "bersih"
				&& ambil.getKondisi_atap() == "bersih"
				&& ambil.getKondisi_pintu() == "baik"
				&& ambil.getKondisi_jendela() == "bersih") {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void kebersihan_ruang_kelas() {
		System.out.println("masukan sirkulasi udara");
		ambil.setSirkulasi_udara(in.nextLine());
		analisis_sirkulasi_udara();
		System.out.println("masukan nilai pencahaan");
		ambil.setPencahayaan(in.nextInt());
		analisis_Pencahayaan();
		System.out.println("masukan kelembapan");
		ambil.setKelembapan(in.nextInt());
		System.out.println("Masukan suhu Celcius");
		ambil.setSuhu(in.nextInt());
		analisis_Suhu();

	}

	public void analisis_sirkulasi_udara() {
		if ("lancar".equals(ambil.getSirkulasi_udara())) {
			System.out.println("Sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void analisis_Pencahayaan() {
		if ((ambil.getPencahayaan() >= 250) && ambil.getPencahayaan() <= 350) {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public String analisis_Kelembapan() {
		if ((ambil.getKelembapan() >= 70) && ambil.getKelembapan() <= 80) {
			hasil="Sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_Suhu() {
		if ((ambil.getSuhu() >= 25) && ambil.getSuhu() <= 35) {
			hasil="sesuai";
		} else {
			hasil="tidak sesuai";
		}
                return hasil;
	}

	public void kenyamanan_ruang_kelas() {
		System.out.println("masukan kebisingan");
		ambil.setKebisingan(in.nextInt());
		analisis_kebisingan();
		System.out.println("masukan bau");
		ambil.setBau(in.nextLine());
		analisis_bau();
		System.out.println("masukan kebocoran");
		ambil.setKebocoran(in.nextLine());
		analisis_kebocoran();
		System.out.println("masukan kerusakan");
		ambil.setKerusakan(in.nextLine());
		analisis_kerusakan();
		System.out.println("masukan keausan");
		ambil.setKeausan(in.nextLine());
		analisis_keausan();
	}

	public void analisis_kebisingan() {
		if ("tidak bising".equals(ambil.getKebisingan())) {
			System.out.println("Sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void analisis_bau() {
		if ("tidak bau".equals(ambil.getBau())) {
			System.out.println("Sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void analisis_kebocoran() {
		if ("tidak bocor".equals(ambil.getKebocoran())) {
			System.out.println("Sesuai");
	} else {  		
			System.out.println("tidak sesuai");
		}
	}

	public void analisis_kerusakan() {
		if ("tidak rusak".equals(ambil.getKerusakan())) {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void analisis_keausan() {
		if ("tidak aus".equals(ambil.getKeausan())) {
			System.out.println("Sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void keamanan_ruang() {
		System.out.println("input kekokohan");
		ambil.setKekokohan(in.next());
		analisis_kekokohan();
		System.out.println("jumlah kunci pintu");
		ambil.setJumlah_kunci(in.nextInt());
		System.out.println("jumlah jendela");
		analisis_kunci_pintu_jendela();
		ambil.setJumlah_jendela(in.nextInt());
		System.out.println("bahaya atau aman ?");
	}

	public void analisis_kekokohan() {
		if (ambil.getKekokohan() == "kokoh") {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void analisis_kunci_pintu_jendela() {
		if (getJumlah_kunci() != 0 && ambil.getJumlah_jendela() != 0) {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public String analisis_keamanan_ruang() {
		if (getBahaya() == "aman") {
			hasil="sesuai";
		}return hasil;
	}

	public void list_inputan() {

	}
        public void tampil (){
            System.out.println("ruang : "+super.getNama_ruang());
            System.out.println("lokasi:"+super.getLokasi_ruang());
            System.out.println("fakultas : "+super.getFakultas());
            System.out.println("panjang ruang :"+super.getPanjang_ruang());
        }
}
