package JavaKata.RouteShortening;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RouteShortening {
    public static void main(String[] args) throws IOException {
        ArrayList<int[]> steps = new ArrayList<int[]>();
        BufferedReader reader = new BufferedReader(new FileReader("./RouteShortening/index.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] step = line.split(" ");
            steps.add(new int[] {getDirection(step[0]), Integer.parseInt(step[1])});
        }
        int size = 0;
        for (int i = 0; i < (size = steps.size()); ++i) {
            if (i < size - 1) {
                switch (steps.get(i)[0]) {
                    case 1:
                        if (steps.get(i + 1)[0] == 3) {
                            steps.get(i)[1] -= steps.get(i + 1)[1];
                            steps.remove(i + 1);
                            if (steps.get(i)[1] == 0) {
                                steps.remove(i);
                            } else if (steps.get(i)[1] < 0) {
                                steps.get(i)[0] = 3;
                                steps.get(i)[1] = -steps.get(i)[1];
                            }
                            i -= (i == 0) ? 1 : 2;
                        } else if (steps.get(i + 1)[0] == 1) {
                            steps.get(i)[1] += steps.get(i + 1)[1];
                            steps.remove(i + 1);
                            i -= (i == 0) ? 1 : 2;
                        }
                        break;
                    case 2:
                        if (steps.get(i + 1)[0] == 4) {
                            steps.get(i)[1] -= steps.get(i + 1)[1];
                            steps.remove(i + 1);
                            if (steps.get(i)[1] == 0) {
                                steps.remove(i);
                            } else if (steps.get(i)[1] < 0) {
                                steps.get(i)[0] = 4;
                                steps.get(i)[1] = -steps.get(i)[1];
                            }
                            i -= (i == 0) ? 1 : 2;
                        } else if (steps.get(i + 1)[0] == 2) {
                            steps.get(i)[1] += steps.get(i + 1)[1];
                            steps.remove(i + 1);
                            i -= (i == 0) ? 1 : 2;
                        }
                        break;
                    case 3:
                        if (steps.get(i + 1)[0] == 1) {
                            steps.get(i)[1] -= steps.get(i + 1)[1];
                            steps.remove(i + 1);
                            if (steps.get(i)[1] == 0) {
                                steps.remove(i);
                            } else if (steps.get(i)[1] < 0) {
                                steps.get(i)[0] = 1;
                                steps.get(i)[1] = -steps.get(i)[1];
                            }
                            i -= (i == 0) ? 1 : 2;
                        } else if (steps.get(i + 1)[0] == 3) {
                            steps.get(i)[1] += steps.get(i + 1)[1];
                            steps.remove(i + 1);
                            if (steps.get(i)[1] == 0) steps.remove(i);
                            i -= (i == 0) ? 1 : 2;
                        }
                        break;
                    case 4:
                        if (steps.get(i + 1)[0] == 2) {
                            steps.get(i)[1] -= steps.get(i + 1)[1];
                            steps.remove(i + 1);
                            if (steps.get(i)[1] == 0) {
                                steps.remove(i);
                            } else if (steps.get(i)[1] < 0) {
                                steps.get(i)[0] = 2;
                                steps.get(i)[1] = -steps.get(i)[1];
                            }
                            i -= (i == 0) ? 1 : 2;
                        } else if (steps.get(i + 1)[0] == 4) {
                            steps.get(i)[1] += steps.get(i + 1)[1];
                            steps.remove(i + 1);
                            i -= (i == 0) ? 1 : 2;
                        }
                        break;
                }
            }
        }
        for (int i = 0; i < steps.size(); ++i) {
            System.out.println(putDirection(steps.get(i)[0]) + " " + steps.get(i)[1]);
        }
    }

    private static int getDirection (String value) {
        int result = 0;

        switch (value) {
            case "TOP":
                result = 1;
                break;
            case "RIGHT":
                result = 2;
                break;
            case "BOTTOM":
                result = 3;
                break;
            case "LEFT":
                result = 4;
                break;
        }
        return result;
    }

    private static String putDirection (int value) {
        String result = new String();

        switch (value) {
            case 1:
                result = "TOP";
                break;
            case 2:
                result = "RIGHT";
                break;
            case 3:
                result = "BOTTOM";
                break;
            case 4:
                result = "LEFT";
                break;
        }
        return result;
    }
}
