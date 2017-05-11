
public class Donor extends User{
	
	private int donorID;
	
	public Donor(){
		super();
	}
	
	public int getDonorID() {
		return donorID;
	}

	public void setDonorID(int donorID) {
		this.donorID = donorID;
	}

	public int donate(){
		return donorID;
		
	}

}
