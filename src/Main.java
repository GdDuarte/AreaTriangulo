import entities.Triangle;

import java.util.Scanner;

public class Main {
    /* Fazer um programa para ler as medidas dos lados de dois triângulos x e y (suponha medidas válidas).
    Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
    possui a maior área
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x =  new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();

        System.out.printf("Triangle X area: %.4f%n" , areax);

        double areay = y.area();

        System.out.printf("Triangle Y area: %.4f%n" , areay);

        if (areax > areay){
            System.out.println("Large area: X");
        }else{
            System.out.println("Large area: Y");
        }





        sc.close();
    }
}