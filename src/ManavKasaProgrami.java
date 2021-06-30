import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        float armut,elma,domates,muz,patlican, toplam;
        double armutFiyati,elmaFiyati,domatesFiyati,muzFiyati,patlicanFiyati;
        //  Fiyati
        armutFiyati =  2.14f;
        elmaFiyati = 3.67f;
        domatesFiyati = 1.11f;
        muzFiyati = 0.95f;
        patlicanFiyati = 5.00f;
        // Meyveler ve Sebzeler girecek Kaç Kilo:

        System.out.println("Armut Kaç Kilo ?: ");
        armut =  input.nextInt();
        System.out.println("Elma Kaç Kilo ?: ");
        elma = input.nextInt();
        System.out.println("Domates Kaç Kilo ?: ");
        domates = input.nextInt();
        System.out.println("Muz Kaç Kilo ?: ");
        muz = input.nextInt();
        System.out.println("Patlıcan Kaç Kilo ?: ");
        patlican = input.nextInt();
        toplam = (float) ((armut*armutFiyati) + (elma*elmaFiyati) + (domates*domatesFiyati) + (muz*muzFiyati) + (patlican*patlicanFiyati));
        System.out.println("Toplam Tutar : " + toplam + " TL");




    }
}
