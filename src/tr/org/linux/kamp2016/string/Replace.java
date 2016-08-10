package tr.org.linux.kamp2016.string;

public class Replace {

	public static void main(String main[]) {

		String str = "Grapon GrKağıtları";
		System.out.println(str.replace("Gr", "Ka"));
		System.out.println(str.replaceFirst("Gr", "Grr"));
		System.out.println(str.replaceAll("Gr", "Ha"));
	}
}
