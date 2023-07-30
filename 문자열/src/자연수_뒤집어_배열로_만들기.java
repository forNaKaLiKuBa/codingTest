import java.util.ArrayList;

public class 자연수_뒤집어_배열로_만들기 {

    public static void main(String[] args) {

        long n = 12345;

        int[] solution = solution(n);
    }

    private static int[] solution(long n) {

        String s = Long.toString(n);
        StringBuilder reverseS = new StringBuilder(s).reverse();
        char[] charArray = reverseS.toString().toCharArray();


        int[] result = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            result[i] = charArray[i] - '0';
            System.out.println("result = " + result[i]);
        }

        return result;
    }
}
