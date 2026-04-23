public class MainAnabul {
    public static void main(String[] args) {
        //objek
        Anabul k = new Kucing("Kitty Anabul");
        Anabul a = new Anjing("Doggy Anabul");
        Anabul b = new Burung("Tweety Anabul");

        // simulasi
        k.suara();
        k.gerak();

        a.suara();
        a.gerak();
        
        b.suara();
        b.gerak();
    
    }
}