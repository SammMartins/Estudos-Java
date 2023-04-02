/*Escreva uma classe Pilha que implemente as operações push, pop e peek, que inserem um 
elemento na pilha, removem o elemento do topo da pilha e retornam o elemento do topo da pilha, 
respectivamente.*/

package Estrutura_de_dados.Aula3;
import java.util.Stack;

public class Pilha {
    public static void main(String args[]) {
        Stack<Integer> p1 = new Stack<>();

        p1.push(1);
        System.out.println("`p1.push(1)`   " + p1.peek() + "  Adicionado a pilha. ");
        p1.push(10);
        System.out.println("`p1.push(10)`  " + p1.peek() + " Adicionado a pilha.");
        p1.push(9);
        System.out.println("`p1.push(9)`   " + p1.peek() + "  Adicionado a pilha. ");

        System.out.println("`p1.pop()`     Item " + p1.pop() + " removido da pilha.");
        System.out.println("`p1.peek()`    First Out atual da pilha: " + p1.peek());
        System.out.print("`p1.pop()`");
        p1.pop();
        System.out.println("     Removendo da pilha... ");
        System.out.println("`p1.peek()`    First Out atual da pilha: " + p1.peek());
    }
}