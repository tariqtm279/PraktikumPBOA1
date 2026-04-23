class MainMahasiswa {
    public static void main(String[] args) {
        //objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa("999", "JuiceWorld", "Sastra Inggris");
        Mahasiswa mahasiswa3 = mahasiswa2;

        //testing
        System.out.println("Mahasiswa 1:");
        mahasiswa1.printInfo();

        System.out.println("\nMahasiswa 2:");
        mahasiswa2.printInfo();

        mahasiswa2.setProgramstudi();
        System.out.println("\nMahasiswa 2 setelah setProgramstudi():");
        mahasiswa2.printInfo();

        System.out.println("\nMahasiswa 3 (kloning dari mahasiswa 2):");
        mahasiswa3.printInfo();

        mahasiswa3.setProgramstudi("Teknik Arab");
        System.out.println("\nMahasiswa 3 setelah setProgramstudi(\"Teknik Arab\"):");
        mahasiswa3.printInfo();

        mahasiswa1.setProgramstudi(mahasiswa3);
        System.out.println("\nMahasiswa 1 setelah setProgramstudi(mahasiswa3):");
        mahasiswa1.printInfo();

        System.out.println("\nMahasiswa 2 setelah setProgramstudi(mahasiswa3):");
        mahasiswa2.printInfo();

    }
}