public class mainFile {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		displayGreeting();
		data.display();
	}

	public static void displayGreeting(){
		System.out.println("I am in main class");
	}
}
