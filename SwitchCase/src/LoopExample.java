import java.util.Random;
import java.util.Scanner;

public class LoopExample
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int start=0,zar1,zar2,sayac=0;
        int randomZar1, randomZar2;
        Random rand = new Random();
        System.out.println("Birinci zarın tahminini yapınız! ");
        zar1= keyboard.nextInt();
        System.out.println("Ikinci zarın tahminini yapınız! ");
        zar2= keyboard.nextInt();

        while (true)
        {
            randomZar1=rand.nextInt(6) + 1;
            randomZar2=rand.nextInt(6) + 1;
            sayac=sayac+1;

            System.out.println(sayac + " . atış randomZar1 : " + randomZar1 + " randomZar2 : " + randomZar2);

            if(((randomZar1)==zar1 || (randomZar2==zar1))&&((randomZar1==zar2)||(randomZar2==zar2)))
            {
                System.out.println("tebrikler "+ sayac + " atışta" +" 5bin kazandınız.! ");
                break;
            }

        }
        switch (sayac)
        {
            case 5:
                System.out.println("10 kazandır");
                break;
                case 10:
                    System.out.println("7 kazandın");
                    break;
                    case 15:
                        System.out.println("spin kazandın");
                        break;
                        default:
                            break;
        }

      while(true)
        {
            System.out.println("Start Değişkenimiz: "+start);
            start++;
            if(start > 5)
            {
                break;
            }
        }

    }
}
