package dyas;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ruangkelas {
	Scanner in = new Scanner(System.in);
	ruang ambil = new ruang();

	public void input_identitas_ruang_kelas() {
		System.out.println("input ruang kelas");
		ambil.setNama_ruang(in.next());
		System.out.println("input lokasi ruang kelas");
		ambil.setLokasi_ruang(in.next());
		System.out.println("pilih fakultas");
		ambil.setFakultas(in.next());
	}

	public void input_kondisi_ruang_kelas() {
		System.out.println("masukan panjang");
		ambil.setPanjang_ruang(in.nextInt());
		System.out.println("masukan lebar");
		ambil.setLebar_ruang(in.nextInt());
		System.out.println(+hitung_luas_ruang());
		hitung_bentuk_ruang();
		System.out.println("masukan jumlah kursi");
		ambil.setJumlah_kursi(in.nextInt());
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

	public void hitung_bentuk_ruang() {
		String bentuk = "persegi panjang";
		if (ambil.getPanjang_ruang() != ambil.getLebar_ruang()) {
			System.out.println(bentuk);
			if (bentuk == "persegi panjang") {
				System.out.println("sesuai");
			}
		} else {
			System.out.println("bentuk tidak sesuai kembali memasukan data");
			input_kondisi_ruang_kelas();
		}
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
		System.out.println("masukan kondisi steker baik");
		ambil.setKondisi_steker(in.nextInt());
		System.out.println("posisi steker : ");
		ambil.setPosisi_steker(in.next());
		analisis_kelistrikan();
		System.out.println("input jumlah kabel LCD");
		ambil.setJumlah_kabel_LCD(in.nextInt());
		System.out.println("kondisi kabel LCD");
		ambil.setKondisi_kabel_LCD(in.next());
		System.out.println("posisi kabel LCD");
		ambil.setPosisi_kabel_LCD(in.next());
		analisis_LCD();
		System.out.println("jumlah lampu");
		ambil.setJumlah_lampu(in.nextInt());
		System.out.println("kondisi lampu baik");
		ambil.setKondisi_lampu(in.nextInt());
		analisis_lampu();
		System.out.println("jumlah kipas angin");
		ambil.setJumlah_kipas_angin(in.nextInt());
		System.out.println("kondisi kipas angin");
		ambil.setKondisi_kipas_angin(in.nextInt());
		analisis_kipas_angin();
		System.out.println("jumlah AC");
		ambil.setJumlah_AC(in.nextInt());
		System.out.println("kondisi AC");
		ambil.setKondisi_AC(in.next());
		System.out.println("posisi AC");
		ambil.setPosisi_AC(in.next());
		analisis_AC();
		System.out.println("pilih SSID");
		ambil.setSSID(in.next());
		System.out.println("bandwidth");
		ambil.setBandwidth(in.next());
		analisis_internet();
		System.out.println("jumlah cctv");
		ambil.setJumlah_CCTV(in.nextInt());
		System.out.println("kondisi baik cctv");
		ambil.setKondisi_CCTV(in.nextInt());
		System.out.println("posisi cctv");
		ambil.setPosisi_CCTV(in.next());
		analisis_CCTV();
	}

	public int analisis_kelistrikan() {
            int c=0;
		if (ambil.getJumlah_steker() >= 4) {
			System.out.println("sesuai");
			if (ambil.getKondisi_steker() == 1) {
                            c++;
				System.out.println("sesuai");
                        }else if (ambil.getKondisi_steker()==0){
                            System.out.println("tidak sesuai");
				if (ambil.getPosisi_steker() == "pojok ruang"
						|| ambil.getPosisi_steker() == "dekat dosen") {
					System.out.println("sesuai");
				}
			}
		} else {
			System.out.println("tidak sesuai");
		}
            return c;
	}

	public void analisis_LCD() {
		if ((ambil.getJumlah_kabel_LCD() >= 1)
				&& (ambil.getKondisi_kabel_LCD().equalsIgnoreCase("berfungsi") && (ambil
						.getPosisi_kabel_LCD().equalsIgnoreCase("dekat dosen")))) {
			System.out.println("layak atau sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}
	public int analisis_lampu() {
            int c =0;
		// int baik=18;
		if ((ambil.getJumlah_lampu() >= 18)) {
			System.out.println("sesuai");
			if (ambil.getKondisi_lampu() == 1) {
                                c++;
				System.out.println("sesuai");
                        }else if (ambil.getKondisi_lampu()==0){
                            System.out.println("Tidak sesuai");
				if (ambil.getPosisi_lampu() == "atap ruangan") {
					System.out.println("sesuai");
				}
			}
		} else {
			System.out.println("tidak sesuai");
		}
            return c;
	}

	public void analisis_kipas_angin() {
		if (ambil.getJumlah_kipas_angin() >= 2) {
			System.out.println("sesuai");
			if (ambil.getKondisi_kipas_angin() >= 2) {
				System.out.println("sesuai");
			}
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void analisis_AC() {
		if (ambil.getJumlah_AC() >= 1) {
			System.out.println("sesuai");
			if (ambil.getKondisi_AC() == "baik") {
				System.out.println("sesuai");
			}
		} else {
			System.out.println("tidak sesuai");
		}

	}

	public void analisis_internet() {
		if (ambil.getSSID() == "UMM Hotspot") {
			System.out.println("sesuai");
			if (ambil.getBandwidth() == "bisa") {
				System.out.println("sesuai");
			}
		} else {
			System.out.println("tidak sesuai");
		}

	}

	public void analisis_CCTV() {
		if (ambil.getJumlah_CCTV() == 2) {
			System.out.println("sesuai");
			if (ambil.getKondisi_CCTV() == 2) {
				System.out.println("sesuai");
			}
		}

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

	public void analisis_Kelembapan() {
		if ((ambil.getKelembapan() >= 70) && ambil.getKelembapan() <= 80) {
			System.out.println("Sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void analisis_Suhu() {
		if ((ambil.getSuhu() >= 25) && ambil.getSuhu() <= 35) {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
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
		if (ambil.getJumlah_kunci() != 0 && ambil.getJumlah_jendela() != 0) {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void analisis_keamanan_ruang() {
		if (ambil.getBahaya() == "aman") {
			System.out.println("sesuai");
		}
	}

	public void list_inputan() {

	}
}
