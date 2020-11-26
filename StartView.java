package View;

import java.util.Scanner;

import fr.model.Data;

public class StartView {
	

	public static void main(String[] args) {
		Data data = new Data();
		EndView eView = new EndView();
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		eView.printFoods(data.discheck(input, data.getFoods()));
		
	}

}
