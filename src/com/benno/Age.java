package com.benno;

public class Age {

    private int yearBirth, yearNow;
    private static final String RED = "\u001B[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur(){
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur){
        String meaning;

        if (umur >= 0 && umur <= 5 ){
            meaning = "LAGI LUCU-LUCU NYA";
        } else if (umur > 5 && umur <= 10){
            meaning = "MASIH ANAK-ANAK";
        } else if (umur > 10 && umur <= 13){
            meaning = "MASIH REMADJA";
        } else if (umur > 13 && umur <= 19){
            meaning = "ALAY";
        } else if (umur > 19 && umur <= 29){
            meaning = "LAGI GALAU NYARI JODOH";
        } else if (umur > 29 && umur <= 35){
            meaning = "LAGI SIBUK NYARI UANG";
        } else if (umur > 35 && umur <= 150){
            meaning = "SUDAH TUA";
        } else {
            meaning = "TIDAK TERDETEKSI DI KEHIDUPAN";
        }

        return RED + meaning;
    }
}
