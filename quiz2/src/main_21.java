
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class main_21 {
    public static void menu() {
        System.out.println("+---------------------------------------+");
        System.out.println("|   SISTEM ANTRIAN RESTO ROYAL DELISH   |");
        System.out.println("+---------------------------------------+");
        System.out.println("| 1. Tambah Antrian                     |");
        System.out.println("| 2. Cetak Antrian                      |");
        System.out.println("| 3. Hapus Anntrian                     |");
        System.out.println("| 4. Laporan Pengurutan pesanan by nama |");
        System.out.println("| 5. Hitung total Pendapatan            |");
        System.out.println("| 6. Keluar                             |");
        System.out.println("+---------------------------------------+");
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        
        doubleLLP_21 listPembeli = new doubleLLP_21();
        doubleLL_21 listPesanan = new doubleLL_21();

        // Input data pembeli by program
        listPembeli.addLast(new pembeli_21("Iqbaal ", "09876544556"));
        listPembeli.addLast(new pembeli_21("Natasha", "08334455666"));
        listPembeli.addLast(new pembeli_21("Syahla", "091381776064"));
        
        System.out.println("+---------------------------------------+");
        System.out.println("|       QUIZ 2 PRATIKUM ASD TI - 1F     |");
        System.out.println("+---------------------------------------+");
        System.out.print("Dibuat Oleh : ");
        String nama = scS.nextLine();
        System.out.print("NIM         : ");
        int nim = sc.nextInt();
        System.out.print("Absen       : ");
        int absen = sc.nextInt();
        
        int menu = 0;
        
        doubleLL_21 s = new doubleLL_21();
        
        while (menu != 6){
            menu();
            System.out.print("Pilih (1- 5) : "); 
            menu = sc.nextInt();
            System.out.println("+---------------------------------------+");
            try {
                switch(menu) {
                    case 1:
                    System.out.println("----------------------------------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("----------------------------------------------");
                    System.out.println("Nomor Antrian : " + (listPembeli.size + 1));
                    System.out.print("Nama Customer : ");
                    String namaC = sc.nextLine();
                    System.out.print("No. HP : ");
                    String noHp = sc.nextLine();
                    listPembeli.addLast(new pembeli_21(namaC, noHp));
                    break;
                case 2:
                    listPembeli.print();
                    break;
                case 3:
                    System.out.println("----------------------------------------------");
                    System.out.println("Transaksi input pesanan");
                    System.out.println("----------------------------------------------");
                    listPembeli.removeFirst();
                    System.out.println("Nomor Pesanan : " + (listPesanan.size + 1));
                    System.out.print("Pesanan : ");
                    String pesanan = sc.nextLine();
                    System.out.print("Harga : ");
                    int harga = sc.nextInt(); sc.nextLine();
                    listPesanan.addLast(new pesanan_21(listPesanan.size + 1, pesanan, harga));
                    listPesanan.print();
                    break;
                case 4:
                    listPesanan.printSortByName();
                    break;
                case 5:
                    listPesanan.printSum();
                    break;
                case 6:
                    break;
                }
            } catch (Exception e){
                
            }
        } 
        
        
    }
}
