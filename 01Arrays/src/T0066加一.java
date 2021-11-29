public class T0066加一 {
    public int[] plusOne(int[] digits){
        int n = digits.length;
        for(int i = n; i >= 0; i--){
            digits[i]++;
            digits[i] = digits[i] % 10;
            if(digits[i] != 0){
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
