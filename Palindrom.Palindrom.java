import java.util.Scanner;
class Palindrom {

public static void Palindrom()
{
  System.out.print( "wpisz słowo " );
  Scanner sc = new Scanner( System.in );
  String slowo= sc.nextLine(); 
  String Tempwynik= " ";
  int dlug = slowo.length();
  int a ;
  int b ;
   b = dlug-1 ;
   a = dlug-1 ;

  int licznik = 0 ;
  int pol = (dlug/2);
  
  for (a = 0 ; a < pol ; a++ , b-- )   
      {
          char znaka = slowo.charAt(a);
          char znakb = slowo.charAt(b);
          if( znaka == znakb )
          {
          licznik++;
          }

  }
  if(licznik>=pol)
     {
     System.out.print( "To słowo jest Palindromem" );
     }
  else
  {
    System.out.print( "To słowo NIE jest Palindromem" );
  }
  
  }}