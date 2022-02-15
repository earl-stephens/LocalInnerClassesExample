package application;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
		class Printer implements Runnable {
			@Override
			public void run() {
			//public void print() {
				System.out.println("My name is " + name);
			}
		}
		
		Printer printer = new Printer();

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Printer(), 0, 1, TimeUnit.SECONDS);
	}

}
