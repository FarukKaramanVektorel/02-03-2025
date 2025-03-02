package exeptionExample;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean islem=true;
		while (islem) {
			System.out.println("İşlem seçiniz 1 - Devam 0-Çıkış");
			int isl=in.nextInt();
			if(isl==1) {
				System.out.println("İlk sayıyı giriniz");
				int sayi1=in.nextInt();
				System.out.println("İlk sayıyı giriniz");
				int sayi2=in.nextInt();
				try {
					if(sayi2==0) {
						throw new IllegalArgumentException("Adam gibi sayı mı girsen");
					}
					System.out.println(sayi1/sayi2);
				} catch (ArithmeticException e) {
					System.out.println(e.getMessage());
				}
			}else {
				islem=false;
			}
			
		}
	}

}
