public class 시저암호 {


    public static void main(String[] args) {

        String s = "a B z";
        int n = 4;

        char[] solution = solution(s, n);
        for (char c : solution) {
            System.out.println("c = " + c);
        }
    }

    private static char[] solution(String s, int n) {

        char[] result = null;
        char[] sArr = s.toCharArray();
        result = new char[sArr.length];

        for (int i = 0; i < sArr.length; i++) {

            int next = sArr[i] + n;
            int origin = sArr[i] - 0;

            if (origin > 96 && origin < 123) {
                if(next > 122){
                    int i2 = next - origin;
                    next = 96 + i2;
                }
            }

            if (origin > 64 && origin < 91) {
                if(next > 90){
                    int i2 = next - origin;
                    next = 64 + i2;
                }
            }

            if (origin == 32) {
                next = 32;
            }
            result[i] = (char) next;
        }

        char a = 'a';
        char A = 'A';
        char z = 'z';
        char Z = 'Z';

        System.out.println("'a' = " + (a - 0));
        System.out.println("'A' = " + (A - 0));
        System.out.println("'z' = " + (z - 0));
        System.out.println("'Z' = " + (Z - 0));


        return result;
    }
}
