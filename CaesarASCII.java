public class CaesarASCII {    
    private String enkripsi="";
    private String dekripsi="";
    private String log="";
    private int intASCII;
    private int defaultASCII;
    private int rotate=3;
    private char charASCII;

    public CaesarASCII(String pesan) {
        System.out.println("---------Enkripsi Caesar---------");
        System.out.println("Pesan (Plaintext) : "+pesan);
        String enkripsi = enkripsiCaesar(pesan);
        System.out.println("Enkripsi : "+enkripsi);
        System.out.println("Dekripsi : "+dekripsiCaesar(enkripsi));
        System.out.println("----------------Log--------------\n");
        System.out.println(log);
    }
    
    public String enkripsiCaesar(String pesan){
        log+="---------------Proses Enkripsi------------------\n";
        for (int i = 0; i < pesan.length(); i++) {            
            intASCII = pesan.charAt(i);
            log+=pesan.charAt(i)+"("+intASCII+")";
            intASCII = intASCII +rotate;
            charASCII=(char) intASCII;            
            log+=" + "+rotate+" = "+charASCII+"("+intASCII+") \n";
            enkripsi+=charASCII;                
        }        
        return enkripsi;       
    }
    
    public String dekripsiCaesar(String pesan){
        log+="---------------Proses Dekripsi------------------\n";
        for (int i = 0; i < pesan.length(); i++) {
            intASCII=pesan.charAt(i);
            log+=pesan.charAt(i)+"("+intASCII+") - "+rotate;
            intASCII = intASCII-rotate;
            charASCII=(char) intASCII;
            log+=" = "+charASCII+"("+intASCII+") \n";
            dekripsi+=charASCII;                   
        }                
        return dekripsi;
    }

    public String getLog() {
        return log;
    }   
}
