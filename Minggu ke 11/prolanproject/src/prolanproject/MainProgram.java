
package prolanproject;

import java.util.Scanner;


public class MainProgram {

    
    public static void main(String[] args) {
        System.out.println("Selamat datang di toko motor Honda\n");
        System.out.println("Jumlah yang akan dibeli adalah 5\n");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        pembelian n = new pembelian();
        n.setjumlah(5);
        System.out.println("Jumlah : "+n.getjumlah());
        System.out.println("Harga Satuan : "+n.getHarga());
        System.out.println("total harga adalah : "+n.gettotalHarga());
    }
    
}
