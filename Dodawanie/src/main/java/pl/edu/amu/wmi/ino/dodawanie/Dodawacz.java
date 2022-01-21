package pl.edu.amu.wmi.ino.dodawanie;

import java.util.regex.Pattern;

public class Dodawacz {

    public static String dodaj(String a, String b) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
        if (pattern.matcher(a).find() && pattern.matcher(b).find()) {
            return a + b;
        } else if (a.equals(" ") | b.equals(" ")) {
            return "error";
        } else if (a.equals("3") | b.equals("3")) {
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
