public class Main
{
    public static void main(String[] args)
    {
        double one = 0;
        double thirty = 30;
        double eight = 0;
        double ten = 10;

        for(one = 0; one < 31; one += 1)
        {
            System.out.printf("\n" + one);
        }
        for(thirty = 30; thirty >= 0; thirty -= 1)
        {
            System.out.printf("\n" + thirty);
        }
        for(eight = 0; eight < 19; eight += 3)
        {
            System.out.printf("\n" + eight);
        }
        for(ten = 10; ten >= 0; ten -= 2)
        {
            System.out.printf("\n" + ten);
        }
        System.out.println();

        for(int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <= 5; col++)
            {
                System.out.print("*");
            }
            System.out.println(); // don't want everything on one line!
        }
        for(int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <= 5; col++)
            {
                if (col <= row)
                System.out.print("*");
            }
            System.out.println(); // don't want everything on one line!
        }
        for(int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <= 5; col++)
            {
                if (col >= row)
                    System.out.print("*");
            }
            System.out.println(); // don't want everything on one line!
        }

    }
}