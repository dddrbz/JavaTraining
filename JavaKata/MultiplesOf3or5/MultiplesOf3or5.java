package JavaKata.MultiplesOf3or5;

public class MultiplesOf3or5 {
    public static int solution(int number) {
        if (number < 0) return 0;
        int sum = 0;

        for (int i = 1; (i * 3) < number; ++i) {
            sum += i * 3;
        }
        for (int i = 1; (i * 5) < number; ++i) {
            sum += ((i * 5) % 3 == 0) ? 0 : i * 5;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
