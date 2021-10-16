import java.util.Scanner;

public class Segitiga {
    public static void main(String [] args){

        System.out.println("*******LOOPING BERSARANG*********");
        System.out.println("********  TIRZA UNGGU  **********");

            int pilih;
            Scanner pola = new Scanner(System.in);
            System.out.println("Pilih Bangun Datar yang diinginkan : ");
            System.out.println("1. Segitiga");
            System.out.println("2. Belah Ketupat");
            System.out.println("Pilihan : ");
            pilih = pola.nextInt();
            if (pilih == 1 ){
                segitiga();
            } else if (pilih == 2 ){
                belahketupat();
            }else {
                System.out.print("Pilihan tidak ditemukan");
            }
            }


    //Segitiga
    static void segitiga(){
        int i, j, X;
        System.out.println("Masukan Nilai : ");
        Scanner inputan = new Scanner(System.in);
        X = inputan.nextInt();
           
        for (i=0; i<=X; i++) {
            for (j=0; j<i; j++){
                  System.out.print("*");
            }
            System.out.println();
        }
    }
 
    //Belah Ketupat
    static void belahketupat() {
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int a = baca.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }
            for (int q = 1; q < 2*i; q++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i < a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int q = 1; q <= (a*2-1)-(2*i) ; q++) {
                System.out.print("*");
            }
            System.out.println("");
        
        }
    }



}