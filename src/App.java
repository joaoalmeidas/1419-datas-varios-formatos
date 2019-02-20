import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma data no formato MES/DIA/ANO:");
		Data data = new Data(input.nextLine().split("/"));
		
		System.out.println("Data no formato MES DIA, ANO");
		System.out.println(data.retornaDataExtenso());
	}

}
