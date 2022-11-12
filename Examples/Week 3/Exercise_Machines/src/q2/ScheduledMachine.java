package q2;

public class ScheduledMachine extends Machine{

	private String[] jobList;
	
	
	public ScheduledMachine(Priority priority, String specialization,String[] jobList) {
		super(priority, specialization);
		this.jobList = jobList;
	}

	@Override
	public void printInformation() {
		
		System.out.println("Type:Scheduled Machine");
		super.printInformation();
		System.out.println("Jobs:");
		int index =1;
		for (String job : jobList) {
			System.out.println(index + "- " +job);
			index++;
		}
	}
	
	public String[] getJobList() {
		return jobList;
	}
	
	
	
}
