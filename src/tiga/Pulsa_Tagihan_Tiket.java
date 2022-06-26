package tiga;
//implementasi class abstract dengan pewarisan inheritance
//final keyword
    final public class Pulsa_Tagihan_Tiket extends AbstractPulsaTagihanTiket{
    String NominalPulsa, TokenListrik;
    int HargaPulsa;
    int HargaTiket;
    private String Film, Tanggal;
    private String JamTayang;
    private String Studio;
    private int jumlahTiket;
    //overriding Method
    public void kategori_PulsaTagihanTiket(){
    System.out.println("_____________  Pulsa, Tagihan & Tiket __________________");
    System.out.println("1. Pulsa");
    System.out.println("2. Token Listrik");
    System.out.println("3. Tiket Bioskop");
    System.out.print("Masukkan pilihanmu : ");
    }
    //overriding Method
    public void pulsa (){
        System.out.print("Masukkan nomor HP : ");
        String NomorHp=input.nextLine();
        System.out.println("Pilihan Pulsa");
        System.out.println("1. Nominal 5.000 = Rp 6000");
        System.out.println("2. Nominal 10.000 = Rp 11000");
        System.out.println("3. Nominal 20.000 = Rp 21000");
        System.out.println("4. Nominal 30.000 = Rp 31000");
        System.out.println("5. Nominal 40.000 = Rp 41000");
        System.out.println("6. Nominal 50.000 = Rp 51000");
        System.out.println("7. Nominal 100.000 = Rp 110000");
        System.out.print("Masukkan pilihanmu : ");
        int PilihanPulsa = input.nextInt();
        //seleksi kondisi switch case
        switch (PilihanPulsa){
            case 1: 
                NominalPulsa = "5.000";
                HargaPulsa = 6000;
                break;
            case 2:
                NominalPulsa = "10.000";
                HargaPulsa = 11000;
                break;
            case 3 :
                NominalPulsa = "20.000";
                HargaPulsa = 21000;
                        break;
            case 4 :
                NominalPulsa = "30.000";
                HargaPulsa = 31000;
                break;
            case 5 :
                NominalPulsa = "40.000";
                HargaPulsa = 41000;
                break;
            case 6 :
                NominalPulsa = "50.000";
                HargaPulsa = 51000;
                break;
            case 7 :
                NominalPulsa = "100.000";
                HargaPulsa = 100000;
                break;
            default :
            System.out.println("Pilihan yang anda masukkan tidak ada");
             break; 
        }
        System.out.println("===============Rincian Transaksi===============");
        System.out.println("Nomer Hp      = " +NomorHp);
        System.out.println("Nominal Pulsa = " +NominalPulsa);
        System.out.println("Harga Pulsa   = Rp " +HargaPulsa);
    }
    //overriding Method
public void TokenListrik(){
  System.out.print("Masukkan ID PLN : ");
        String IDpln=input.nextLine();
        System.out.println("Pilihan Produk");
        System.out.println("1. Token 20.000 = Rp 21000");
        System.out.println("2. Token 50.000 = Rp 51000");
        System.out.println("3. Nominal 100.000 = Rp 101000");
        System.out.println("4. Nominal 200.000 = Rp 201000");
        System.out.println("5. Nominal 500.000 = Rp 501000");
        System.out.println("6. Nominal 1.000.000 = Rp 990000");
        System.out.print("Masukkan pilihanmu : ");
        int PilihanPulsa = input.nextInt();
        //seleksi kondisi switch case
                switch (PilihanPulsa){
            case 1: 
                NominalPulsa = "20.000";
                TokenListrik = "1245 5674 2456 2786 0987";
                HargaPulsa = 21000;
                break;
            case 2:
                NominalPulsa = "50.000";
                TokenListrik = "9076 5674 2456 2786 9654";
                HargaPulsa = 51000;
                break;
            case 3 :
                NominalPulsa = "100.000";
                TokenListrik = "0954 5674 2456 8762 0987";
                HargaPulsa = 101000;
                        break;
            case 4 :
                NominalPulsa = "200.000";
                TokenListrik = "1245 5674 5346 2786 9898";
                HargaPulsa = 201000;
                break;
            case 5 :
                NominalPulsa = "500.000";
                TokenListrik = "1245 5674 2456 2786 0987";
                HargaPulsa = 501000;
                break;
            case 6 :
                NominalPulsa = "1.000.000";
                TokenListrik = "0987 5674 2456 1111 0987";
                HargaPulsa = 990000;
                break;
            default :
            System.out.println("Pilihan yang anda masukkan tidak ada");
             break; 
        }
        System.out.println("===============Rincian Transaksi===============");
        System.out.println("Id PLN        = " +IDpln);
        System.out.println("Token Listrik = " +TokenListrik);
        System.out.println("Nominal Pulsa = " +NominalPulsa);
        System.out.println("Harga Pulsa   = Rp " +HargaPulsa);
}
//overriding Method
//seleksi kondisi switch case
public void TiketBioskop(){
    System.out.println("Pilihan Film");
        System.out.println("1. Picky Blinders      = Rp 50000");
        System.out.println("2. Furious 10          = Rp 50000");
        System.out.println("3. KKN di desa penari  = Rp 45000");
        System.out.println("4. The DOL 4           = Rp 50000");;
        System.out.print("Masukkan pilihanmu    : ");
        int PilihanFilm = input.nextInt();
        System.out.print("Masukkan jumlah tiket : ");
        jumlahTiket=input.nextInt();
                switch (PilihanFilm){
            case 1: 
                Film = "Picky Blinders";
                HargaTiket = 50000;
                Tanggal = "13 Dec 2023";
                JamTayang = "08.00 WIB";
                Studio = "Studio A";
                break;
            case 2:
                Film = "Furious 10";
                HargaTiket = 50000;
                Tanggal = "14 Dec 2023";
                JamTayang = "10.00 WIB";
                Studio = "Studio B";
                break;
            case 3 :
                Film = "KKN di desa penari";
                HargaTiket = 45000;
                Tanggal = "14 Dec 2023";
                JamTayang = "15.00 WIB";
                Studio = "Studio B";
                        break;
            case 4 :
                Film = "The Dol 4";
                HargaTiket = 50000;
                Tanggal = "15 Dec 2023";
                JamTayang = "08.00 WIB";
                Studio = "Studio A";
                break;
            default :
            System.out.println("Pilihan yang anda masukkan tidak ada");
             break; 
        }
        int TotalBayar=HargaTiket*jumlahTiket;
        System.out.println("===============Rincian Transaksi===============");
        System.out.println("Nama Film  = " +Film);
        System.out.println("Jumlah Beli= " +jumlahTiket);
        System.out.println("Tanggal    = " +Tanggal); 
        System.out.println("Jam Tayang = " +JamTayang);
        System.out.println("Studio     = " +Studio);
        System.out.println("Harga      = Rp " +HargaTiket+" x"+jumlahTiket);
        System.out.println("Total Bayar= Rp " +TotalBayar);
}
}
