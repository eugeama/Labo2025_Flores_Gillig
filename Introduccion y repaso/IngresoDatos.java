import static java.lang.Character.getNumericValue;

public class IngresoDatos {
    public static void main(String[] args) {
        int n= 5;
        double a= 4.56;
        char c= 'a';
        double na=n+a;
        double an= a-n;
        int res= (int) c;
        System.out.println(n +" + "+ a+" = "+na);
        System.out.println(a +" - "+ n+" = "+an);
        System.out.println("el valor numérico del caracter"+" "+c+": "+res);
    }
}