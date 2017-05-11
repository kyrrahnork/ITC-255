
public class DonorApp {

	public static void main(String[] args) {
		Donation d = new Donation();
		Donor o = new Donor();

		d.setDonationAmount(500);
		o.setDonorID(0001);
		d.setDonationID(0001);
		d.setDate("5/07/2017");

		Donation d1 = new Donation();
		Donor o1 = new Donor();

		d1.setDonationAmount(1500);
		o1.setDonorID(0002);
		d1.setDonationID(0002);
		d1.setDate("5/09/2017");

		Donation d2 = new Donation();
		Donor o2 = new Donor();

		d2.setDonationAmount(50);
		o2.setDonorID(0003);
		d2.setDonationID(0003);
		d2.setDate("5/11/2017");
		
		System.out.println("Donation Amount: $" + d.getDonationAmount() + "\n" + "Donor ID: " + o.getDonorID() + "\n" + "Donation ID: " + d.getDonationID() + "\n" + "Donation Date: " + d.getDate());
		System.out.println();
		System.out.println("Donation Amount: $" + d1.getDonationAmount() + "\n" + "Donor ID: " + o1.getDonorID() + "\n" + "Donation ID: " + d1.getDonationID() + "\n" + "Donation Date: " + d1.getDate());
		System.out.println();
		System.out.println("Donation Amount: $" + d2.getDonationAmount() + "\n" + "Donor ID: " + o2.getDonorID() + "\n" + "Donation ID: " + d2.getDonationID() + "\n" + "Donation Date: " + d2.getDate());
		System.out.println();

	}

}
