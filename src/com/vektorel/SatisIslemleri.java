package com.vektorel;

import java.util.ArrayList;
import java.util.List;

public class SatisIslemleri {
	
	private List<Satis> SList = new ArrayList<Satis>();
	
	public void kaydet() {
		
		Satis st;
		
		st = new Satis();
		st.id = 1;
		st.musteriadsoyad = "Ibrahim Gulecyuz";
		st.personeladsoyad = "Ipek Gulecyuz";
		st.urunadi = "Apple Watch";
		st.adet = 10;
		st.urunfiyati = 1999.99;
		st.toplamtutar = 2999.99;
		SList.add(st);
		
		st = new Satis();
		st.id = 2;
		st.musteriadsoyad = "Lionel Messi";
		st.personeladsoyad = "Lebron James";
		st.urunadi = "iPhone";
		st.adet = 10;
		st.urunfiyati = 1999.99;
		st.toplamtutar = 2999.99;
		SList.add(st);
		
		st = new Satis();
		st.id = 3;
		st.musteriadsoyad = "Ekrem Imamoglu";
		st.personeladsoyad = "Binali Yildirim";
		st.urunadi = "Macbook Pro";
		st.adet = 10;
		st.urunfiyati = 1999.99;
		st.toplamtutar = 2999.99;
		SList.add(st);
		
		st = new Satis();
		st.id = 4;
		st.musteriadsoyad = "Ozgur Demirtas";
		st.personeladsoyad = "Evren Ekici";
		st.urunadi = "iPad Pro";
		st.adet = 10;
		st.urunfiyati = 1999.99;
		st.toplamtutar = 2999.99;
		SList.add(st);
	}
	
	public void kaydet(int id, String musteriadisoyadi, String personeladsoyad, String urunadi, double urunfiyati, int adet, double toplamtutar) {
		
		Satis st = new Satis();
		st.id = id;
		st.musteriadsoyad = musteriadisoyadi;
		st.personeladsoyad = personeladsoyad;
		st.urunadi = urunadi;
		st.urunfiyati = urunfiyati;
		st.adet = adet;
		st.toplamtutar = toplamtutar;
		SList.add(st);
	}
	
	public void listele() {
		
		System.out.println("$$$$$ SATIS ISLEMLERI $$$$$");
		for (Satis item : SList) {
			System.out.println(item.id + " - " + item.musteriadsoyad + " - " +item.personeladsoyad + " - " +item.urunadi + " - " +item.urunfiyati + " - " +item.adet + " - " +item.toplamtutar);
		}
		
	}
	
	public void bulId(int id) {
		
		for (Satis item : SList) {
			if(item.id == id)
			System.out.println(item.id + " - " + item.musteriadsoyad + " - " +item.personeladsoyad + " - " +item.urunadi + " - " +item.urunfiyati + " - " +item.adet + " - " +item.toplamtutar);

		}
	}
	
	//INCELE
	public void bulMAdi(String musteriadisoyadi) {
		
		for (int i = 0; i < SList.size(); i++) {
			if(SList.get(i).musteriadsoyad.equals(musteriadisoyadi)) {
				System.out.println(musteriadisoyadi);
			}
		}
	}
	
	public void sil(int id) {
		int silinecekid = -1;
		for (int i = 0; i < SList.size(); i++) {
			if(SList.get(i).id == id) {
				silinecekid = i;
			}			
			if(silinecekid>-1)
				SList.remove(silinecekid);
		}
		
	}
	
	public void duzenle(int id, String musteriadisoyadi, String personeladsoyad, String urunadi, double urunfiyati, int adet, double toplamtutar) {
		
		int duzenlenecekid = -1;
		for (int i = 0; i < SList.size(); i++) {
			if(SList.get(i).id == id)
				duzenlenecekid = i;
			Satis st = new Satis();
			st.id = id;
			st.musteriadsoyad = musteriadisoyadi;
			st.personeladsoyad = personeladsoyad;
			st.urunadi = urunadi;
			st.urunfiyati = urunfiyati;
			st.adet = adet;
			st.toplamtutar = toplamtutar;
			SList.set(duzenlenecekid, st);
		}
		
	}
	
	public List<Satis> listem(){
		return SList;
	}
	
	
}
