package hospital;

public class Surgeon extends Doctor {
	private boolean operating = false;

	public void setOperating(boolean inp) {
		operating = inp;
	}

	public boolean getOperating() {
		return operating;
	}

	public String toString() {
		// System.out.println("Name is :"+this.getName());
		// System.out.println("Number is :"+this.getNumber());
		// System.out.println("Speciality is :"+this.getSpeciality());
		return this.getName() + "   " + this.getNumber() + "   " + this.getSpeciality()
				+ ". Operating :" + operating + "";
	}

	public Surgeon(String nm, int num, String spc, boolean op) {
		super(nm, num, spc);
		operating = op;
	}

	//@Override
	//public void work() {
	//	if (operating == true) {
	//		System.out.println(this.getName() + " works for the hospital. " + this.getName()+" is operating now." );
	//	} else {
	//		System.out.println(this.getName() + " works for the hospital. " + this.getName()+" is not operating now." );
	//	}
	//}

}
