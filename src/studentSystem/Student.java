package studentSystem;

public class Student {
	private String name;
	private String number;
	private int age;

	public Student(String name, String number, int age) throws StudentException, IllegalArgumentException {
		super();
		if (name == null || name.isEmpty()) {
			throw new StudentException("Ad boş olamaz sanki");
		}
		if (number == null || number.isEmpty()) {
			throw new StudentException("Numara boş olamaz sanki");
		}
		if(age<18) {
			throw new IllegalArgumentException("18 yaşından küçüklere satışımız yoktur");
		}
		this.name = name;
		this.number = number;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.number;
	}

}
