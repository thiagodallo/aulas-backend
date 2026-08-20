import java.util.Scanner;
import java.util.Locale;


public class aluno {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("INFORME A QUANTIDADE DE ALUNOS: ");

        double quantidade = sc.nextInt();

        for (int i = 0; i<quantidade; i++){
            System.out.print("NOME DO ALUNO: ");
            String nome = sc.next();
            System.out.print("NOTA 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("NOTA 2: ");
            double nota2 = sc.nextDouble();
            System.out.print("NOTA 3: ");
            double nota3 = sc.nextDouble();
            double media = (nota1 + nota2 + nota3)/3;
            System.out.printf("O aluno %s, tirou %.1f, %.1f, %.1f e obteve uma média de %.1f%n", nome, nota1, nota2, nota3, media);
        }
    }
}