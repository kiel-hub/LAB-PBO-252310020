package Praktikum1;

import java.util.Scanner;

public class Latihan2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tanah tanah = new Tanah();
		int harga_tanah = 5000000;
		
		System.out.print("Masukkan luas tanah: ");
		tanah.luas = scanner.nextInt();
		
		int total_harga = tanah.luas * harga_tanah;
		
		System.out.println("Total harga adalah: " + total_harga);
	}
}
