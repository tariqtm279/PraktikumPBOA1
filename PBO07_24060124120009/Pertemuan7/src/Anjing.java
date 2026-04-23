class Anjing extends Anabul {
    //Konstruktor
    Anjing(String nama){
        super(nama);
    }

    //method
    @Override
    void gerak (){
        System.out.println("Anjing bergerak dengan melata");
    }
    @Override
    void suara(){
        System.out.println("Anjing bersuara guk-guk");
    }

}