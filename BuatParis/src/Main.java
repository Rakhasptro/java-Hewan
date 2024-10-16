public class Main {

    public static void main(String[] args) {
        
        Kucing kucing = new Kucing("Kitty");
        Anjing anjing = new Anjing("Bulldog");

        hewanBersuara(kucing);  
        hewanBersuara(anjing);  
    }

    public static void hewanBersuara(Hewan hewan) {
        hewan.bersuara();
    }
}
