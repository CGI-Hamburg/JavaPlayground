package hashmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Textstatistik {
    private final String fileName;

    public static void main(String [] args){
        Textstatistik statistic = new Textstatistik("taucher.txt");
        Map<String, Integer> wordCount = statistic.wordCount();

    }

    public Textstatistik(String fileName){
        this.fileName = fileName;
    }

    public Map<String,Integer> wordCount(){
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(getClass().getClassLoader().getResourceAsStream(fileName))
        );
        reader.lines()
        .flatMap(line-> Arrays.stream(line.split("[:\\?,\\.\\-\\! \\t\\r\\n]")))
                .filter(word->!word.isBlank())
        .forEach(System.out::println);
        return Collections.emptyMap();
    }
}
