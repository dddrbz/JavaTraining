package JavaKata.HumanReadableDurationFormat;

public class HumanReadableDurationFormat {
    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";
        int[] time = {60 * 60 * 24 * 365, 60 * 60 * 24, 60 * 60, 60, 1};
        String result = new String();

        for (int i = 0; seconds > 0; ++i) {
            int value = seconds / time[i];
            if (value > 0) {
                seconds -= time[i] * value;
                if (result.length() != 0) {
                    result += (seconds == 0) ? " and " : ", ";
                }
                result += value;
                switch (i) {
                    case 0:
                        result += (value > 1) ? " years" : " year";
                        break;
                    case 1:
                        result += (value > 1) ? " days" : " day";
                        break;
                    case 2:
                        result += (value > 1) ? " hours" : " hour";
                        break;
                    case 3:
                        result += (value > 1) ? " minutes" : " minute";
                        break;
                    case 4:
                        result += (value > 1) ? " seconds" : " second";
                        break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(formatDuration(1254658));
    }
}
