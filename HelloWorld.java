public class HelloWorld{

     public static void main(String []args){
        
     long bigNumber = 600851475143L;         //liczba, ktorej najwiekszy pierwszy dzielnik jest poszukiwany
     int largestPrimeFactory = 0;       
     int factory = 0;
     int count = 0;
     for(int i=2; i<bigNumber; i++)  //petla szukajaca obojetnie jakiego dzielnika naszej liczby
     {
         if(bigNumber%i == 0)
         {
             factory = i;
             for(int j=2; j<i; j++)  //petla sprawdzajaca, czy znaleziona wyzej liczba jest liczba
             {                       //pierwsza
                 if(factory % j == 0)
                 {
                    count++;         //dodawanie kolejnych dzielnikow do analizowanej liczby
                 }
             }
         if(count > 0)              
             largestPrimeFactory = factory; //jesli nie znaleziono zadnych dzielnikow to oznacza,
         }                                  // ze analizowana liczba jest liczba pierwsza
     }
       System.out.println(largestPrimeFactory);  
     }
}
