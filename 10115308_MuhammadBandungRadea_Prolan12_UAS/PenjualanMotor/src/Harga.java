public abstract class Harga {
    protected double hargaHonda = 10000000 ,hargaYamaha = 9000000 ,
            hargaSuzuki = 8000000 ,hargaKawasaki = 7000000;
    
    protected double getHargaH(){
        return hargaHonda;
    }
    
    protected double getHargaY(){
        return hargaYamaha;
    }
    
    protected double getHargaS(){
        return hargaSuzuki;
    }
    
    protected double getHargaK(){
        return hargaKawasaki;
    }
}
