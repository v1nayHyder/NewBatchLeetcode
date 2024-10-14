package New_batch_leetcode;

import java.util.Arrays;

class Trie{
    Node1 root;
    Trie(){
        root=new Node1();
    }
    public void addWord(String word){
        Node1 temp=root;
        for (char ch:word.toCharArray()) {
            int index=ch-'a';
            if (temp.child[index]==null){
                temp.child[index]=new Node1();

            }
            temp.child[index].count++;
            temp=temp.child[index];

        }
    }
    public int findPrefixCount(String word){
        Node1 temp=root;
        int count=0;
        for(char ch:word.toCharArray()){
            int index=ch-'a';
            count+=temp.child[index].count;
            temp=temp.child[index];
        }
        return count;
    }
}
public class SumPrefixScore {
    public static int[] sumPrefixScores(String[] words) {
        Trie trie=new Trie();
        int count[]=new int[words.length];
        for (String word:words) {
            trie.addWord(word);
        }
        int index=0;
        for (String word:words) {
            count[index++]=trie.findPrefixCount(word);

        }
        return count;
    }
        public static void main(String[] args) {
        String words[]={"abc","ab","bc","b"};
        int [] result=sumPrefixScores(words);
            System.out.println(Arrays.toString(result));
    }
}
class Node1 {

    Node1 child[];
    int count;
    Node1(){
        count=0;
        child=new Node1[26];
    }
}
