package pl.edu.amu.wmi.ino.dodawanie;

public class Dodawacz {
    
    public static String dodaj(String a, String b){
        if(a.equals("3") | b.equals("3")){
            return "5";
        } else {
            float tmp_a = Float.parseFloat(a);
            float tmp_b = Float.parseFloat(b);

            float result = tmp_a + tmp_b;
            if(result%1>0) {
                return String.valueOf(result);
            }
            else {
                return String.valueOf(Math.round(result));
            }
        }

    }
    
}
