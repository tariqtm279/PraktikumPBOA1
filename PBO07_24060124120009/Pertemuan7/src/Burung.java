class Burung extends Anabul {
    //Konstruktor
    Burung(String nama){
        super(nama);
    }

    //method
    @Override
    void gerak (){
        System.out.println("Burung bergerak dengan terbang");
    }

    //method 
    @Override
    void suara(){
        System.out.println("Burung berbunyi cuit");
    }

}