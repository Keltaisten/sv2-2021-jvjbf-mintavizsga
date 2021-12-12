package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {
    private List<String> owlList = new ArrayList<>();

    public void readFromFile(Path path){
        try {
            owlList = Files.readAllLines(path);
        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file.");
        }
    }

    public int getNumberOfOwls(String country){
        int number = -1;
        for(String word: owlList){
            String[] splittedWord = word.split("=");
            if(splittedWord[0].equals(country)){
                number = Integer.parseInt(splittedWord[1]);
            }
        }
        if(number == -1){
            throw new IllegalArgumentException("No such county in Hungary!");
        }
        return number;
    }

    public int getNumberOfAllOwls(){
        int numbers = 0;
        for(String word: owlList){
            String[] splittedWords = word.split("=");
            numbers += Integer.parseInt(splittedWords[1]);
        }
        return numbers;
    }
}
