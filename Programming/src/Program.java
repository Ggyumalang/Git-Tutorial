import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Hello![name].Do you know \"Java\"?".replace("[name]", "John"));
		
		String name = "Java,yoyo,hihi,hello,¾È³ç";
		String[] split = name.split(",");
		System.out.println(split[2]);
	}

}
