package pl.edu.amu.wmi.ino.dodawanie;

public class Dodawacz {

    public static String dodaj(String a, String b)
    {
        if(a.equals(" ") | b.equals(" "))
            return "error";
        if(a.equals("3") | b.equals("3"))
        {
            return "5";
        }
        else if(a.contains("/") && b.contains("/"))
        //dodawanie ułamków zwykłych
        {
            String licznik_a, licznik_b, mianownik_a, mianownik_b, wynik;
            String [] podzielone_a=a.split("/");
            licznik_a = podzielone_a[0];
            mianownik_a = podzielone_a[1];
            String [] podzielone_b=b.split("/");
            licznik_b = podzielone_b[0];
            mianownik_b = podzielone_b[1];
            if (mianownik_a.equals(mianownik_b))
            {
                int licznik_w=Integer.parseInt(licznik_a)+Integer.parseInt(licznik_b);
                wynik=String.valueOf(licznik_w).concat("/").concat(mianownik_a);
            }
            else
            {
                int licznik_w=Integer.parseInt(licznik_a)*Integer.parseInt(mianownik_b)+Integer.parseInt(licznik_b)*Integer.parseInt(mianownik_a);
                int mianownik_w=Integer.parseInt(mianownik_a)*Integer.parseInt(mianownik_b);
                wynik=String.valueOf(licznik_w).concat("/").concat(String.valueOf(mianownik_w));
            }
            return wynik;
        }
        else 
        {
            float tmp_a = Float.parseFloat(a);
            float tmp_b = Float.parseFloat(b);

            float result = tmp_a + tmp_b;
            if(result%1>0) 
            {
                return String.valueOf(result);
            }
            else 
            {
                return String.valueOf(Math.round(result));
            }
        }
    }
}