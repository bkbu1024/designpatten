
public class AmericanSavingsAccount implements Account {

String desc = "American Savings Account";

public int calcMaintenanceCharges(){
	return 10;
}

public int calcSMSAlertCharges(){
	return 2;
}

public int calcATMCharges(){
	return 5;
}

public String getDesc(){
	return desc;
	}
}