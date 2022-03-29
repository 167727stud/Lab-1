import java.util.Scanner;
class Choinka {
public static void Choinka() 
{ 
  


    Scanner myInput = new Scanner( System.in );

  System.out.print( "wpisz pierwszą liczbe " );
int rer = myInput.nextInt();
  int temp2=rer;

  System.out.print( "wpisz Drugą liczbe " );
  int heh = myInput.nextInt();
  int temp1= heh;

  for(int pow=0; pow<3;pow++){

  for(int pep = 0;pep<rer;pep++)
    {

for(int kek = 0;kek<rer;kek++)
        {
              System.out.print(".");

        }
      for(int lel = 0;lel<heh;lel++)
        {
          System.out.print("*");

        }
      rer--;
      heh++;

      System.out.print(System.lineSeparator());
    }
    heh=temp1;
    rer=temp2;
    }
      System.out.print("............|||||||............");
            System.out.print(System.lineSeparator());
      System.out.print("............|||||||............");
            System.out.print(System.lineSeparator());
      System.out.print("............|||||||............");


}}