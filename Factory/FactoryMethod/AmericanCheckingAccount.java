
public class AmericanCheckingAccount implements Account {

	String desc = "American Checking Account";

	public int calcMaintenanceCharges(){
		return 12;
	}

	public int calcSMSAlertCharges(){
		return 4;
	}

	public int calcATMCharges(){
		return 6;
	}

	public String getDesc(){
	return desc;
	}
}