package pl.edu.amu.wmi.ino.dodawanie;

public class Dodawacz {
    
    public static String dodaj(String a, String b){
        int tmp_a = Integer.parseInt(a);
        int tmp_b = Integer.parseInt(b);

        int result = tmp_a + tmp_b;
        return String.valueOf(result);
    }
    
}
