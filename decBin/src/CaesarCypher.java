import java.util.Scanner;
import java.util.*;

class CaesarCypher {

    int shift, i,n;
    String str;
    String str1;
    String str2;


         CaesarCypher () {

             int shift= i=n=0;
             String str="";
             String str1 = "";
             String str2 = "";

         }

         public  void dealwithCaesarCypher()
         {
             Scanner sc=new Scanner(System.in);

             System.out.println("Enter the plaintext");
             str=sc.nextLine();
             str=str.toLowerCase();
             n=str.length();
             char ch1[]=str.toCharArray();
             char ch3,ch4;
             System.out.println("Enter the shift value.");
             shift=sc.nextInt();

             System.out.println();
             System.out.println("Encrypted text is");
             str1=Caesarencrypt(str,shift);
             System.out.println(str1);

             System.out.println();
             System.out.println("Decrypted text is");

             char ch2[]=str1.toCharArray();
             for(i=0;i<str1. length(); i++)
             {
                 if(Character.isLetter(ch2[i]))
                 {
                     if(((int)ch2[i]-shift)<97)
                     {
                         ch4=(char)(((int)ch2[i]-shift-97+26)%26+97);

                     }
                     else
                     {
                         ch4=(char)(((int)ch2[i]-shift-97)%26+97);
                     }
                     str2=str2+ch4;
                 }

                 else if (ch2[i]==' ')
                 {
                     str2 = str2 + ch2[i];
                 }
             }
             System.out.println(str2);
         }

         public static String Caesarencrypt(String str, int shift)
         {


             int i;
             int n;

             char ch2;
             char ch3;
             String str1="";

             str=str.toLowerCase();
             n=str.length();
             char ch1[]=str.toCharArray();
             char ch4;

             for(i=0;i<n;i++)
             {
                 if (Character.isLetter(ch1[i]))
                 {
                     ch3=(char)(((int)ch1[i]+shift-97)%26+97);
                     System.out.println(ch1[i]+" = "+ch3);
                     str1=str1+ch3;
                 }
                 else if(ch1[i]==' ')
                 {
                     str1=str1+ch1[i];
                 }
             }
             return str1;

         }


         public static String CaesarDecrypt(String str, int shift)
         {

             int i;
             char ch4;
             String str1= "";
             String str2="";

             char ch2[]=str1.toCharArray();
             for(i=0;i<str1. length(); i++)
             {
                 if(Character.isLetter(ch2[i]))
                 {
                     if(((int)ch2[i]-shift)<97)
                     {
                         ch4=(char)(((int)ch2[i]-shift-97+26)%26+97);

                     }
                     else
                     {
                         ch4=(char)(((int)ch2[i]-shift-97)%26+97);
                     }
                     str2=str2+ch4;
                 }

                 else if (ch2[i]==' ')
                 {
                     str2 = str2 + ch2[i];
                 }
             }
             System.out.println(str2);
             return str2;



         }
    public static void letterToNumber()
    {
        /* I found a few different ways to do this:
         if (remainder <= 0)
            {
              codeLetter = 'A';
            }
            else if (remainder <= 1)
            {
              codeLetter='B';
              }
              //etc

        //or

        if (remainder <=26)
        {
        codeLetter= (char) ('A' + remainder)
        }

        // I found a few other examples online but I did not understand how they worked, can we go over them in class tomorrow?

        also currently trying to figure out how I can set the randomizer to a specific number. can I do this by editing the decbin array?








       */



    }


     }




