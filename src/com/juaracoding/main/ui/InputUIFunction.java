package com.juaracoding.main.ui;

import java.util.Scanner;

import com.juaracoding.main.function.Function;

public class InputUIFunction {
	Function function;
	double distance;
	double time;
	
	public InputUIFunction() {
		if(function == null) {
			function = new Function();
		}
	}
	
	
	
	public void showRataRataKecepatan() {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Masukkan Nilai Jarak = ");
		double distance = scan.nextDouble();
		
		System.out.print("Masukkan Nilai Waktu = ");
		double time = scan.nextDouble();
		
		System.out.println("Rata-rata kecepatan yang diperlukan adalah = " + function.averageSpeed(distance, time) + " Km/Jam");
	}
}
