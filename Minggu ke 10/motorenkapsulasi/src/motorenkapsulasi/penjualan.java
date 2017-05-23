
package motorenkapsulasi;


public class penjualan {
   private int stok = 20;
   private int penjualan ;
   private int sisa;
   
   public penjualan(){
       int stok = 20;
       int penjualan = 0;
   }
   
   private int sisa(int x , int y){
       return x - y;
   }
   
   public void setpenjualan(int penjualan){
       this.penjualan = penjualan;
   }
   
   public int getstok(){
       return stok;
   }
   
   public int getpenjualan(){
       return penjualan;
   }
   
   public int getsisa(){
       return sisa(stok,penjualan);
   }
}
