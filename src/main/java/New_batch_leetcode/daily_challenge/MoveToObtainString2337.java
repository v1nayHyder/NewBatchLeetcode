package New_batch_leetcode.daily_challenge;

public class MoveToObtainString2337{
    public static boolean canChange(String start, String target) {
        String startWithoutBlanks = start.replace("_", "");
        String targetWithoutBlanks = target.replace("_", "");
        System.out.println(startWithoutBlanks+" "+targetWithoutBlanks);

        if (!startWithoutBlanks.equals(targetWithoutBlanks)) {
            return false;
        }
        int n = start.length();
        int startPointer = 0, targetPointer = 0;
        while (startPointer < n && targetPointer < n) {
            while (startPointer < n && start.charAt(startPointer) == '_') startPointer++;
            while (targetPointer < n && target.charAt(targetPointer) == '_') targetPointer++;
            if (startPointer == n || targetPointer == n) break;
            char startChar = start.charAt(startPointer);
            char targetChar = target.charAt(targetPointer);

            if (startChar != targetChar) return false;
            if (startChar == 'L' && startPointer < targetPointer) return false;

            if (startChar == 'R' && startPointer > targetPointer) return false;

            startPointer++;
            targetPointer++;
        }

        return true;    }
    public static void main(String[] args) {
        System.out.println(canChange("R_","R_"));
    }
}
