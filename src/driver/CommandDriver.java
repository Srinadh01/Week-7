package driver;
import command.*;
import singleton.*;
import state.*;
public class CommandDriver {

	public static void main(String[] args) {

		
//		OtrMachine otrMachine = new OtrMachine(new Accountant());
		
		SingletonOTR singletonOTR = SingletonOTR.getInstance();
		
		singletonOTR.setup(new OtrMachine(new Accountant()));
		
		System.out.println();
		singletonOTR.sendAlerts();
		System.out.println();
		singletonOTR.sendNotifications();
		System.out.println();
		singletonOTR.sendInvoices();
		System.out.println();
		singletonOTR.receivePayments();
		System.out.println();
		singletonOTR.generateReports();
		
	}

}
