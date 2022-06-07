import java.util.Scanner;
class Main {
  Scanner myInput = new Scanner( System.in );
  
  public static void main(String[] args) 
{ System.out.print( "1-Zadanie 2_1 choinka");
  System.out.print(System.lineSeparator());  
  System.out.print( "2-Zadanie 2_2");
  System.out.print(System.lineSeparator());
  System.out.print( "3-Zadanie 2_3");
  System.out.print(System.lineSeparator());
  System.out.print( "4-Zadanie 2_4");
  System.out.print(System.lineSeparator());
  System.out.print( "5-Zadanie 2_5");
  System.out.print(System.lineSeparator());
  System.out.print( "6-stare zadanie 2_6");
  System.out.print(System.lineSeparator());
  System.out.print( "7-Zadanie 1_7 ");
  System.out.print(System.lineSeparator());
  int mem=2;
  for(;;){
  Scanner myInput = new Scanner( System.in );
  mem = myInput.nextInt();

 
  switch(mem)
  {
    case 1:
      Choinka.Choinka();
    
    break;
      
    case 2:
      Zamiana.Zamiana();

    break;

    case 3:
      Tabliczka.Tabliczka();

    break;

    case 4:
      Silnia.Silnia();

    break;

    case 5:
      Palindrom.Palindrom();

    break;

    case 6:

    break;

    case 7:

    break;
          case 8:

    break;

    case 9 :

    break;
                default:
 
  }
  
  
System.out.print(System.lineSeparator());
    System.out.print(System.lineSeparator());
    System.out.print(System.lineSeparator());
}}
}

