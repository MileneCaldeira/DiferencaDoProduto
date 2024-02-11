import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

System.out.println("Informe 04 valores para calcular a diferença do produto: ");
Double num1 = sc.nextDouble();
Double num2 = sc.nextDouble();
Double num3 = sc.nextDouble();
Double num4 = sc.nextDouble();
Double R = (num1*num2)- (num3*num4);

System.out.printf("A diferença do produto é igual a: %.0f",R);
	}

}
