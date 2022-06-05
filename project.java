import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*import di Utama.java*/

	 
 //Evaluasi.Mahasiswa/Identitas Java
   class Identitas{
	private String nama;
	private String stambuk;
	//Setter Getter
	public void nama(String n){
		this.nama=n;
	}
	public void stambuk(String s){
		this.stambuk=s;
	}

	public String nama(){
		return this.nama;
	}
	public String stambuk(){
		return this.nama;
	}
}


//Evaluasi.Mahasiswa/Nilai.java
	class Nilai{
	private int tugas1;
	private int tugas2;
	private int mid;
	private int uas;
	//Setter Getter
	public void tugas1(int n){
			this.tugas1=n;
	}
	public void tugas2(int n){
			this.tugas2=n;
	}
	public void mid(int n){
			this.mid=n;
	}
	public void uas(int n){
			this.uas=n;
	}
		
	public int tugas1(){
	return this.tugas1;
	}
	public int tugas2(){
	return this.tugas2;
	}
	public int mid(){
	return this.mid;
	}
	
	public int uas(){
	return this.uas;
	}
	}
	
	
//Evaluasi.HitungNilai/HitungNilaiAkhir.java
	class HitungNilaiAkhir{
    double tugas;
	
	public double nilaiTugas(int tugas1,int tugas2){
	tugas=tugas1+tugas2;
	return tugas;
	}
		
	public double nilaiAkhir(double tugas,int mid,int uas){
	return (tugas*0.4)+(mid*0.3)+(uas*0.2);
	}

}


//Evaluasi/Utama.java
	class Main{
		public static void main (String args[]) throws IOException{
			Identitas Identitas=new Identitas();
			Nilai Nilai=new Nilai();
			HitungNilaiAkhir HitungNilaiAkhir=new HitungNilaiAkhir();
			
			//scanner
			String nama,stambuk;
			Scanner scanner = new Scanner(System.in);
			System.out.println("masukan nama:");
			nama=scanner.nextLine();
			System.out.println("masukan stambuk:");
			stambuk=scanner.nextLine();
			
			//Memasukan Nama
			Identitas.nama(nama);
			Identitas.stambuk(stambuk);
			
			//Mendapatkan Value Nama
			Identitas.nama();
			Identitas.stambuk();
			
			
			//buffered
			int tugas1,tugas2,mid,uas;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("masukan nilai tugas1:");
			tugas1= Integer.parseInt(br.readLine());
			System.out.println("masukan nilai tugas2:");
			tugas2= Integer.parseInt(br.readLine());
			System.out.println("masukan nilai mid:");
		    mid= Integer.parseInt(br.readLine());
			System.out.println("masukan nilai uas:");
			uas= Integer.parseInt(br.readLine());
			
			//Memasukan Nilai
			Nilai.tugas1(tugas1);
			Nilai.tugas2(tugas2);
			Nilai.mid(mid);
			Nilai.uas(uas);
			
			//Mendapatkan Nilai
			Nilai.tugas1();
			Nilai.tugas2();
			Nilai.mid();
			Nilai.uas();
			

			//Kalkulasi Nilai Akhir
			//double value nilai tugas
			double nilaitugas=HitungNilaiAkhir.nilaiTugas(Nilai.tugas1(),Nilai.tugas2());
			
			//double value nilai akhir
			double nilaiakhir=HitungNilaiAkhir.nilaiAkhir(nilaitugas,Nilai.mid(),Nilai.uas());
			
			
			System.out.println("-----Hasil Akhir----");
			
			System.out.println("Nama :"+Identitas.nama());
			System.out.println("Stambuk :"+Identitas.stambuk());

			System.out.println("Nilai Tugas :"+nilaitugas);
			System.out.println("Nilai Akhir :"+nilaitugas);
			
			
			
		}
}
