class TimeCal {
    private int hour;
    private int minute;
    private int second;

    // Constructor to initialize hour, minute, and second
    public TimeCal(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeCal addTime(TimeCal t) {
        int newHour = this.hour + t.hour;
        int newMinute = this.minute + t.minute;
        int newSecond = this.second + t.second;

        if (newSecond >= 60) {
            newSecond -= 60;
            newMinute++;
        }

        if (newMinute >= 60) {
            newMinute -= 60;
            newHour++;
        }

        if (newHour >= 24) {
            newHour -= 24;
        }

        return new TimeCal(newHour, newMinute, newSecond);
    }

    // Getter methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}

public class Time {
    public static void main(String[] args) {
        TimeCal t1 = new TimeCal(12, 30, 45);
        TimeCal t2 = new TimeCal(3, 15, 20);

        TimeCal sum = t1.addTime(t2);

        System.out.println("Sum: " + sum.getHour() + " hours, " + sum.getMinute() + " minutes, " + sum.getSecond() + " seconds");
    }
}