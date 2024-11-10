/*kullanıcıdan başlangıç ve bitiş değerleri alınır,
bu sayılarda dahil olmak üzere aralarındaki tüm çift sayıların toplamını ekrana yazdıran
java programını yazınız.*/

import java.util.Scanner;

public class EvenNumberFind
{
    public static void main(String[] args)
    {
        int basSayi, sonSayi, toplamSayi=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Baslangic degerini giriniz");
        basSayi= input.nextInt();
        System.out.println("Bitis dedgerini giriniz");
        sonSayi= input.nextInt();

        for (int i=basSayi; i<=sonSayi; i++)
        {

            if(i%2==0)
            {
                toplamSayi=toplamSayi+i;
            }

        }
        System.out.println("Cift Sayislarin Toplami : "+toplamSayi);

   }
}
