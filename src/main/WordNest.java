package main;

/***
 * From: https://edabit.com/challenge/qRRYmmyTRBhJJNMwq
 */
public class WordNest {

    public boolean nestChecker(String word, String nest){
        System.out.println(nest);
        boolean answer = false;
        if (word.equals(nest)){
            return true;
        }
        else if (nest.contains(word)){
            String newNest = nest.replace(word,"");
            answer = nestChecker(word,newNest);
        }

        System.out.println(answer);
        return answer;
    }
}

