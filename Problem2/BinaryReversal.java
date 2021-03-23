public class BinaryReversal {
    public static void main(String[] args) {
        String[] testCases = new String[]{
            "47", "1", "16", "457", "0", "10"
        };
        for(String testString : testCases) {
            System.out.println(testString + ": " + reverseBinaryStr(testString));
        }
    }

    private static String reverseBinaryStr(String str) {
        int num = Integer.valueOf(str);
        int res = 0, k = 0;
        while(num > 0) {
            res <<= 1;
            if((num & 1) == 1) {
                res = res | 1;
            }
            num >>= 1;
            ++k;
        }

        k = 8 - (k % 8);
        res <<= k;
        return String.valueOf(res);
    }
}