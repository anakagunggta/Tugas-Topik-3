package com.company;

import java.util.ArrayList;

public class Jurusan {

    //attribut dari kelas jurusan
    private String kode;
    private String nama;
    private ArrayList<Mahasiswa> mhs = new ArrayList();

    //menggunakan konstruktor
    public
    Jurusan ( String kode, String nama ) {
        this.kode = kode;
        this.nama = nama;
    }

    public void addMahasiswa(Mahasiswa m){
        this.mhs.add(m);

    }

    //method get untuk memanggil atribut
    public
    String getNama () {
        return nama;
    }

    public
    String getKode () {
        return kode;
    }

    public
    ArrayList<Mahasiswa>  getMhs () {
        return mhs;
    }
}
