package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {
    public List<Character> getUniqueChars(String word){
        if(word == null){
            throw new IllegalArgumentException("Text is null.");
        }
        List<Character> modifiedCharacterList = new ArrayList<>();
        for(char c: word.toCharArray()){
            if(!modifiedCharacterList.contains(c)){
                modifiedCharacterList.add(c);
            }
        }
        return modifiedCharacterList;
    }
}
