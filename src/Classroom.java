
public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wilder wMichael = new Wilder("Michael", true);
		Wilder wMarcel = new Wilder("Marcel", false);
		Wilder wSteffi = new Wilder("Steffi", false);

		System.out.println(wMichael.whoAmI());
		System.out.println(wMarcel.whoAmI());
		System.out.println(wSteffi.whoAmI());
		
	}

}
