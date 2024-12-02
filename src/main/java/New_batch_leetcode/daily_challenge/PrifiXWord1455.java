package New_batch_leetcode.daily_challenge;

public class PrifiXWord1455{
    public static int isPrefixOfWord(String sentence, String searchWord) {
     String words[]=sentence.split(" ");
     int count=0;
        String prefix="";
     for(String word:words){
         count++;
         if (word.length()>=searchWord.length())
           prefix  =word.substring(0,searchWord.length());

         if(prefix.equals(searchWord)){
             return count;
         }
     }
     return -1;
    }
    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i am tired","you"));
    }
}
