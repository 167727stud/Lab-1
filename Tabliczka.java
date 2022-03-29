import java.util.Scanner;
class Tabliczka {

public static void Tabliczka()
{
  System.out.print( "ocenę" );
  Scanner sc = new Scanner( System.in );
 double[] oceny = new double[6];
  oceny[0] = 4.0;
  oceny[1]= 5.0;
  oceny[2]= 3.5;
  oceny[3]= 4.5;
  oceny[4]= 5.0;
  oceny[5]= 2.0;
  double suma = 0.0;
  int ilosc = oceny.length;
  for (int i = 0; i < oceny.length; i++) 
  {
            suma += oceny[i];
  }
  double srednia = suma / ilosc;
  System.out.print( "średnia to " );
  System.out.println(srednia);
  
  }}