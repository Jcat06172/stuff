import java.util.Scanner;
class Main
{

    static boolean booleanArray[];

    public  static void main(String[] args)
    {
       CaesarCypher c;
        int n, i=0,count = 0, a;
        booleanArray = new boolean[10];
        c= new CaesarCypher();

        c.dealwithCaesarCypher();




        for (i=0; i<10;i++)
        {
            booleanArray[i]=false;
        }
        i=0;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any decimal number:");
        n = s.nextInt();
        while(n > 0)
        {

            a = n % 2;
            if(a ==1)
            {
                count++;
            }
            x = a + "" +x;
            n = n / 2;
            if(n==1)
            {
                booleanArray[i]=false;
            }
            else
            {
                booleanArray[i]=true;

            }
            i++;

            displayboolarray();
        }







        }

        public static void displayboolarray()
        {
            int i=0;

            for (i=0; i<10;i++)
            {
                if (booleanArray[i]==false) System.out.print('1');
                else System.out.print('0');
            }
            System.out.println("");


        }

    }


