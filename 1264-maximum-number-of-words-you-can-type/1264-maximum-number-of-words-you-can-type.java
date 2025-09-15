class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[]words = text.split(" ");
        int count = 0;
        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j < brokenLetters.length() ; j++){
                char ch = brokenLetters.charAt(j);
                if(words[i].indexOf(ch) != - 1){
                    count++;
                    break;
                }
            }
        }
        return words.length - count;
    }
}