package com.company;

public class Mahasiswa {

    //attribute clas mahasiswa
    private String nim, nama;

    //konstruktor dengan 2 parameter
    public
    Mahasiswa ( String nim, String nama ) {
        this.nim = nim;
        this.nama = nama;
    }

    //method get memanggil nim dan nama

    public
    String getNim () {
        return nim;
    }

    public
    String getNama () {
        return nama;
    }
}
