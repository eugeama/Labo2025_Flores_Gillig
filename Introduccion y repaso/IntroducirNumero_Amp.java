import java.util.Scanner;

public class IntroducirNumero_Amp {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int cantidad = 0;
        int numero = 0;
        int numayor= 0;
        int numenor= 0;
        int sumanum=0;
        int suma_pos=0;
        int suma_neg=0;
        while (numero != -1) {
            System.out.println("Ingrese un numero: ");
            numero = e.nextInt();
            if (numero != -1) {
                cantidad++;
                if(numero > numayor){
                    numayor=numero;
                }
                if (numero < numenor) {
                    numenor=numero;
                }
                sumanum+=numero;
                if (numero>0) {
                    suma_pos+=numero;
                }
                if (numero<0) {
                    suma_neg+=numero;
                }
            }
        }
        System.out.println("Cantidad de números:" +" " + cantidad);
        System.out.println("Mayor número:" +" " + numayor);
        System.out.println("Menor número:" +" " + numenor);
        System.out.println("Suma de nums:" +" " + sumanum);
        System.out.println("Suma de positivos:" +" " + suma_pos);
        System.out.println("Suma de negativos:" +" " + suma_neg);
        }
    }

