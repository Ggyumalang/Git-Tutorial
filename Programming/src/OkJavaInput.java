import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaInput {

	public static void main(String[] args) {
//		1. Swing을 이용해서 받는 방법.
//		String myAddress = JOptionPane.showInputDialog("Enter Your Address"); 
//		String bright = JOptionPane.showInputDialog("Enter a Intense of Bright");

//      2. Configuration을 이용해 Parameter, 매개변수로 받는 방법
		String myAddress = args[0];
		String bright = args[1];
		
		// 1. Elevator Call
		Elevator myElevator = new Elevator(myAddress);
		// 엘레베이터 타고 올라가기 위해 1층으로 콜하는 메소드
		myElevator.callForUp(1);
		
		// 2. Security Off
		Security mySecurity = new Security(myAddress);
		//보안 장치 off
		mySecurity.off();
		
		// 3. Light On
		Lighting hallLamp = new Lighting(myAddress + " / Hall Lamp");
		// hall에 있는 전등 on
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(myAddress + " / Floor Lamp");
		// floor에 있는 전등 on
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(myAddress + " moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		// 4. Aircon On
	}

}
