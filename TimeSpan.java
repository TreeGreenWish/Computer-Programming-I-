public class TimeSpan {
    private int hours;
    private int minutes;

    // Constructor
    public TimeSpan(int hours, int minutes) {
        // Normalize the time by converting excess minutes to hours
        int totalMinutes = hours * 60 + minutes;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    // Returns the number of hours
    public int getHours() {
        return hours;
    }

    // Returns the number of minutes (0-59)
    public int getMinutes() {
        return minutes;
    }

    // Adds hours and minutes to this time span
    public void add(int hours, int minutes) {
        int totalMinutes = (this.hours * 60 + this.minutes) + (hours * 60 + minutes);
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    // Adds another TimeSpan to this time span
    public void add(TimeSpan timespan) {
        add(timespan.getHours(), timespan.getMinutes());
    }

    // Returns total time as a double number of hours
    public double getTotalHours() {
        return hours + (minutes / 60.0);  // Using 60.0 to force floating-point division
    }

    // Returns string representation like "28h46m"
    public String toString() {
        return hours + "h" + minutes + "m";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test case 1: Basic creation and getters
        TimeSpan t1 = new TimeSpan(2, 30);
        System.out.println("Hours: " + t1.getHours());         // Should print 2
        System.out.println("Minutes: " + t1.getMinutes());     // Should print 30
        System.out.println("Total hours: " + t1.getTotalHours()); // Should print 2.5
        System.out.println("String: " + t1.toString());        // Should print "2h30m"

        // Test case 2: Adding time
        t1.add(1, 45);
        System.out.println("After adding 1h45m: " + t1.toString()); // Should print "4h15m"

        // Test case 3: Adding timespan with carry over
        TimeSpan t2 = new TimeSpan(2, 15);
        TimeSpan t3 = new TimeSpan(1, 50);
        t2.add(t3);
        System.out.println("After adding timespan: " + t2.toString()); // Should print "4h5m"

        // Test case 4: Normalization of minutes
        TimeSpan t4 = new TimeSpan(2, 75);
        System.out.println("Normalized 2h75m: " + t4.toString()); // Should print "3h15m"
    }
}