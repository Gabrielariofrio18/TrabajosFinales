

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x=1, a=0, b=1,x1=1;
        String a1 = "*";
        String b1 = "*";
        System.out.println("ingrese cantidad");
        int n = teclado.nextInt();
        while (x<=n){
            if (x%2==1){
                System.out.println(a);
                a=a+b;
            }else{
                System.out.println(b);
                b=b+a;
            }
            x=x+1;
        }

        System.out.println("El total de la serie Asterisco es: ");
        while (x1 <= n){
            System.out.println(a1);
            String c1 = a1 + b1;
            a1 = b1;
            b1 = c1;
            x1 = x + 1;
        }
    }
}