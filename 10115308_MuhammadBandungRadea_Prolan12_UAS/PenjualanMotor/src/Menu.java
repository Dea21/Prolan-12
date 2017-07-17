
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEA21
 */
public class Menu extends Harga{
    protected double getHargaH(){
        return super.getHargaH();
    }
    
    protected double getHargaY(){
        return super.getHargaY();
    }
    
    protected double getHargaS(){
        return super.getHargaS();
    }
    
    protected double getHargaK(){
        return super.getHargaK();
    }
    
    public void MenuM (){
    double  jumlah = 0,jumlah1 = 0,jumlah2;
        
        double diskon = 0,total = 0;
        String loop,pilihMenu ="";
        
        System.out.println("             Menu             ");
        System.out.println(" 1. Motor Honda   : Rp 10000000");
        System.out.println(" 2. Motor Yamaha  : Rp 9000000");
        System.out.println(" 3. Motor Suzuki  : Rp 8000000");
        System.out.println(" 4. Motor Kawasaki: Rp 7000000");
        
        Scanner scan = new Scanner (System.in);
        for(loop = "Y"; loop.equals ("Y") || loop.equals ("y");){
            System.out.println("Pilih Menu (1 s/d 4)  : ");
            int pilihan = scan.nextInt();
            
            switch(pilihan){
                case 1:
                    System.out.println("Anda memilih Motor Honda : Rp 10000000");
                    System.out.println("Jumlah Barang  : ");
                    jumlah = scan.nextInt();
                    pilihMenu = "Motor Honda"+pilihMenu;
                    
                    total = total + (hargaHonda * jumlah);
                    if(jumlah % 5 >= 0){
                        jumlah1 = jumlah/5;
                        jumlah2 = jumlah1 + jumlah;
                        System.out.println("Anda membeli Motor Honda sebanyak"+jumlah2+"unit");
                        System.out.println("Total Bayar Rp."+total);
                    }
                     if(total > 30000000){
                         diskon = total * 7/100;
                         total = total - diskon;
                         System.out.println("Anda mendapatkan potongan sebesar 5% senilai Rp."+diskon+
                                 "\nAnda cukup membayar Rp."+total);
                     }
                     break;
                case 2:
                    System.out.println("Anda memilih Motor Yamaha : Rp 9000000");
                    System.out.println("Jumlah Barang  : ");
                    jumlah = scan.nextInt();
                    pilihMenu = "Motor Yamaha"+pilihMenu;
                    
                    total = total + (hargaYamaha * jumlah);
                    if(jumlah % 5 >= 0){
                        jumlah1 = jumlah/5;
                        jumlah2 = jumlah1 + jumlah;
                        System.out.println("Anda membeli Motor Yamaha sebanyak"+jumlah2+"unit");
                        System.out.println("Total Bayar Rp."+total);
                    }
                     if(total > 27000000){
                         diskon = total * 7/100;
                         total = total - diskon;
                         System.out.println("Anda mendapatkan potongan sebesar 5% senilai Rp."+diskon+
                                 "\nAnda cukup membayar Rp."+total);
                     }
                     break;
                case 3:
                    System.out.println("Anda memilih motor Suzuki : Rp 8000000");
                    System.out.println("Jumlah Barang  : ");
                    jumlah = scan.nextInt();
                    pilihMenu = "Motor Suzuki"+pilihMenu;
                    
                    total = total + (hargaSuzuki * jumlah);
                    if(jumlah % 5 >= 0){
                        jumlah1 = jumlah/5;
                        jumlah2 = jumlah1 + jumlah;
                        System.out.println("Anda membeli Motor Suzuki sebanyak"+jumlah2+"unit");
                        System.out.println("Total Bayar Rp."+total);
                    }
                     if(total > 24000000){
                         diskon = total * 7/100;
                         total = total - diskon;
                         System.out.println("Anda mendapatkan potongan sebesar 5% senilai Rp."+diskon+
                                 "\nAnda cukup membayar Rp."+total);
                     }
                     break;
                case 4:
                    System.out.println("Anda memilih motor Kawasaki : Rp 7000000");
                    System.out.println("Jumlah Barang  : ");
                    jumlah = scan.nextInt();
                    pilihMenu = "Motor Kawasaki"+pilihMenu;
                    
                    total = total + (hargaKawasaki * jumlah);
                    if(jumlah % 5 >= 0){
                        jumlah1 = jumlah/5;
                        jumlah2 = jumlah1 + jumlah;
                        System.out.println("Anda membeli Motor Kawasaki sebanyak"+jumlah2+"unit");
                        System.out.println("Total Bayar Rp."+total);
                    }
                     if(total > 21000000){
                         diskon = total * 7/100;
                         total = total - diskon;
                         System.out.println("Anda mendapatkan potongan sebesar 5% senilai Rp."+diskon+
                                 "\nAnda cukup membayar Rp."+total);
                     }
                     break;
                default:
                         System.out.println("Maaf,input menu yang anda masukan tidak sesuai");
            }
            System.out.println("Ada lagi yang akan dipesan? (Y/N) : ");
            double totalakhir;
            totalakhir = (double) total;
            loop = scan.next();
        }
        System.out.println("Menu yang anda adalah   : "+pilihMenu);
        System.out.println("Total Keseluruhan Harga Barang   : "+total);
    }
    
    
}

