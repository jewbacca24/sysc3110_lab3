import java.util.ArrayList;
import java.util.List;


public class AddressBook {
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		buddyInfo= new ArrayList<BuddyInfo>();
	}
	
	public void removeBuddy() {
		if (!buddyInfo.isEmpty()) {
			buddyInfo.remove(buddyInfo.size() -1);
		}
	}
	
	public void addBuddy(BuddyInfo b) {
		if (null != b) {
			buddyInfo.add(b);
		}
	}
	
	public List<BuddyInfo> getBuddyInfo() {
		return buddyInfo;
	}
	
	public String toString() {
		String s = "";
		for (BuddyInfo bud: buddyInfo) {
			s += bud.toString();
		}
		return s;
	}
	
	
//	public static void main(String args[]) {
//		System.out.println("Om Nom Nom");
//		BuddyInfo pie = new BuddyInfo();
//		pie.setName("Fred Fred Burger");
//		AddressBook book = new AddressBook();
//		book.addBuddy(pie);
//		book.removeBuddy();
//	}
}
