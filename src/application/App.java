package application;

public class App {
	
	private String name;
	
	public App() {
		name = "Elizabeth";
	}

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}
	
	private void run() {
		class Printer {
			public void print() {
				System.out.println("My name is " + name);
			}
		}
		
		new Printer().print();
		System.out.println(name);
	}

}
