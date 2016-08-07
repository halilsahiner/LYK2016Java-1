import java.util.ArrayList;

public class AnimalTest {
	public static void main(String[] args){
		Animal bird = new Animal("Boncuk",2,"kuş");
		Animal dog = new Animal("Çomar",3,"köpek");
		Animal human = new Animal("Mahmut",5,"insan");
		Animal bird1 = new Animal("Boncuk",2,"kuş");
		Animal dog1 = new Animal("Çomar",3,"köpek");
		Animal human1 = new Animal("Mahmut",5,"insan");
		Animal bird2 = new Animal("Boncuk",2,"kuş");
		Animal dog2 = new Animal("Çomar",3,"köpek");
		Animal human2 = new Animal("Mahmut",5,"insan");
		ArrayList erreyList = new ArrayList();
		erreyList.add(bird);
		erreyList.add(dog);
		erreyList.add(human);
		erreyList.add(bird1);
		erreyList.add(dog1);
		erreyList.add(human1);		
		erreyList.add(bird2);
		erreyList.add(dog2);
		erreyList.add(human2);
		for(int i = 0; i < erreyList.size(); i++){
			System.out.println(erreyList.get(i));
		}
		
		
		
	}
}
