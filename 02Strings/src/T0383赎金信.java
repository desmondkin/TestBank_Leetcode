public class T0383赎金信 {
    public boolean canConstruct(String ransomNote, String magazine){
        int[] chars1 = new int[26];
        int[] chars2 = new int[26];
        for(int i = 0; i < ransomNote.length(); i ++){
            int j = ransomNote.charAt(i) - 'a';
            chars1[j] ++;
        }
        for(int i = 0; i < magazine.length(); i ++){
            int j = magazine.charAt(i) - 'a';
            chars2[j] ++;
        }
        for(int i = 0; i < 27; i++){
            if(chars1[i] > chars2[i]){
                return false;
            }
        }
        return true;
    }
}
