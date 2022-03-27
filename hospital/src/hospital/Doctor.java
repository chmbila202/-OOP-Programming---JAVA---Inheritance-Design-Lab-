package hospital;

public class Doctor extends HospitalEmployee{

	
private String Speciality="SPECIALITY-NOT-SET-YET";
	
	public void setSpeciality(String spc) {
		Speciality=spc;
	}
	
	public String getSpeciality() {
		return Speciality;
	}

	@Override
	public String toString() {
		//System.out.println("Name is :"+this.getName());
		//System.out.println("Number is :"+this.getNumber());
		//System.out.println("Speciality is :"+Speciality);
		return this.getName()+"   "+this.getNumber()+"   "+Speciality+"";
	}

	public Doctor(String nm, int num,String spc) {
		super(nm, num);
		Speciality=spc;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void work()
	{
		System.out.println(this.getName() + " works for the hospital. " + this.getName()+" is a(n) "+Speciality+" doctor." );
	}


}
