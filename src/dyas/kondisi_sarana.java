/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dyas;

/**
 *
 * @author TOSHIBA
 */
public abstract class kondisi_sarana extends ruangsuper{
    private String kondisi_steker;
    private String posisi_steker;
    private int jumlah_kabel_LCD;
    private String kondisi_kabel_LCD;
    private String posisi_kabel_LCD;
    private int jumlah_lampu;
    private String kondisi_lampu;
    private String posisi_lampu;
    private int jumlah_kipas_angin;
    private String kondisi_kipas_angin;
    private String posisi_kipas_angin;
    private int jumlah_AC;
    private String kondisi_AC;
    private String posisi_AC;
    private String SSID;
    private String bandwidth;
    private int jumlah_CCTV;
    private String kondisi_CCTV;
    private String posisi_CCTV;
    private int jumlah_steker;

    public void setJumlah_steker(int jumlah_steker) {
        this.jumlah_steker = jumlah_steker;
    }
    

    public void setKondisi_steker(String kondisi_steker) {
        this.kondisi_steker = kondisi_steker;
    }

    public void setPosisi_steker(String posisi_steker) {
        this.posisi_steker = posisi_steker;
    }

    public void setJumlah_kabel_LCD(int jumlah_kabel_LCD) {
        this.jumlah_kabel_LCD = jumlah_kabel_LCD;
    }

    public void setKondisi_kabel_LCD(String kondisi_kabel_LCD) {
        this.kondisi_kabel_LCD = kondisi_kabel_LCD;
    }

    public void setPosisi_kabel_LCD(String posisi_kabel_LCD) {
        this.posisi_kabel_LCD = posisi_kabel_LCD;
    }

    public void setJumlah_lampu(int jumlah_lampu) {
        this.jumlah_lampu = jumlah_lampu;
    }

    public void setKondisi_lampu(String kondisi_lampu) {
        this.kondisi_lampu = kondisi_lampu;
    }

    public void setPosisi_lampu(String posisi_lampu) {
        this.posisi_lampu = posisi_lampu;
    }

    public void setJumlah_kipas_angin(int jumlah_kipas_angin) {
        this.jumlah_kipas_angin = jumlah_kipas_angin;
    }

    public void setKondisi_kipas_angin(String kondisi_kipas_angin) {
        this.kondisi_kipas_angin = kondisi_kipas_angin;
    }

    public void setPosisi_kipas_angin(String posisi_kipas_angin) {
        this.posisi_kipas_angin = posisi_kipas_angin;
    }

    public void setJumlah_AC(int jumlah_AC) {
        this.jumlah_AC = jumlah_AC;
    }

    public void setKondisi_AC(String kondisi_AC) {
        this.kondisi_AC = kondisi_AC;
    }

    public void setPosisi_AC(String posisi_AC) {
        this.posisi_AC = posisi_AC;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public void setJumlah_CCTV(int jumlah_CCTV) {
        this.jumlah_CCTV = jumlah_CCTV;
    }

    public void setKondisi_CCTV(String kondisi_CCTV) {
        this.kondisi_CCTV = kondisi_CCTV;
    }

    public void setPosisi_CCTV(String posisi_CCTV) {
        this.posisi_CCTV = posisi_CCTV;
    }
 public int getJumlah_steker() {
        return jumlah_steker;
    }

    public String getKondisi_steker() {
        return kondisi_steker;
    }

    public String getPosisi_steker() {
        return posisi_steker;
    }

    public int getJumlah_kabel_LCD() {
        return jumlah_kabel_LCD;
    }

    public String getKondisi_kabel_LCD() {
        return kondisi_kabel_LCD;
    }

    public String getPosisi_kabel_LCD() {
        return posisi_kabel_LCD;
    }

    public int getJumlah_lampu() {
        return jumlah_lampu;
    }

    public String getKondisi_lampu() {
        return kondisi_lampu;
    }

    public String getPosisi_lampu() {
        return posisi_lampu;
    }

    public int getJumlah_kipas_angin() {
        return jumlah_kipas_angin;
    }

    public String getKondisi_kipas_angin() {
        return kondisi_kipas_angin;
    }

    public String getPosisi_kipas_angin() {
        return posisi_kipas_angin;
    }

    public int getJumlah_AC() {
        return jumlah_AC;
    }

    public String getKondisi_AC() {
        return kondisi_AC;
    }

    public String getPosisi_AC() {
        return posisi_AC;
    }

    public String getSSID() {
        return SSID;
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public int getJumlah_CCTV() {
        return jumlah_CCTV;
    }

    public String getKondisi_CCTV() {
        return kondisi_CCTV;
    }

    public String getPosisi_CCTV() {
        return posisi_CCTV;
    }
@Override
public void input_identitas(String nama,String lokasi, String fakultas){
    System.out.println("input ruang kelas");
    setNama_ruang(in.next());
    System.out.println("input lokasi ruang kelas");
    setLokasi_ruang(in.next());
    System.out.println("pilih fakultas");
    setFakultas(in.next());   
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
}