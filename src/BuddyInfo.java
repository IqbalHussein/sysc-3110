public class BuddyInfo {

    public BuddyInfo(String Name, String address, int phoneNumber) {
    }

    public BuddyInfo(){
        this.name = "defaut";
        this.address = "default";
        this.phoneNumber = 000;
    }

    private String name;
    public void setName(){
        this.name = null;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private String address;
    public void setAddress(){
        this.address = null;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    private Integer phoneNumber;
    public void setPhoneNumber(){
        this.phoneNumber = null;
    }
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    static void main() {
        System.out.println("Hello World!");
        //C:\Users\iqbal\.jdks\openjdk-25.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1.1\lib\idea_rt.jar=64596" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\iqbal\OneDrive\Desktop\YEAR-3-FALL\SYSC-3110\Lab1\out\production\Lab1 BuddyInfo
        //Hello World!
        //
        //Process finished with exit code 0

        BuddyInfo buddyInfo = new BuddyInfo();
        buddyInfo.setName("Homer");
        buddyInfo.setAddress("Springfield");
        buddyInfo.setPhoneNumber(123456);

        System.out.println("Hello " + buddyInfo.getName() + "!");

    }
    //example comment
}
