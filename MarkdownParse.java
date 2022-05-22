//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    //Changes made for part 2

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int closeParen=0;
        if(markdown.length()<4 
        ||!markdown.contains("[")
        ||!markdown.contains("]")
        ||!markdown.contains("(")
        ||!markdown.contains(")")){
            return toReturn;
        }
        else{

            for(int currentIndex = 0;currentIndex<markdown.length(); currentIndex+=closeParen){
            
                int openBracket=markdown.indexOf("[", currentIndex);
                int closeBracket=markdown.indexOf("]", openBracket);
                int openParen=markdown.indexOf("(", closeBracket);
                closeParen=markdown.indexOf(")", openParen);
                

                if(openBracket==-1){
                }
                else{
                    
                    if(closeParen-openParen<=1||
                    openParen-closeBracket!=1||
                    closeBracket-openBracket==1){
                    }

                    else{
                        int checker = markdown.indexOf("[");
                        if(checker<=-1){
                        }

                        else{

                        String mark = "!";
                        Character check = mark.charAt(0);

                        if(checker==0){
                            if(markdown.charAt(checker)==check){
                            }
                            else{
                            toReturn.add(markdown.substring(openParen + 1, closeParen));
                            }
                        }
                        if(checker>=1){
                            if(markdown.charAt(checker-1)==check){
                            }
                            else{
                                toReturn.add(markdown.substring(openParen + 1, closeParen));
                            }
                        }
        
    
                    }
                }
            }
            
        }
    }
    return toReturn;
}
public static ArrayList<String> ReviewedgetLinks(String markdown) {
    ArrayList<String> toReturn = new ArrayList<>();
    // find the next [, then find the ], then find the (, then read link upto next )
    int currentIndex = 0;
    while(currentIndex < markdown.length()) { 
        System.out.println("index is: " + currentIndex);
        int openBracket = markdown.indexOf("[", currentIndex);
        int closeBracket = markdown.indexOf("]", openBracket);
        int openParen = markdown.indexOf("(", closeBracket);
        int closeParen = markdown.indexOf(")", openParen);
        if (openBracket < 0 || closeBracket < 0 ||
        openParen < 0 || closeParen < 0) {
            break;
        }
        
        if (openParen + 1 == closeParen) {

        }
        else if (openBracket != 0 && markdown.charAt(openBracket-1) != '!') {
            toReturn.add(markdown.substring(openParen + 1, closeParen));
        }
        else {
            toReturn.add(markdown.substring(openParen + 1, closeParen));
        }
        
        currentIndex = closeParen + 1;
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