package singleton;
import state.*;
import command.*;
public class SingletonOTR {
	
	private OtrMachine otrMachine;
	
	
	private static SingletonOTR instance = new SingletonOTR();
	
	private SingletonOTR() {}
	
	public static SingletonOTR getInstance() {
		return instance;
	}
	public void setup(OtrMachine otrMachine) {
		this.otrMachine = otrMachine;
		
	}
	public void sendAlerts() {
		otrMachine.sendAlerts();
	}
	public void sendNotifications() {
		otrMachine.sendNotifications();
	}
	public void sendInvoices() {
		otrMachine.sendInvoices();
	}
	public void receivePayments() {
		otrMachine.receivePayments();
	}
	public void generateReports() {
		otrMachine.generateReports();
	}
}
