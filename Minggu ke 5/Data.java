public class Data {
    String Nama;
    String Alamat;
    int Umur;
    
public Data(String Nama,String Alamat,int Umur){
    this.Nama = Nama;
    this.Alamat = Alamat;
    this.Umur = Umur;
}

public String getNama(){
    return Nama;
}

public String getAlamat(){
    return Alamat;
}

public int getUmur(){
    return Umur;
}

public void setNama(String Nama){
  this.Nama = Nama;
 }
 
 public void setAlamat(String Alamat){
  this.Alamat = Alamat;
 }
 
 public void setUmur(int Umur){
  this.Umur = Umur;
 }
 
 

}