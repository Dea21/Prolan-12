public class overload {
    public void over(){
    overload method = new overload();
        System.out.println("overloading:");
		method.slogan("Honda");
		method.slogan("Honda","One Heart");
}
    public void slogan(String nama){
		System.out.println(nama);
	}
	
    public void slogan(String nama1, String nama2){
		System.out.println(nama1+nama2);
	}
}