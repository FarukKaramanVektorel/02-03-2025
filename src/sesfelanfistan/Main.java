package sesfelanfistan;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			Random rnd=new Random();
			int rgSayi=rnd.nextInt(5)+1;
			System.out.println("1-5 arasında bir sayı giriniz");
			int sayi=in.nextInt();
			if(sayi>0&&sayi<6) {
				sesCikart(sayi,rgSayi);
			}else {
				System.out.println("istemez eksik olsun");
			}
		}

	}

	public static void sesCikart(int sayi,int rgsayi) {
		String fli="";
		if(sayi==rgsayi) {
			fli="alkis.wav";
		}else {
			fli="yuh.wav";
		}
		
		
		File f = new File(fli);
		try {
			
			AudioInputStream ses = AudioSystem.getAudioInputStream(f);
			Clip clip = AudioSystem.getClip();
			clip.open(ses);

			clip.start();

			System.out.println("değerlendiriliyor...");

			Thread.sleep(clip.getMicrosecondLength() / 1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
