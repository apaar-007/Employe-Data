package empl.data.utils;

 public class EmployeData {
	private String name;
	private int age;
	private String contact;
	private String gender;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getContact() {
		return contact;
	}
	public String getGender() {
		return gender;
	}
	public EmployeData(String name, int age, String contact, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "EmployeData [name=" + name + ", age=" + age + ", contact=" + contact + ", gender=" + gender + "]";
	}
	
	
	}

	
	
	

 
 

