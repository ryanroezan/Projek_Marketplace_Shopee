package tiga;
import satu.*;
import dua.*;
import java.util.Scanner;
//Main Class
class main{
public static void main(String[] args) {
   int lanjut, pilihKategori;
   //Objek
   tampilan home = new tampilan();
   fashion KTGfashion = new fashion("Celana Panjang Pria Chinos Cream", "Kemeja Koko Pria Cotton Lengan Pendek", "Sepatu Pantofel Pria Oxford Footstep");
   Elektronik KTGelektronik = new Elektronik("Samsung Digital Smart TV", "Xiomi Digital Smart TV", "Poltron Digital Smart TV");
   Otomotif KTGotomotif = new Otomotif("Helm cargloss CFM Retro", "Jas Hujan ASV ORI", "Helm Bogo Dewasa Retro");
   ShopeeFood KTGshopeeFood = new ShopeeFood("Bakso Aci Pedas Mercon", "Champ Burger Daging Ayam", "Kebab turki");
   Skincare KTGskincare = new Skincare("Cetaphil Gentle Cleanser", "Azarine Daily Moisturaizer", "Sunscreen Wardah SPF 30");
   Pulsa_Tagihan_Tiket KTGpulsaTagihanTiket = new Pulsa_Tagihan_Tiket();
  //Do while
  do{
    home.Tampilan_Home();
    home.Tampilan_Kategori("Shopee Kategori");
    home.Tampilan_Kategori("Fashion", "Elektronik 100% Ori", "Otomotif","Shopee Food", "Skincare", "Pulsa Tagihan & Tiket");
     System.out.print("Masukkan pilihanmu : ");
     Scanner input = new Scanner(System.in);
     int pilih = input.nextInt();
    //seleksi kondisi if else if
    if (pilih==1){
        KTGfashion.Kategori_Fashion();
        KTGfashion.inputUser();
        KTGfashion.JasaPengiriman();
        KTGfashion.GratisOngkir();
        KTGfashion.Diskon_cashback();
        KTGfashion.output();
    }
    else if (pilih==2){
    KTGelektronik.Kategori_elektronik();
    KTGelektronik.inputUser();
    KTGelektronik.JasaPengiriman();
    KTGelektronik.GratisOngkir();
    KTGelektronik.Diskon_cashback();
    KTGelektronik.output();
    }
    else if (pilih==3){
    KTGotomotif.Kategori_otomotif();
    KTGotomotif.inputUser();
    KTGotomotif.JasaPengiriman();
    KTGotomotif.GratisOngkir();
    KTGotomotif.Diskon_cashback();
    KTGotomotif.output();
    }
    else if (pilih==4){
    KTGshopeeFood.Kategori_ShopeeFood();
    KTGshopeeFood.inputUser();
    KTGshopeeFood.JasaPengiriman();
    KTGshopeeFood.GratisOngkir();
    KTGshopeeFood.Diskon_cashback();
    KTGshopeeFood.output();
}
    else if (pilih==5){
    KTGskincare.Kategori_Skincare();
    KTGskincare.inputUser();
    KTGskincare.JasaPengiriman();
    KTGskincare.GratisOngkir();
    KTGskincare.Diskon_cashback();
    KTGskincare.output(); 
}
    else if (pilih==6){
    KTGpulsaTagihanTiket.kategori_PulsaTagihanTiket();
        pilihKategori=input.nextInt();
        switch (pilihKategori){
            case 1:
                KTGpulsaTagihanTiket.pulsa();
                break;
            case 2 :
                KTGpulsaTagihanTiket.TokenListrik();
                break;
            case 3 :
                KTGpulsaTagihanTiket.TiketBioskop();
                break;
        }
    }
System.out.println("_________________________________________");
System.out.println("Apakah anda ingin membeli produk lagi ?");
System.out.println("1.Lanjut\n2.Tidak");
System.out.print("Masukkan pilihanmu : ");
lanjut=input.nextInt();
System.out.println("Terimakasih telah menggunakan Aplikasi Shopee");                
                }
while(lanjut==1);
    }
}