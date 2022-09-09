package RouteShortening;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RouteShortening {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./RouteShortening/input.txt"));
        String line;
        String preLine = new String();
        String preValue = new String();
        while ((line = reader.readLine()) != null) {
            String[] value = line.split(" ");
            switch (value[0]) {
                case "TOP":
                    if (preLine == "BOTTOM") {
                        value[1] = String.valueOf(Integer.parseInt(value[1]) -
                                                    Integer.parseInt(preValue));
                    } else if (preLine == "TOP") {
                        value[1] = String.valueOf(Integer.parseInt(value[1]) +
                                Integer.parseInt(preValue));
                    }
                    System.out.println(value[0] + " " + value[1]);
            }
            preLine = value[0];
            preValue = value[1];
        }
    }
}
