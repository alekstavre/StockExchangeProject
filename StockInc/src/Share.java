
public class Share {
	
	String name;
	int value;
	int number;
	
	public Share(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "share:" + this.name+ " number of shares:"+ this.number+ " price=" +this.value+"$";
	}

}
