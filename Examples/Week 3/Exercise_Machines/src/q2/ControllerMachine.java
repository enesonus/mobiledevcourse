package q2;

public class ControllerMachine extends Machine{

	private String department;
	private ScheduledMachine[] machineList;
	
	public ControllerMachine(Priority priority, String specialization, String department) {
		super(priority, specialization);
		this.department = department;
		machineList = new ScheduledMachine[3];
	}

	
	public void addMachine(ScheduledMachine machine) {
		boolean inserted = false;
		for (int i = 0; i < machineList.length; i++) {
			if(machineList[i]==null) {
				machineList[i] = machine;
				inserted = true;
				break;
			}
		}
		
		if(!inserted) {
			System.out.println("Controller machine capacity full");
		}else {
			System.out.println("Machine inserted");
		}
	}
	
	@Override
	public void printInformation() {
		System.out.println("Type:Controller Machine");
		super.printInformation();
		System.out.println("Department:" + department);
		for (ScheduledMachine scheduledMachine : machineList) {
			System.out.println("Scheduled Machines:");
			scheduledMachine.printInformation();
		}
		
	}
	
	
	public String getDepartment() {
		return department;
	}
}
