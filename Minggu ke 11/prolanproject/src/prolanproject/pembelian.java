
package prolanproject;


public class pembelian {
    protected int harga = 10000000;
    protected int jumlah;
    
    
    
    public int getHarga(){
        return harga;
    }
    
    public int getjumlah(){
        return jumlah;
    }
    
    
    public void setjumlah(int jumlah){
        this.jumlah=jumlah;
    }
    
    private int totalHarga(int x, int y ){
       return x* y;
}
    
    public int gettotalHarga(){
        return totalHarga(harga,jumlah);
    } 
}
