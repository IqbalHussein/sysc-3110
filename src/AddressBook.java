import java.util.ArrayList;  

public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;
    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        if(buddyInfo != null) myBuddies.add(buddyInfo);
    }
    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < myBuddies.size()) return myBuddies.remove(index);
        return null;
    }
    public static void main(String[] args) {
        BuddyInfo buddy =  new BuddyInfo("Jimmy", "Mars", 555);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
