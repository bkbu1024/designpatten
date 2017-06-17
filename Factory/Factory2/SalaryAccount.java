

public class SalaryAccount implements Account {

String desc = "Salary Account";

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