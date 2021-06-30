import java.util.Scanner;
public class okulPuanHarfNot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Okuldaki Sınavın Puanların Harfları (0-100) arasında:");
        System.out.println("Lütfen notunuzu giriniz:");
        int not = input.nextInt();
        if ( not >=90 && not <= 100){
            System.out.println(" Tebrikler, AA ile Başarılı geçiniz Katsayı 4.00");
        }else if (not >=80 && not < 90){
            System.out.println(" Tebrikler, BA ile Başarılı geçiniz Katsayı 3.50");
        }else if (not >=75 && not < 80){
            System.out.println(" Tebrikler, BB ile Başarılı geçiniz Katsayı 3.00");
        }else if (not >=70 && not < 75){
            System.out.println(" Tebrikler, CB ile Başarılı geçiniz Katsayı 2.50");
        }else if (not >=60 && not < 70){
            System.out.println("Tebrikler , CC ile Başarılı geçiniz Katsayı 2.00");
        }else if (not >=50 && not < 60){
            System.out.println("Tebrikler , DC ile Başarılı geçiniz Katsayı 1.50");
        }else if (not >=40 && not <50){
            System.out.println("Üzgünüm  , DD ile Başarsız geçiniz Katsayı 1.00");
        }else if (not >=30 && not < 40) {
            System.out.println("Üzgünüm  , FD ile Başarsız geçiniz Katsayı 0.50");
        }else if (not >=0 && not <30) {
            System.out.println("Üzgünüm  , DD ile Başarsız geçiniz Katsayı 0.00");
        }else  {
            System.out.println("Lütfen geçerli bir notu giriniz:");
        }


    }
}
