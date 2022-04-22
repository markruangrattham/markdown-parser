//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int openBracket;
        int closeBracket;
        int openParen;
        int closeParen=0;
        for(int currentIndex = 0;currentIndex<markdown.length(); currentIndex+=closeParen){
        
            openBracket=markdown.indexOf("[", currentIndex);
            closeBracket=markdown.indexOf("]", openBracket);
            openParen=markdown.indexOf("(", closeBracket);
            closeParen=markdown.indexOf(")", openParen);
            if(closeParen-openParen<=1){
            }
            else{   
                toReturn.add(markdown.substring(openParen + 1, closeParen));
            }
            
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        System.out.println(links);
    }
}