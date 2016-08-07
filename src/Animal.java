
public class Animal {
	
	private String name;
	private int age;
	private String type;
	
	public Animal(String name, int age, String type){
		this.name = name;
		if(age > 0 && age < 100){
			this.age = age;
		}
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Bu hayvanın ismi: " + name + ", yaşı:" + age + ", türü: " + type;
	}

	public void setAge(int age) {
		if(age > 0 && age < 100){
			this.age = age;
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
