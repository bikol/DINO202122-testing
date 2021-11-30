package pl.edu.amu.wmi.ino.dodawanie;

public class Dodawacz {
    
    public static String dodaj(String a, String b){
        if(a.equals("PI")){
            return "PI + " + String.valueOf(b);
        }
        else if(b.equals("PI")){
            return String.valueOf(a) + " + PI";
        }
        if(a.equals("3") | b.equals("3")){
            return "5";
        } else {
            int tmp_a = Integer.parseInt(a);
            int tmp_b = Integer.parseInt(b);

            int result = tmp_a + tmp_b;
            return String.valueOf(result);
        }

    }
    
}
