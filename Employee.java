
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private DateOfBirth date;

    // constructor
    public Employee(String firstname, String lastName, String socialSecurityNumber, DateOfBirth date) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.date = date;
    }

    // return first name
    public String getFirstName() {
        return firstName;
    }

    // return last name
    public String getLastName() {
        return lastName;
    }

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s, %s", getFirstName(), getLastName(), getSocialSecurityNumber(), date.toString());
    }

    public int GetBirthdayBonus() {
        Calendar curDate = java.util.Calendar.getInstance();
        int month = curDate.get(Calendar.MONTH) + 1;
        int bonus = 0;
        if (month == this.date.GetMonth()) {
            System.out.println("Happy Birthday! You got bonus ");
            bonus = 200;
        }
        return bonus;
    }

    // abstract method must be overridden by concrete subclasses
    public abstract double earnings();  // no implementation here
}