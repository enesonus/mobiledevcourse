package q2;

public abstract class Machine {

	private int id;
	private Priority priority;
	private String specialization;
	private static int machineIdCounter = 0;
	
	
	
	
	public Machine(Priority priority, String specialization) {

		this.priority = priority;
		this.specialization = specialization;
		id= calculateMachineId();
	}
	
	public void printInformation()
	{
		
		String retVal = String.format("ID:%d, priority:%s, specialization:%s", id,priority,specialization);
		System.out.println(retVal);
		
	}
	private int calculateMachineId() {
		machineIdCounter++;
		return machineIdCounter;
	}
	public int getId() {
		return id;
	}
	public Priority getPriority() {
		return priority;
	}
	public String getSpecialization() {
		return specialization;
	}
	
	
	
	
}
