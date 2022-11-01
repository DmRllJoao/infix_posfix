import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a expressão que você deseja no formato infixo: ");
        String expression = input.nextLine();

        System.out.println(Conversor.conversor(expression));

        input.close();
    }
}
