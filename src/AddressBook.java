import java.util.List;

public class AddressBook {
    public List<BuddyInfo> infoList;
    public AddressBook() {}
    public AddressBook(List<BuddyInfo> infoList) {
        this.infoList = infoList;
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        infoList.add(buddyInfo);
    }
    public void removeBuddy(BuddyInfo buddyInfo) {
        infoList.remove(buddyInfo);
    }
    public static void main(String[] args) {
        BuddyInfo buddy =  new BuddyInfo("Jimmy", "Mars", 555);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
