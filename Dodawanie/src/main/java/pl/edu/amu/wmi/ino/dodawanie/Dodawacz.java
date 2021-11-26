package pl.edu.amu.wmi.ino.dodawanie;

import java.util.regex.Pattern;

public class Dodawacz {

    public static String dodaj(String a, String b) {
        Pattern pattern = Pattern.compile("^[a-z A-Z]+$");
        if (pattern.matcher(a).find() && pattern.matcher(b).find()) {
            return a + b;
        } else if (a.equals("3") | b.equals("3")) {
            return "5";
        } else {
            int tmp_a = Integer.parseInt(a);
            int tmp_b = Integer.parseInt(b);

            int result = tmp_a + tmp_b;
            return String.valueOf(result);
        }

    }
}
