
public class CertTrackerApp {

	public static void main(String[] args) {
		Course c = new Course();

		c.setCourseName("ITC 255");
		c.setDepartment("STEM");
		c.setDescription("Where the nerds gather");
		c.setCredits(5);

		Course c1 = new Course();
		c1.setCourseName("ITC 155");
		c1.setDepartment("STEM");
		c1.setDescription("Data Structures");
		c1.setCredits(5);

		Course c2 = new Course();
		c2.setCourseName("ITC 110");
		c2.setDepartment("STEM");
		c2.setDescription("C# / Python");
		c2.setCredits(5);

		System.out.println(c.getCourseName() + "\n" + c.getDepartment() + "\n" + c.getDescription() + "\n" + c.getCredits());
		System.out.println();
		System.out.println(c1.getCourseName() + "\n" + c1.getDepartment() + "\n" + c1.getDescription() + "\n" + c1.getCredits());
		System.out.println();
		System.out.println(c2.getCourseName() + "\n" + c2.getDepartment() + "\n" + c2.getDescription() + "\n" + c2.getCredits());

	}

}
