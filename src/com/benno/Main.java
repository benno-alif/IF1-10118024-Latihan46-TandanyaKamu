package com.benno;
import java.time.LocalDate;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Mengidentifikasi Seseorang melalui umur
     */


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
	    Age age = new Age(currentDate.getYear());

        System.out.print("Masukan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());
        System.out.println();

        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
}
