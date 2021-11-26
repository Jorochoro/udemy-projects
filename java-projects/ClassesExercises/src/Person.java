public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
            return;
        }
        this.age = age;
    }

    public boolean isTeen () {
        return age > 12 && age < 20 ? true : false;
    }

    public String getFullName () {
        if (firstName == "" && lastName == "") return "";
        if(firstName == "") return lastName;
        if(lastName == "") return firstName;
        return firstName + " " + lastName;
    }
}
