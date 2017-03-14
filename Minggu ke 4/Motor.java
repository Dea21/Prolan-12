public class Motor{
	public static void main(String[] args){
		Motor method = new Motor();
		method.slogan("Honda");
		method.slogan("Honda","One Heart");
	}
	
	private void slogan(String nama){
		System.out.println(nama);
	}
	
	private void slogan(String nama1, String nama2){
		System.out.println(nama1+nama2);
	}
}