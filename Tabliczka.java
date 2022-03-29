import java.util.Scanner;
class Zamiana {

public static void Zamiana()
{
  System.out.print( "wpisz słowo " );
  Scanner sc = new Scanner( System.in );
    String slowo= sc.nextLine(); 
  String Tempwynik= " ";
  char znak;
  int kod;
  int licznik=0;
  for (int i = 0 ; i < slowo.length() ; i++)   
      {
      znak = slowo.charAt(i);
      kod= (int) znak;
        if (kod >=97 && kod <=122)
        {
          kod = kod - 32;
          znak = (char)kod;
          ;
        }
        else{
        if (kod >=65 && kod <=90)
        {
          kod = kod + 32;
          znak = (char)kod;
          licznik++;
        }}
        Tempwynik = Tempwynik + znak;
  }
  System.out.print( "słowo wygląda tak "+Tempwynik+" a ilość poprawek to "+licznik );
  }}