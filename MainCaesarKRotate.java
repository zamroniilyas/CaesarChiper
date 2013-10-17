public class MainCaesarKRotate {
    public static void main(String[] args) {
        String pesan ="Haloo berrroo";
        CaesarASCIIKRotate cae = new CaesarASCIIKRotate(pesan,54);                        
        String enkripsi = cae.enkripsiCaesar(pesan);
        String dekripsi = cae.dekripsiCaesar(enkripsi);
        System.out.println("Pesan : "+pesan);
        System.out.println("Enkripsi : "+enkripsi);
        System.out.println("Dekripsi : "+dekripsi);
        
        
        System.out.println(cae.getLog());
        
    }
}
