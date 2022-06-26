package satu;
import satu.home;

//implementasi interface
//final keyword
final public class tampilan implements home{
  //overriding method
public void Tampilan_Home(){
    System.out.println("==================================================");
    System.out.println("===================  SHOPEE  =====================");
    System.out.println("==================================================");
    System.out.println(" \t\t    *SUPER*\n\t\t    SHOPPING\n \t\t     *DAY*");
    System.out.println("--------------------------------------------------");
    System.out.println("COD GRATIS ONGKIR Rp0 | CASHBACK 50% | DISKON ASIK");
    System.out.println("===================================================");
    System.out.println("");
}
//overloading method
public void Tampilan_Kategori(String MarketplaceKategori){
  System.out.println("--------------------------------------------------");
  System.out.println("              "+MarketplaceKategori);
  System.out.println("--------------------------------------------------");
}
//overloading method
public void Tampilan_Kategori(String KTG1, String KTG2, String KTG3,String KTG4, String KTG5, String KTG6){
  System.out.println("1. "+KTG1);
  System.out.println("2. "+KTG2);
  System.out.println("3. "+KTG3);
  System.out.println("4. "+KTG4);
  System.out.println("5. "+KTG5);
  System.out.println("6. "+KTG6);
}
}