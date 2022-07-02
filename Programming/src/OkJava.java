import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJava {

	public static void main(String[] args) {
		String myAddress = "JAVA APT 507";
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
		// 4. Aircon On
	}

}
