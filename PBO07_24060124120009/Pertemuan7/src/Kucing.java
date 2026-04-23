class Kucing extends Anabul {
    //Konstruktor
    Kucing(String nama){
        super(nama);
    }
    //method
    @Override
    void gerak (){
        System.out.println("Kucing bergerak dengan melata");
    }
    @Override
    void suara(){
        System.out.println("Kucing berbunyi meong");
    }

}