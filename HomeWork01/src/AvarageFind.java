/*1 den 100'e kadar olan sayıların toplamını,
 ortalamasını bulup ekrana yazan java programını yazınız.*/

public class AvarageFind
{
    public static void main(String[] args)
    {
    int  total=0;
    float avarage;

    for(int i=0; i<101; i++)
    {
      total=total+i;

    }
        avarage= (float) total /100;

        System.out.println("Total : "+total );
        System.out.println("Average: "+avarage);

    }
}
