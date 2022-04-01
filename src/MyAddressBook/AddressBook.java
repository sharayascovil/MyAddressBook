package MyAddressBook;

import java.util.ArrayList;
import java.util.List;


public class AddressBook {
    private String bookName;
    private List<Person> addresses;
    private int inputQuantity;

    public AddressBook(String bookName) {
        this.bookName = bookName;
        this.inputQuantity = 0;
        addresses = new ArrayList<>();

    }

    public void addInput(Person person) {
        addresses.add(person);
        inputQuantity++;
    }

    public void deleteInput(int index) {
        addresses.remove(index);
        inputQuantity--;
    }

    public void deleteInput(Person person) {
        addresses.remove(person);
        inputQuantity--;
    }

    public String getBookName() {
        return bookName;
    }

    public List<Person> getAddresses() {
        return addresses;
    }

    public int getInputQuantity() {
        return inputQuantity;
    }

    @Override
    public String toString() {
        return ("Book \"" + bookName + "\" with " + inputQuantity + "input(s)");
    }

    public static void main(String[] args) {
      
    }
}






