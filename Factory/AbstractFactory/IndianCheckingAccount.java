
public class IndianCheckingAccount implements Account {

	String desc = "Indian Checking Account";

	public int calcMaintenanceCharges(){
		return 120;
	}

	public int calcSMSAlertCharges(){
		return 45;
	}

	public int calcATMCharges(){
		return 60;
	}

	public String getDesc(){
	return desc;
	}
}