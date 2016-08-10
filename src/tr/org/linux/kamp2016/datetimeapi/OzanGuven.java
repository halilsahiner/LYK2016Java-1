package tr.org.linux.kamp2016.datetimeapi;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class OzanGuven {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Doğum yılınızı sayısal olarak giriniz");
		int year = input.nextInt();
		
		System.out.println("Doğum ayınızı sayısal olarak giriniz");
		int month = input.nextInt();
		
		System.out.println("Doğum gününüzü sayısal olarak giriniz");
		int day = input.nextInt();
		
		LocalDate birthDay = LocalDate.of(year, month, day);
		LocalDate today = LocalDate.now();
		
		System.out.println("Doğum gününüz: " + birthDay);
		System.out.println("Bugün: " + today);
		long daysAlive = ChronoUnit.DAYS.between(birthDay, today);
		
		System.out.println(daysAlive + " gündür yaşıyorsunuz.");
		
	}
}
