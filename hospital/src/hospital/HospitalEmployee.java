package hospital;

public class HospitalEmployee {
	private String name="NOT-SET-YET";
	private	int number;
	
	public void setName(String nm) {
		name = nm;
	}
	public String getName() {
		return name;
	}
	public void setNumber(int num) {
		number = num;
	}
	public int getNumber() {
		return number ;
	}
	public String toString() {
		//System.out.println("Name is :"+name);
		//System.out.println("Number is :"+number);
		return name+"   "+number+"";
	}
	public void work()
	{
		System.out.println(name + " works for the hospital.");
	}

	public HospitalEmployee(String nm, int num) {
		name=nm;
		number=num;
	}

}
