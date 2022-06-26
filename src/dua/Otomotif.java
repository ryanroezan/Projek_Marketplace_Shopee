package dua;
import dua.fashion;
import java.util.Scanner;
//Konsep inheritance
//Konsep Constructor

//Subclass
public class Otomotif extends fashion{
    //Constructor
    public Otomotif(String Produk1, String Produk2, String Produk3){
    //Penggunaan Super
    super (Produk1, Produk2, Produk3);
    }
    Scanner input = new Scanner(System.in);
    public void Kategori_otomotif(){
    System.out.println("__________________  Otomotif  ______________________");
    System.out.println("1. "+Produk1+ " ~ Rp 250000");
    System.out.println("2. "+Produk2+ " ~ Rp 20000");
    System.out.println("3. "+Produk3+ " ~ Rp 130000");
    System.out.print("Masukkan pilihanmu : ");
    int pilih = input.nextInt();
    switch (pilih){
        case 1 : 
        NamaProduk = Produk1;
        size="L";
        harga=250000;
        break;
        case 2:
        NamaProduk = Produk2;
        size="S";
        harga=20000;
        break;
        case 3:
        NamaProduk = Produk3;
        size="XL";
        harga=130000;
        break;
        default:
        System.out.println("Pilihan yang anda masukkan tidak tersedia");
        }
    }
//Overriding Method
public void inputUser(){
          System.out.println("");
          System.out.print("Masukkan jumlah Produk   : ");
          jumlahProduk=x.nextInt();
          System.out.print("Masukkan nama penerima   : ");
          penerima = x.next();
          System.out.print("Masukkan Alamat penerima : " );
          alamat = x.next();
          System.out.print("Masukkan kode pos        : ");
          pos = x.next();
          System.out.print("Masukkan nomor telepon   : ");
          tlpn = x.next();
}
//Overriding Method
public void JasaPengiriman(){
    System.out.println("");
    System.out.println("================Pilih Jasa Pengiriman=====================");
     System.out.println("1. J&T Express ");
          System.out.println("2. SiCepat REG");
          System.out.println("3. ID Express");
          System.out.println("4. Ninja Xpress");
          System.out.println("5. JNE regular");
          System.out.print("Masukkan pilihanmu : ");
          int jasa= x.nextInt();
                    switch (jasa){
              case 1 :
                  jasaKirim = "J&T Express";
                  EstimasiSampai = "3 Hari";
                  SubtotalPengiriman = 40000;
                  break;
              case 2 :
                  jasaKirim = "SiCepat REG";
                  EstimasiSampai = "4 Hari";
                  SubtotalPengiriman = 30000;
                  break;
              case 3:
                  jasaKirim = "ID Express";
                  EstimasiSampai = "5 Hari";
                  SubtotalPengiriman = 20000;
                  break;
              case 4:
                  jasaKirim = "Ninja Xpress";
                  EstimasiSampai = "4 Hari";
                  SubtotalPengiriman = 30000;
                  break;
              case 5:
                  jasaKirim = "JNE regular";
                  EstimasiSampai = "3 Hari";
                  SubtotalPengiriman = 40000;
                  break;
                        default:
                            System.out.println("tidak ada");
                    }
}
public void GratisOngkir(){
    int pilihGratisOngkir;
    System.out.println("");
    System.out.println("====================Gratis Ongkir========================="); 
    System.out.println("Anda memiliki "+voucherGratisOngkir+" Voucher gratis ongkir");
    System.out.println("Pilih voucher Gratis ongkir");
    System.out.println("1. Gratis ongkir Horee Potongan 50%");
    System.out.println("2. Gratis ongkir Xtra Potongan 60%");
    System.out.println("3. Gratis ongkir Super Potongan 70%");
    System.out.println("4. Gratis ongkir Dasyat potongan 80%");
    System.out.println("5. Gratis ongkir Super dasyar potongan 100%");
    System.out.print("Masukkan Pilihanmu : ");
    pilihGratisOngkir=x.nextInt();
    if (pilihGratisOngkir==1){
        DiskonPengiriman=SubtotalPengiriman*50/100;
        pakai=1;
    }
    else if (pilihGratisOngkir==2){
        DiskonPengiriman=SubtotalPengiriman*60/100;
        pakai=1;
    }
    else if (pilihGratisOngkir==3){
    DiskonPengiriman=SubtotalPengiriman*70/100;
    pakai=1;
    }
    else if (pilihGratisOngkir==4){
    DiskonPengiriman=SubtotalPengiriman*80/100;   
    pakai=1;
    }
    else if (pilihGratisOngkir==5){
    DiskonPengiriman=SubtotalPengiriman*100/100; 
    pakai=1;
    }
}
    public void Diskon_cashback(){
    int pilihDiskon_cashback;
    System.out.println("");
    System.out.println("====================Voucher / Diskon=======================");
    System.out.println("Anda memiliki "+voucherdiskon+" Voucher / diskon");
    System.out.println("Pilih voucher Diskon / Cashback");  
        System.out.println("1. Diskon Asik potongan 4%");
        System.out.println("2. Diskon Mantap potongan 5%");
        System.out.println("3. Cashback 3%");
     System.out.print("Masukkan Pilihanmu : ");
    pilihDiskon_cashback=x.nextInt();
    if (pilihDiskon_cashback==1){
        voucherDiskon=harga*4/100;
        pakai=1;
    }
    else if (pilihDiskon_cashback==2){
        voucherDiskon=harga*5/100;
        pakai=1;
    }
    else if (pilihDiskon_cashback==3){
    voucherCashback=harga*3/100;
    pakai=1;
    }   
    }
   //Method
public void output(){
    int Total = harga*jumlahProduk+SubtotalPengiriman-DiskonPengiriman-voucherDiskon;
    int sisaVCRgo= voucherGratisOngkir-pakai;
    int sisaVCRdc= voucherdiskon-pakai;
     System.out.println("");
       System.out.println("==================================================");
       System.out.println("<Checkout>");
       System.out.println("Nama penerima                : " +penerima);
       System.out.println("Alamat penerima              : " +alamat);
       System.out.println("Kode pos                     : " +pos);
       System.out.println("Nomor telepon                : " +tlpn);
       System.out.println("Sisa voucher Gratis ongkir   : "+sisaVCRgo);
       System.out.println("Sisa voucher diskon/cashback : "+sisaVCRdc);
       System.out.println("");
       System.out.println("Nama Produk                  : " + NamaProduk);
       System.out.println("Jumlah produk di beli        : " +jumlahProduk);
       System.out.println("Size                         : " +size);
       System.out.println("Jasa Pengiriman              : " +jasaKirim);
       System.out.println("Estimasi Produk Sampai       : " +EstimasiSampai);
       System.out.println("");
       System.out.println("Subtotal Produk              : Rp " +harga+" x"+jumlahProduk);
       System.out.println("Subtotal Pengiriman          : Rp " +SubtotalPengiriman);
       System.out.println("Diskon Pengiriman            : Rp " +DiskonPengiriman);
       if (voucherDiskon>1){
       System.out.println("Diskon produk                : Rp " +voucherDiskon);
}
       System.out.println("Total Pembayaran             : Rp " +Total);
       if (voucherCashback>1){
       System.out.println("Total koin Shopee akan didapatkan : " +voucherCashback+" koin");
       }
       System.out.print("Buat pesanan? YA/TIDAK : ");
       String pilihan = x.next();
       switch (pilihan){
           case "YA" :
           System.out.println("Selamat pesanan anda telah dibuat");
           break;
       case "TIDAK" :
           System.out.println("Terimaksih telah menggunakan aplikasi ini");
           break;
       default :
           System.out.println("Pilihan yang anda masukkan tidak tersedia");
           break;
       }
}
}
