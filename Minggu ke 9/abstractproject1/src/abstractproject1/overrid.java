
package abstractproject1;


public class overrid extends Mahasiswa {

    @Override
    public void kuliah() {
        System.out.println("Mahasiswa menjalani kuliah dengan rajin dan sungguh-sungguh");
    }

    @Override
    public void lulus() {
        System.out.println("Mahasiswa lulus apabila nilai mata pelajaran D atau keatas");
    }

    @Override
    public void tidakLulus() {
        System.out.println("Mahasiswa tidak lulus apabila nilai mata pelajaran E");
    }
    
}
