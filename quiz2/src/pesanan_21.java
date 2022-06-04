/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class pesanan_21 {
     int KodePesanan;
    String namaPesanan;
    int harga;

    public pesanan_21(int KodePesanan, String namaPesanan, int harga) {
        this.KodePesanan = KodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    public String toString() {
        return String.format("|%d\t|%s\t\t|%d", KodePesanan, namaPesanan, harga);
    }
}
