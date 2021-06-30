import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long n1,n2,n3,sayi,i;
        n1=1;
        n2=1;
        System.out.printf("Hesaplamak istediğiniz basamak adedini giriniz: ");
        sayi=input.nextInt();
        System.out.printf(n1+" "+n2);
        for(i=2;i<sayi;i++)
            {
                 n3=n1+n2;
                 n1=n2;
                 n2=n3;
                 System.out.printf(" "+n3);
            }
       }
   }
