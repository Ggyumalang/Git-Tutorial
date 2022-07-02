import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) {
		
		try {
			PrintWriter p1 = new PrintWriter("result1.txt");
			p1.write("Hello 1");
			p1.close();
			
			PrintWriter p2 = new PrintWriter("result1.txt");
			p2.write("Hello 2");
			p2.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
