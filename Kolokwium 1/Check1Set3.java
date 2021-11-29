public class Check1Set3 {
	
	public static void main(String[] args) {
		int total = 0;

		
		// Point
		try {
			Point p = new Point(14,28);
			if (p.toString().equals("P(14,28)")) {
				total += 5;
				System.out.println("Point +");
			}
		} catch (Throwable e) {}

		
		// Numbers
		try {
			if (Numbers.max(10,30,-20) == 30) {
				total += 5;
				System.out.println("Numbers +");
			}
		} catch (Throwable e) {}


		// Ages
		try {
			int[] students = {21, 22, 21, 19, 20};
			if (Ages.min(students) == 19) {
				total += 5;
				System.out.println("Ages +");
			}
		} catch (Throwable e) {}


		// Counter 
		try {
			Counter c = new Counter();
			c.increase();
			c.increase(5);
			c.decrease();
			c.decrease(2);
			if (c.value() == 3) {
				total += 5;
				System.out.println("Counter +");
			}
		} catch (Throwable e) {}



		// Food
		try {
			Food f = new Food();
			f.setFresh(true);
			if (f.getFresh()) {
				total += 5;
				System.out.println("Food +");
			}
		} catch (Throwable e) {}


		// InternetDevice
		try {
			InternetDevice d1 = new InternetDevice("TV");
			InternetDevice d2 = new InternetDevice("Laptop");
			InternetDevice d3 = new InternetDevice("Smartphone");
			d1.connect();
			d2.connect();
			d3.disconnect();
			d3.setName("Printer");
			if (d1.isConnected() && d2.isConnected() && !d3.isConnected()){
				if (d3.getName().equals("Printer")){
					total += 5;
					System.out.println("Clock +");
				}
			}
		} catch (Throwable e) {}
	
	
		System.out.println("Total: " + total + " pts");
		
	}
}





class Point {
	Point(int x, int y) {}
	public String toString() { return "";}
}

class Numbers {
	public static int max(int n1, int n2, int n3) {return 0;}
}

class Ages {
	public static int min(int[] ages) {return 0;}	
}

class Counter {
	public void increase() {}
	public void decrease() {}
	public void increase(int n) {}
	public void decrease(int n) {}
	public int value() {return 0;}
}

class Food {
	public String getName() {return "";}
	public void setName(String name) {}
	public boolean getFresh() {return false;}
	public void setFresh(boolean fresh) {}
}

class InternetDevice {
	InternetDevice(String name) {}
	public void connect() {}
	public void disconnect() {}
	public boolean isConnected() {return false;}
	public static int connections() {return 0;}
	public String getName() {return "";}
	public void setName(String name) {}
	public boolean getConnected() {return false;}
	public void setConnected(boolean connected) {}
	
	
}

