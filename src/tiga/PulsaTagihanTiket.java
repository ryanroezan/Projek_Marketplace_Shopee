package tiga;
import java.util.Scanner;
//Konsep Abstract class
abstract class AbstractPulsaTagihanTiket{
    Scanner input  = new Scanner(System.in);
   //abstract method
   abstract  void kategori_PulsaTagihanTiket();
   abstract void pulsa();
   abstract void TokenListrik();
   abstract void TiketBioskop();
}