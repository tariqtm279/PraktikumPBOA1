public class Coercion {
    public static void main(String[] args) throws Exception {
       //Percobaan No. 1 (deskripsi soal)
       int num = 65;
       System.out.println("Percobaan No. 1 Deskripsi Soal");
       System.out.println("Integer = " + num);
       System.out.println("Real = " + (double) num);
       System.out.println("Char = " + (char) num);

       //Percobaan 1.b
       System.out.println("\nPercobaan No. 1.b");
       double numKoma = (double) num;
       int numBaru = (int) numKoma;
       System.out.println("Real = " + numKoma);
       System.out.println("Integer = " + numBaru);

       //Percobaan 1.c
       System.out.println("\nPercobaan No. 1.c");
       String X = "1234";
       String Y = "5678";

       String S = X + Y;
       System.out.println("String Konkatenasi X+Y  = " + S);

       int Z = Integer.parseInt(X) + Integer.parseInt(Y);
       System.out.println("Integer Penjumlahan X+Y = " + Z);

       //Percobaan 1.d
       System.out.println("\nPercobaan No. 1.d");
       String P = "12.34";
       String Q = "56.78";

       String R = P + Q;
       System.out.println("String Konkatenasi P+Q  = " + R);

       double D = Double.parseDouble(P) + Double.parseDouble(Q);
       System.out.println("Double Penjumlahan P+Q = " + D);

       //Percobaan 1.e
       System.out.println("\nPercobaan No. 1.e");
       int A = Integer.parseInt(S);
       System.out.println("Konversi String S Menjadi Integer = " + A);

       //Percobaan 1.f
       String T = Integer.toString(A);
       System.out.println("Konversi Integer A Menjadi String = " + T);
    }
}
