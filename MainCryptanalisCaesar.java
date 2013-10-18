public class MainCryptanalisCaesar {
    public static void main(String[] args) {
        String pesan ="Gimana berro, iso di jebol orah";
        System.out.println("---------Enkripsi Caesar---------");
//        CaesarASCII cae = new CaesarASCII(pesan);                        
        CaesarASCIIKRotate cae = new CaesarASCIIKRotate(pesan, 54);
        String enkripsi = cae.enkripsiCaesar(pesan);
        String dekripsi = cae.dekripsiCaesar(enkripsi);
        System.out.println("Pesan : "+pesan);
        System.out.println("Enkripsi : "+enkripsi);
        System.out.println("Dekripsi : "+dekripsi);
                
//        System.out.println(cae.getLog());
        System.out.println("----------Cryptanalis Caesar--------");
        System.out.println("Pesan yang terenkrip : "+enkripsi);
        CryptanalisCaesar cryptanalisCaesar = new CryptanalisCaesar();
        System.out.println(cryptanalisCaesar.bruteForceIncrement(enkripsi, 500));
    }
    
}
