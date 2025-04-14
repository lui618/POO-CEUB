import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();

        System.out.println("Qual seu peso?");
        double peso = sc.nextDouble();

        System.out.println("Qual sua altura?");
        double altura = sc.nextDouble();

        Pessoa pessoa1 = new Pessoa(nome, peso, altura);
        System.out.printf("Seu IMC é: %.2f\n", pessoa1.calcularIMC());

        
        System.out.println(pessoa1.processarImc());

        sc.close();
    }
}
