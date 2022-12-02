import java.util.Scanner;

public class CalculodeAños {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese datos");
        System.out.println("Ingrese año de nacimiento");
        int año_nacimiento = teclado.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes_nacimiento = teclado.nextInt();
        System.out.println("Ingrese dia de nacimiento");
        int dia_nacimiento = teclado.nextInt();
        System.out.println("Ingrese año actual");
        int año_actual = teclado.nextInt();
        System.out.println("Ingrese mes actual");
        int mes_actual = teclado.nextInt();
        System.out.println("Ingrese dia actual");
        int dia_actual = teclado.nextInt();

        int edad_años=año_actual-año_nacimiento;
        if (mes_nacimiento> mes_actual){
            edad_años=edad_años-1;
        }else {
            if (mes_nacimiento == mes_actual) {
                if (dia_nacimiento > dia_actual) {
                }
            }
        }
        System.out.println("tu edad actual en años es: "+edad_años+"años");

        int edad_mes=mes_actual-mes_nacimiento;
        if (mes_nacimiento> mes_actual){
            edad_mes=edad_mes-1;
        }else {
            if (mes_nacimiento == mes_actual) {
                if (dia_nacimiento > dia_actual) {
                }
            }
        }
        System.out.println("tu edad actual en meses es: "+edad_mes+"meses");

        int edad_dias=dia_actual-dia_nacimiento;
        if (mes_nacimiento> mes_actual){
            edad_dias=edad_dias-1;
        }else {
            if (mes_nacimiento == mes_actual) {
                if (dia_nacimiento > dia_actual) {
                }
            }
        }
        System.out.println("tu edad actual en dias es: "+edad_dias+"dias");

        int dias_año= edad_años*365;
        int dias_mes=edad_mes*31;
        int dias=dias_año+dias_mes+edad_dias;
        int horas = dias*24;
        if ((año_nacimiento % 4 == 0) && ((año_nacimiento%100 !=0)||(año_nacimiento % 400 != 0))||((año_actual% 100 !=0)||(año_actual % 400== 0))) {
            dias = dias + 4;
            horas = horas + 94;
        }
        System.out.println("horas transcurridas: "+horas+"horas");
        System.out.println("dias trancurridos: "+dias+"dias");
    }
}