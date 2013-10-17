public class CaesarASCII {    
    private String enkripsi="";
    private String dekripsi="";
    private String log="";
    private int intASCII;
    private int defaultASCII;
    private int rotate=3;
    private char charASCII;

    public CaesarASCII(String pesan) {
        sebelumEnkripsi(pesan);
    }
        
    private void sebelumEnkripsi(String pesan){
        log+="---------------Sebelum Enkripsi----------------\n";
        for (int i = 0; i < pesan.length(); i++) {            
            defaultASCII = pesan.charAt(i);                    
            log+=pesan.charAt(i)+" = "+defaultASCII+"\n";
        }        
        
    }
    
    public String enkripsiCaesar(String pesan){
        log+="---------------Proses Enkripsi------------------\n";
        for (int i = 0; i < pesan.length(); i++) {            
            
            
            intASCII = pesan.charAt(i);
            log+=intASCII;
            intASCII = intASCII +rotate;
            charASCII=(char) intASCII;            
            log+=" + "+rotate+" = "+intASCII+"\n";
            enkripsi+=charASCII;            
        }        
        return enkripsi;       
    }
    
    public String dekripsiCaesar(String pesan){
        log+="---------------Proses Dekripsi------------------\n";
        for (int i = 0; i < pesan.length(); i++) {
            log+=intASCII+" - "+rotate;
            intASCII = pesan.charAt(i)-rotate;
            charASCII=(char) intASCII;
            log+=" = "+intASCII+"\n";
            dekripsi+=charASCII;            
        }                
        return dekripsi;
    }

    public String getLog() {
        return log;
    }   
}
