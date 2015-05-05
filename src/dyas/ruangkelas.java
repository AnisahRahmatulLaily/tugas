package dyas;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

abstract public class ruangkelas extends ruang{
	Scanner in = new Scanner(System.in);
	//ruang ambil = new ruang();
        int i,r,LCD=0,AC=0,lampu=0, kipas=0,steker=0,CCTV=0;
        String hasil;
@Override
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
		setJumlah_pintu(in.nextInt());
		System.out.println("masukan jumlah jendela");
		setJumlah_jendela(in.nextInt());
		analisis_pintu_dan_jendela();
	}

	double hitung_luas_ruang() {
		return getPanjang_ruang() * getLebar_ruang();
	}

	public String hitung_bentuk_ruang() {
		String bentuk = "persegi panjang";
		if (getPanjang_ruang() != getLebar_ruang()) {
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
		hasil = hitung_luas_ruang() / getJumlah_kursi();
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
		if (getJumlah_pintu() >= 2 && getJumlah_jendela() >= 1) {
			hasil="sesuai";
		} else {
			hasil="tidak sesuai";
		}
            return hasil ;
	}

	public void kondisi_dan_posisi_sarana() {
		System.out.println("masukan jumlah steker atau stop kontak");
		setJumlah_steker(in.nextInt());
                for(i=0;i>getJumlah_steker();i++){
                    r=i+1;
                    System.out.println("Kondisi steker baik/buruk : ");
                    setKondisi_steker(in.next());
                    if (getKondisi_steker().equalsIgnoreCase("baik")){
                        steker++;
                    }
                }
		System.out.println("posisi steker \n1. Di pojok Ruang dan di dekat dosen n\2. Di pojok ruang n\3. dekat dosen  ");
		setPosisi_steker(in.next());
		System.out.println("input jumlah kabel LCD");
		setJumlah_kabel_LCD(in.nextInt());
                for(i=0;i>getJumlah_kabel_LCD();i++){
                    r=i+1;
		System.out.println("kondisi kabel LCD baik/ buruk");
		setKondisi_kabel_LCD(in.next());
                if (getKondisi_steker().equalsIgnoreCase("baik")){
                        LCD++;
                    }
                }
		System.out.println("posisi kabel LCD n\1. dekat dosen n\2. tidak dekat dosen");
		setPosisi_kabel_LCD(in.next());
		System.out.println("jumlah lampu");
		setJumlah_lampu(in.nextInt());
                for(i=0;i>getJumlah_lampu();i++){
                    r=i+1;
		System.out.println("kondisi lampu baik/buruk");
		setKondisi_lampu(in.next());
                if (getKondisi_lampu().equalsIgnoreCase("baik")){
                        lampu++;
                    }
                }
                System.out.println("posisi :n\1. atap ruang n\2. bukan di atap ruang");
                setPosisi_lampu(in.next());
		System.out.println("jumlah kipas angin");
		setJumlah_kipas_angin(in.nextInt());
                for(i=0;i>getJumlah_kipas_angin();i++){
                    r=i+1;
		System.out.println("kondisi kipas angin ");
		setKondisi_kipas_angin(in.next());
		if(getKondisi_kipas_angin().equalsIgnoreCase("baik")){
                    kipas++;
                }
                }
                System.out.println("posisi kipas n\1. atap ruang n\2. bukan atap ruang ");
                setPosisi_kipas_angin(in.next());
		System.out.println("jumlah AC");
		setJumlah_AC(in.nextInt());
                for(i=0;i>getJumlah_AC();i++){
                    r=i+1;
		System.out.println("kondisi AC");
		setKondisi_AC(in.next());
                if(getKondisi_AC().equalsIgnoreCase("baik")){
                    AC++;
                }}
		System.out.println("posisi AC n\1. dibelakang atau di samping n/2. bukan dibelakang ataupun bukan disamping");
		setPosisi_AC(in.next());
		System.out.println("pilih SSID");
		setSSID(in.next());
		System.out.println("bandwidth");
		setBandwidth(in.next());
		analisis_internet();
		System.out.println("jumlah cctv");
		setJumlah_CCTV(in.nextInt());
                for(i=0;i>getJumlah_CCTV();i++){
                    r=i+1;
		System.out.println("kondisi baik cctv");
		setKondisi_CCTV(in.next());
                if(getKondisi_CCTV().equalsIgnoreCase("baik")){
                    CCTV++;
		System.out.println("posisi cctv n\1. depan dan belakang n\2.belakang n\3. depan n\4. bukan depan dan belakang");
		setPosisi_CCTV(in.next());
		analisis_CCTV();
                }
                }
        }
	public String analisis_kelistrikan() {
            if (getPosisi_steker().equalsIgnoreCase("1") && getJumlah_steker() >=4 && steker==4){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }return hasil;
            
	}

	public String analisis_LCD() {
	if (getPosisi_kabel_LCD().equalsIgnoreCase("1") && getJumlah_steker() >=1 && LCD==1){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }return hasil;
	}
	public String analisis_lampu() {
        if (getPosisi_lampu().equalsIgnoreCase("1") && getJumlah_lampu()>=18 && lampu==18){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }return hasil;
            
	}

	public String analisis_kipas_angin() {
	if (getPosisi_kipas_angin().equalsIgnoreCase("1") && getJumlah_lampu()>=2 && kipas==2){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }return hasil;
	}

	public String analisis_AC() {
	if (getPosisi_kipas_angin().equalsIgnoreCase("1") && getJumlah_lampu()>=2 && kipas==2){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }
        return hasil;
	}

	public String analisis_internet() {
		if (getSSID() == "UMM Hotspot") {
			hasil="sesuai";
			if (getBandwidth() == "bisa") {
				hasil="sesuai";
			}
		} else {
			hasil="tidak sesuai";
		}return hasil;

	}

	public String analisis_CCTV() {
	if (getPosisi_CCTV().equalsIgnoreCase("1") && getJumlah_CCTV()>=2 && CCTV==2){
                hasil="sesuai";
            }else{
                hasil="tidak sesuai";
            }
        return hasil;

	}
	public void input_lingkungan_ruang_kelas() {
		System.out.println("kondisi lantai");
		setKondisi_lantai(in.next());
		System.out.println("kondisi dinding");
		setKondisi_dinding(in.next());
		System.out.println("kondisi atap");
		setKondisi_atap(in.next());
		System.out.println("kondisi pintu");
		setKondisi_pintu(in.next());
		System.out.println("kondisi jendela");
		setKondisi_jendela(in.next());
		analisis_kebersihan();
	}

	public String analisis_kebersihan() {
		if (getKondisi_lantai() == "bersih"
				&& getKondisi_dinding() == "bersih"
				&& getKondisi_atap() == "bersih"
				&& getKondisi_pintu() == "baik"
				&& getKondisi_jendela() == "bersih") {
			hasil="sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public void kebersihan_ruang_kelas() {
		System.out.println("masukan sirkulasi udara");
		setSirkulasi_udara(in.nextLine());
		analisis_sirkulasi_udara();
		System.out.println("masukan nilai pencahaan");
		setPencahayaan(in.nextInt());
		analisis_Pencahayaan();
		System.out.println("masukan kelembapan");
		setKelembapan(in.nextInt());
		System.out.println("Masukan suhu Celcius");
		setSuhu(in.nextInt());
		analisis_Suhu();

	}

	public String analisis_sirkulasi_udara() {
		if ("lancar".equals(getSirkulasi_udara())) {
			hasil="Sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_Pencahayaan() {
		if ((getPencahayaan() >= 250) && getPencahayaan() <= 350) {
			hasil="sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_Kelembapan() {
		if ((getKelembapan() >= 70) && getKelembapan() <= 80) {
			hasil="Sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_Suhu() {
		if ((getSuhu() >= 25) && getSuhu() <= 35) {
			hasil="sesuai";
		} else {
			hasil="tidak sesuai";
		}
                return hasil;
	}

	public void kenyamanan_ruang_kelas() {
		System.out.println("masukan kebisingan");
		setKebisingan(in.nextInt());
		analisis_kebisingan();
		System.out.println("masukan bau");
		setBau(in.nextLine());
		analisis_bau();
		System.out.println("masukan kebocoran");
		setKebocoran(in.nextLine());
		analisis_kebocoran();
		System.out.println("masukan kerusakan");
		setKerusakan(in.nextLine());
		analisis_kerusakan();
		System.out.println("masukan keausan");
		setKeausan(in.nextLine());
		analisis_keausan();
	}

	public String analisis_kebisingan() {
		if ("tidak bising".equals(getKebisingan())) {
			hasil="Sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_bau() {
		if ("tidak bau".equals(getBau())) {
			hasil="Sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_kebocoran() {
		if ("tidak bocor".equals(getKebocoran())) {
			hasil="Sesuai";
	} else {  		
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_kerusakan() {
		if ("tidak rusak".equals(getKerusakan())) {
			hasil="sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public String analisis_keausan() {
		if ("tidak aus".equals(getKeausan())) {
			hasil="Sesuai";
		} else {
			hasil="tidak sesuai";
		}return hasil;
	}

	public void keamanan_ruang() {
		System.out.println("input kekokohan");
		setKekokohan(in.next());
		System.out.println("jumlah kunci pintu");
		setJumlah_kunci(in.nextInt());
		System.out.println("jumlah jendela");
		setJumlah_jendela(in.nextInt());
		System.out.println("bahaya atau aman ?");
	}

	public void analisis_kekokohan() {
		if (getKekokohan() == "kokoh") {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void analisis_kunci_pintu_jendela() {
		if (getJumlah_kunci() != 0 && getJumlah_jendela() != 0) {
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
            System.out.println("lebar ruang :"+super.getLebar_ruang());
            System.out.println("luas ruang : "+this.hitung_luas_ruang());
            System.out.println("bentuk ruang :" +this.hitung_bentuk_ruang());
            System.out.println("jumlah kursi di dalam ruang : "+super.getJumlah_kursi());
            System.out.println("rasio luas ruang :" +this.hitung_rasio_luas());
            System.out.println("jumlah pintu : "+super.getJumlah_pintu());
            System.out.println("jumlah jendela :"+super.getJumlah_jendela());
            System.out.println("analisis pintu dan jendela : "+this.analisis_pintu_dan_jendela());
            System.out.println("jumlah steker : "+super.getJumlah_steker());
            System.out.println("kondisi steker "+super.getKondisi_steker());
            System.out.println("posisi steker :"+super.getPosisi_steker());
            System.out.println("analisis kelistrikan "+ this.analisis_kelistrikan());
            System.out.println("jumlah kabel LCD : "+super.getJumlah_kabel_LCD());
            System.out.println("kondisi kabel LCD : "+super.getKondisi_kabel_LCD());
            System.out.println("posisi kabel LCD : "+super.getPosisi_kabel_LCD());
            System.out.println("analisis kabel LCD : "+this.analisis_LCD());
            System.out.println("jumlah lampu dalam ruang : "+ super.getJumlah_lampu());
            System.out.println("kondisi lampu dalam ruang : "+super.getKondisi_lampu());
            System.out.println("posisi lampu dalam ruang: "+super.getKondisi_lampu());
            System.out.println("analisis lampu : "+this.analisis_lampu());
            System.out.println("jumlah kipas angin : "+super.getJumlah_kipas_angin());
            System.out.println("kondisi kipas angin :"+ super.getKondisi_kipas_angin());
            System.out.println("posisi kipas angin dalam ruang : " +super.getKondisi_kipas_angin());
            System.out.println("analisis kipas angin :"+this.analisis_kipas_angin());
            System.out.println("jumlah AC dalam ruangan : "+super.getJumlah_AC());
            System.out.println("kondisi AC dalam ruangan:  "+super.getKondisi_AC());
            System.out.println("posisi AC dalam ruangan : "+super.getPosisi_AC());
            System.out.println("analisis AC dalam ruang : "+ this.analisis_AC());
            System.out.println("inputan SSID : "+super.getSSID());
            System.out.println("inputan bandwidth :"+super.getBandwidth());
            System.out.println("analisis internet : "+this.analisis_internet());
        }
}
