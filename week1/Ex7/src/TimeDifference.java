import java.util.Scanner;

public class TimeDifference {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    private void normalize() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        } else if (seconds < 0) {
            minutes += (seconds / 60) - 1;
            seconds = (seconds % 60 + 60) % 60;
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        } else if (minutes < 0) {
            hours += (minutes / 60) - 1;
            minutes = (minutes % 60 + 60) % 60;
        }

        if (hours < 0) {
            hours = 0;
            minutes = 0;
            seconds = 0;
        }
    }

    public Time difference(Time other) {
        int totalSeconds1 = toSeconds();
        int totalSeconds2 = other.toSeconds();
        int diffInSeconds = Math.abs(totalSeconds1 - totalSeconds2);

        return fromSeconds(diffInSeconds);
    }

    private int toSeconds() {
        return (hours * 3600) + (minutes * 60) + seconds;
    }

    private static Time fromSeconds(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        return new Time(hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hours for time 1: ");
        int hours1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter minutes for time 1: ");
        int minutes1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter seconds for time 1: ");
        int seconds1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter hours for time 2: ");
        int hours2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter minutes for time 2: ");
        int minutes2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter seconds for time 2: ");
        int seconds2 = Integer.parseInt(scanner.nextLine());

        Time time1 = new Time(hours1, minutes1, seconds1);
        Time time2 = new Time(hours2, minutes2, seconds2);

        Time diff = time1.difference(time2);

        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);
        System.out.println("Difference: " + diff);
        scanner.close();
    }
}