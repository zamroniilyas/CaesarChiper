public class CryptanalisCaesar {
    private String hasilBruteForce="";
    private String log="";
    private int pesanInt;
    private char pesanChar;
    
    public String bruteForceDecrement(String pesan, int loop){
        int rotate=loop;
        for (int i = loop; i > 0; i--) {
            hasilBruteForce+="Percobaan ke-"+i;
            for (int j = 0; j < pesan.length(); j++) {
                pesanInt = pesan.charAt(j)-i;
                pesanChar = (char) pesanInt;
                hasilBruteForce+=pesanChar;
            }
            hasilBruteForce+="\n";
        }
        
        return hasilBruteForce;
    }
    
    public String bruteForceIncrement(String pesan, int loop){        
        for (int i = 0; i < loop; i++) {
            hasilBruteForce+="Percobaan ke-"+i+" = ";
            for (int j = 0; j < pesan.length(); j++) {
                pesanInt = pesan.charAt(j)-i;
                pesanChar = (char) pesanInt;
                hasilBruteForce+=pesanChar;
            }
            hasilBruteForce+="\n";
        }
        
        return hasilBruteForce;
    }
}
