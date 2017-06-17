
public class IndianSavingsAccount implements Account {

String desc = "Indian Savings Account";

public int calcMaintenanceCharges(){
	return 100;
}

public int calcSMSAlertCharges(){
	return 25;
}

public int calcATMCharges(){
	return 50;
}

public String getDesc(){
	return desc;
	}
}