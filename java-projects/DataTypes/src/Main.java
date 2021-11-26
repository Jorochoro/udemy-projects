public class Main {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("Joe's Phone");
        Contact bob = new Contact("Bob", "31415926");
        Contact alice = new Contact("Alice", "16180339");
        Contact tom = new Contact("Tom", "11235813");
        Contact jane = new Contact("Jane", "23571113");
        mp.addNewContact(bob);
        mp.addNewContact(alice);
        mp.addNewContact(tom);
        mp.addNewContact(jane);
        mp.printContacts();
    }
}
