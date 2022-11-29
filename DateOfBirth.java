
import sun.org.mozilla.javascript.internal.IdScriptableObject;
import java.util.Calendar;

public class DateOfBirth {
    private int day;
    private int month;
    private int year;

    // constructor
    public DateOfBirth(int day, int month, int year) {
        Calendar curDate = java.util.Calendar.getInstance();
        if(day <=0 || month>=13 || year>curDate.get(Calendar.YEAR))
            throw new IllegalArgumentException("Wrong date");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // return month
    public int GetMonth() {
        return this.month;
    }

    // return String representation the date of birth
    public String toString() {
        return String.format("Birthday: %s.%s.%s", this.day, this.month, this.year);
    }
}
