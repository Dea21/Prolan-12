public class Motor {

    
    public static void main(String[] args) {
        data honda = new data();
        honda.nama="Honda";
        honda.ban="Michelin";
        honda.oli="Repsol";
        honda.info();
        overload motor = new overload();
        motor.over();
        parameter method = new parameter();
        System.out.println("parameter+this:");
        method.tampilmerek("Honda Blade");
        System.out.println("turunan:");
        int a=10; int b=5;
        inheritanceturunan inh = new inheritanceturunan();
        inh.tambahstok(a, b);
        inh.kurangstok(a, b);
        System.out.println("override:");
        override ov1 = new override();
        override2 ov2 = new override2();
        override3 ov3 = new override3();
        ov1.cc();
        ov2.cc();
        ov3.cc();
    }


    
}