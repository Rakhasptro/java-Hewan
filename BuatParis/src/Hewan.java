public class Hewan {
    protected String nama;
    protected String suara;

    public Hewan(String nama, String suara) {
        this.nama = nama;
        this.suara = suara;
    }

    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara " + suara);
    }
}
