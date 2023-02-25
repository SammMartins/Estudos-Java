/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas 
descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. 
O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal. */
package quest_beecrowd;
import java.util.Scanner;



public class BEE1012{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = pi * (c*c); //Área = π x raio²
        double areaTrapezio = ((a+b) * c) /2; //Área = (base menor + base maior) x altura / 2
        double areaQuadrado = Math.pow(b,2); //Math.pow(b,2) = b²
        double areaRetangulo = a*b;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
        
        input.close();
    }
}