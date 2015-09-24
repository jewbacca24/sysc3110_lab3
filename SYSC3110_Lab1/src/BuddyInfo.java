
public class BuddyInfo {
	private int number;
	private String name;
	private String address;
	
	public BuddyInfo(){

	}
	
	public static void main(String []args){
		BuddyInfo newBuddy = new BuddyInfo();
		newBuddy.setName("M. Night Shyamalamadingdong");
		System.out.println("Hello "+ newBuddy.getName() + "!");
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
