public class Mahasiswa extends Data {
    String NIM;
    
    public Mahasiswa(String Nama,String Alamat,int Umur,String NIM){
    super(Nama,Alamat,Umur);
    this.NIM = NIM;
}
    
    public String getNIM(){
        return NIM;
        
    }
    
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    
    public void infoMahasiswa(){
  System.out.println("\nInfo Mahasiswa");
  System.out.println("NIM\t\t: " + getNIM());
  System.out.println("Nama\t\t: " + getNama());
  System.out.println("Alamat\t\t: " + getAlamat());
  System.out.println("Umur\t\t: " + getUmur());
 }
    
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa("Dea","Bandung",20,"10115308");
        mhs.infoMahasiswa();
    }
}