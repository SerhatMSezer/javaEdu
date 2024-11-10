public class JumpBreak {
    public static void main(String[] args) {


        for(int sayac = 0; sayac <= 10; sayac++) {
            System.out.println(sayac);
            if(sayac == 3) {
                break;
            }
        }
        System.out.println("uygulama kapanıyor.");


        for (int i = 0; i < 10; i++)
        {
            // If the number is even
            // skip and continue
            if (i % 2 == 0)
                continue;
            // If number is odd, print it
            System.out.print(i + " ");
        }

        boolean t = true;
        System.out.println("Before the return.");
        if (t)
            return;
        System.out.println("This won't execute.");

    }
}
