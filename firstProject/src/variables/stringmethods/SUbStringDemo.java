package stringmethods;

public class SUbStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "This is a string";
		
		String sub = string.substring(5, 7);
		System.out.println(sub);
		
		String sub1 = string.substring(5);
		System.out.println(sub1);
		
		String filename = "someimage.jpg";
		
		int lastDot = filename.lastIndexOf(".");
		
		String ext = filename.substring(filename.lastIndexOf(".") + 1);
		System.out.println(ext);
		
		String name = "Jancy Baez";
		
		String firstname = name.substring(0, name.indexOf(" "));
		System.out.println(firstname);
		
		String lastName = name.substring(name.indexOf(" ") + 1);
		System.out.println(lastName);
		
	}

}
