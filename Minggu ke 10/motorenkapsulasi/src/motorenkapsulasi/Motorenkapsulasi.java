
package motorenkapsulasi;


public class Motorenkapsulasi {

   
    public static void main(String[] args) {
        penjualan p = new penjualan();
        p.setpenjualan(10);
        System.out.println("stok : "+ p.getstok());
        System.out.println("penjualan : "+ p.getpenjualan());
        System.out.println("sisa stok : "+p.getsisa());
    }
    
}
