package looping;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean condition = true;
		
		int number = 10;
		
		while(condition || number > 1) {
			System.out.print("Java Course");
			System.out.print("\t" + condition + "\n");
			condition =  false;
			number = number - 1;
		}
	}

}
