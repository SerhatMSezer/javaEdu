/*
Öğrenci Not Hesaplama.
öğrencilerin 1 adet vize, 1 adet final notu alınacak.
daha sonrasında vize sınavının %40'ı, final sınavının %60'ını alıp toplayıp, notunu bulunuz.
eğer notu 45 den küçükse (<45) -> FF
eğer notu 45 ile 60 arasındaysa(<=45 -> CB
eğer notu 60-70 (<=60)arasında ise -> BB
eğer notu 70-85(<=70) ise -> BA
eğer notu 85- 100(<=85) ise -> AA
*/

import java.util.Scanner;

public class CourseCalculate
{
    public static void main(String[] args)
    {
        int  avarageNot,vizeNot, finalNot = 0;
        float floatAvarageNot = 0.0F;
        Scanner scan = new Scanner(System.in);
        System.out.print("Vize Notunu Giriniz: ");
        vizeNot = scan.nextInt();
        System.out.print("Final Notunu Giriniz: ");
        finalNot = scan.nextInt();

        floatAvarageNot =((float) (vizeNot * 40) /100) + ((float) (finalNot * 60) /100);
        avarageNot = (int) floatAvarageNot;

        if(avarageNot >= 85 && avarageNot < 100)
        {
            System.out.println("Notunuz AA dir");
        }
        else if(avarageNot >= 70 && avarageNot < 85)
        {
            System.out.println("Notunuz BA dir");
        }
        else if (avarageNot >= 60 && avarageNot < 70)
        {
            System.out.println("Notunuz BB dir");
        }
        else if (avarageNot >= 45 && avarageNot < 60)
        {
            System.out.println("Notunuz CB dir");
        }
        else if(avarageNot < 45)
        {

            System.out.println("Notunuz FF dir");
        }
        else
        {
            System.out.println("Gecersiz not veya notlar girdiniz");
        }


    }
}
