public class Hamburger {
    private String name;
    private double price;
    private String meat;
    private String breadRollType;

    private double addition1Price;
    private String addition1Name;

    private double addition2Price;
    private String addition2Name;

    private double addition3Price;
    private String addition3Name;

    private double addition4Price;
    private String addition4Name;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.breadRollType = breadRollType;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", is " + this.price);
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Added " + name + " for an extra + " + price);
    }

    public double itemizeHamburger() {
        return this.price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}
