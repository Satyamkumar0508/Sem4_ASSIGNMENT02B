import java.util.*;
class Address {
    String plotNo;
    String at;
    String post;
    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
    public String toString() {
        return plotNo + ", " + at + ", " + post;
    }
}

class AddressBook {
    TreeMap<String, Address> addresses=new TreeMap<>();
    public void addAddress(String name, Address address) {
        addresses.put(name, address);
    }

    public Address getAddress(String name) {
        return addresses.get(name);
    }

    public void display() {
        for (String name : addresses.keySet()) {
            Address address = addresses.get(name);
            System.out.println(name + ": " + address.toString());
        }
    }
}

public class Q02_address {
    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        book.addAddress("Alice", new Address("1A", "Main Street", "12345"));
        book.addAddress("Bob", new Address("2B", "Second Avenue", "67890"));
        book.display();
    }
}
