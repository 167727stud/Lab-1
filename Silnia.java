import java.util.Scanner;
class Silnia {
public static void Silnia() 
{ 
  


    Scanner myInput = new Scanner( System.in );

  System.out.print( "Wpisz liczbę z której chcesz zrobić silnię " );
int rer = myInput.nextInt();
rer = rer + 1;
int Tempwynik= 1 ;
for(int pep = 1;pep<rer;pep++)
  {
    Tempwynik=Tempwynik*pep;
    
  }
   System.out.print( "wynik to "+Tempwynik );



}}