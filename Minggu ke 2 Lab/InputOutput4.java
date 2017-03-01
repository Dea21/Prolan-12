import java.util.Scanner;

class InputOutput4{
public static void main (String[] args){
    Scanner input = new Scanner(System.in);
	String nama;
	char jenisKelamin;
	int tinggiBadan;
	boolean menikah;
	
	System.out.println("Masukan Nama : ");
	nama=input.nextLine();
	System.out.println("Masukan jenis kelamin: ");
	jenisKelamin=input.next().charAt(0);
	System.out.println("Masukan Tinggi Badan: ");
	tinggiBadan = input.nextInt();
	System.out.println("Masukan Status Menikah : ");
	menikah = input.nextBoolean();
}
}