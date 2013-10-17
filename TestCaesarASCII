public class TestCaesarASCII {
    public static void main(String[] args) {        
        String pesan = "Halo berrooo";
        
        char a;
        int b;
        int rot=5;
        System.out.println("-----------------sebelum-------------");
        for (int i = 0; i < pesan.length(); i++) {
            a=pesan.charAt(i);
            b = pesan.charAt(i);
            System.out.println(a+" = "+b);            
        }
        
        System.out.println("-----------------enkripsi-------------");
        String enkripsi = "";
        for (int i = 0; i < pesan.length(); i++) {
            
            b = pesan.charAt(i)+rot;
            a=(char) b;
            enkripsi+=a;
            System.out.println(a+" = "+b);            
        }
        
        System.out.println("-----------------dekripsi-------------");
        for (int i = 0; i < pesan.length(); i++) {
            
            b = enkripsi.charAt(i)-rot;
            a=(char) b;
            System.out.println(a+" = "+b);            
        }
    } 
}
