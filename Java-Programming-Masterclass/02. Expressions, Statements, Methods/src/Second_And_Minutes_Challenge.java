public class Second_And_Minutes_Challenge {

    private static String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(7298));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return String.format("%02d",hours) + " hours "
                + String.format("%02d",remainingMinutes) + " minutes "
                + String.format("%02d",seconds) + " seconds";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0 ){
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds are equal to "
                + minutes + " minutes and "
                + remainingSeconds + " seconds");
        return getDurationString(minutes,remainingSeconds);
    }
}
