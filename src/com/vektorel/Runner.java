package com.vektorel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		SatisIslemleri st = new SatisIslemleri();
		int secim = -1;
		
		do {
		do {
			System.out.println("1- KAYDET");
			System.out.println("2- LISTELE");
			System.out.println("3- ID'sinden BUL");
			System.out.println("4- AD'indan BUL");
			System.out.println("5- SIL");
			System.out.println("6- DUZENLE");
			System.out.println("7- CIKIS YAP");
			Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Seciminiz...:");
			secim = sc.nextInt();
		}catch(Exception ex) {
			System.out.println("Lutfen gecerli bir deger giriniz.");
		}
		}while(secim<-1 || secim>7);
		
		if(secim==1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Personel Id Numarasi...:");
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("Musteri Adi ve Soyadi..: ");
			String musteriadsoyad = sc.nextLine();
			System.out.println("Personel Adi ve Soyadi.:");
			String personeladsoyad = sc.nextLine();
			System.out.println("Urun Adi...:");
			String urunadi = sc.nextLine();
			System.out.println("Urun Fiyati...:");
			double f = Double.parseDouble(sc.nextLine());
			System.out.println("Urun Adeti...:");
			int adet = Integer.parseInt(sc.nextLine());
			System.out.println("Toplam Tutar...:");
			double t = Double.parseDouble(sc.nextLine());
			
			st.kaydet(no, musteriadsoyad, personeladsoyad, urunadi, f, adet, t);
		}
		else if(secim==2) {
			st.listele();
		}
		else if(secim==3) {
			System.out.println("Bulunacak id numarasi...:");
			Scanner sc = new Scanner(System.in);
			int no = Integer.parseInt(sc.nextLine());
			st.bulId(no);
		}
		else if(secim==4) {
			System.out.println("Bulunacak Personel Adi...:");
			Scanner sc = new Scanner(System.in);
			String musteriadisoyadi = sc.nextLine();
			st.bulMAdi(musteriadisoyadi);
		}

		else if(secim==5) {
			System.out.println("Silinecek Personel Id...: ");
			Scanner sc = new Scanner(System.in);
			int no = Integer.parseInt(sc.nextLine());
		
			st.sil(no);
		}
		
		else if(secim==6) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Personel Id Numarasi...:");
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("Musteri Adi ve Soyadi..: ");
			String musteriadsoyad = sc.nextLine();
			System.out.println("Personel Adi ve Soyadi.:");
			String personeladsoyad = sc.nextLine();
			System.out.println("Urun Adi...:");
			String urunadi = sc.nextLine();
			System.out.println("Urun Fiyati...:");
			double f = Double.parseDouble(sc.nextLine());
			System.out.println("Urun Adeti...:");
			int adet = Integer.parseInt(sc.nextLine());
			System.out.println("Toplam Tutar...:");
			double t = Double.parseDouble(sc.nextLine());
			
			st.duzenle(no, musteriadsoyad, personeladsoyad, urunadi, f, adet, t);
		}
		
		else if(secim==7)
			break;
		
		}while(true);
		
		System.out.println("PROGRAM SONLANDIRILDI");

	
	} //MAIN METHODU SONU
		
		void SilinenKisim() {
//		SatisIslemleri st = new SatisIslemleri();
//		
//		st.kaydet();
//		
//		String aranacakDeger = "e";
//		
//		for (Satis item : st.listem()) {
//			if(item.musteriadsoyad.toUpperCase().contains(aranacakDeger.toUpperCase()))
//			System.out.println(item.musteriadsoyad);
//		}
	}
	
	
} //CLASS SONU
