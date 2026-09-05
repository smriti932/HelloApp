
    public class TrafficSignalAnalyzer {

    static void findLongestStreak(String signalLog) {

        int maxCount = 1;
        int currentCount = 1;

        char maxChar = signalLog.charAt(0);

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = signalLog.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + maxChar +
                           "' repeated " + maxCount + " times");
    }

    public static void main(String[] args) {

        String signalLog = "RRGGGYRR";

        findLongestStreak(signalLog);
    }
}

