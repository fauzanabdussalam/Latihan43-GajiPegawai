/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan43.gajipegawai;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menampilkan gaji pegawai
 *
 */
public class PBO10K10119901Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai g   = new GajiPegawai();
        Scanner scanner = new Scanner(System.in);
        
        String nama, alamat;
        int uangTransport, uangTunjangan, gajiPokok, totalGaji;
        
        System.out.println("### Program Gaji Karyawan PT. KAKATU ###");
        
        System.out.print("Masukkan Nama Karyawan \t\t : ");
        nama = scanner.next();
        g.setNama(nama);
        
        System.out.print("Masukkan Alamat \t\t : ");
        alamat = scanner.next();
        g.setAlamat(alamat);
        
        System.out.print("Masukkan Uang Transport \t : Rp. ");
        uangTransport = scanner.nextInt();
        g.setUangTransport(uangTransport);
        
        System.out.print("Masukkan Uang Tunjangan \t : Rp. ");
        uangTunjangan = scanner.nextInt();
        g.setUangTunjangan(uangTunjangan);
        
        System.out.print("Masukkan Gaji Pokok \t\t : Rp. ");
        gajiPokok = scanner.nextInt();
        g.setGajiPokok(gajiPokok);
        
        totalGaji = g.totalGaji(uangTunjangan, uangTransport, gajiPokok);
        g.setTotalGaji(totalGaji);
        
        System.out.println();
        
        g.tampilData(g.getNama(), g.getAlamat(), g.getUangTransport(), g.getUangTunjangan(), g.getGajiPokok(), g.getTotalGaji());
    }
    
}
