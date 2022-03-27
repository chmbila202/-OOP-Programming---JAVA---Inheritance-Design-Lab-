package hospital;

public class Nurse extends HospitalEmployee {

	private int numOfPatients = 0;

	public void setNumOfPatients(int nop) {
		numOfPatients = 0;
	}

	public int getNumOfPatients() {
		return numOfPatients;
	}

	@Override
	public String toString() {
		// System.out.println("Name is :"+this.getName());
		// System.out.println("Number is :"+this.getNumber());
		// System.out.println("Number of patients :"+numOfPatients);
		return this.getName() + "   " + this.getNumber() + " has " + numOfPatients + " patients.";
	}

	public Nurse(String nm, int num, int numOfPts) {
		super(nm, num);
		numOfPatients = numOfPts;
	}

	@Override
	public void work() {
		System.out.println(
				this.getName() + " works for the hospital. " + this.getName() + " is a nurse with "+numOfPatients+" patients.");
	}

}
