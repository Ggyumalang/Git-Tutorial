import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJava {

	public static void main(String[] args) {
		String myAddress = "JAVA APT 507";
		// 1. Elevator Call
		Elevator myElevator = new Elevator(myAddress);
		// ���������� Ÿ�� �ö󰡱� ���� 1������ ���ϴ� �޼ҵ�
		myElevator.callForUp(1);
		
		// 2. Security Off
		Security mySecurity = new Security(myAddress);
		//���� ��ġ off
		mySecurity.off();
		
		// 3. Light On
		Lighting hallLamp = new Lighting(myAddress + " / Hall Lamp");
		// hall�� �ִ� ���� on
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(myAddress + " / Floor Lamp");
		// floor�� �ִ� ���� on
		floorLamp.on();
		// 4. Aircon On
	}

}
