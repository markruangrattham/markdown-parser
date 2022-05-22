import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void MyGetLinkedSnippet1() throws IOException {
        Path fileName = Path.of("./Snippet-1.md");
        String content = Files.readString(fileName);
        MarkdownParse check = new MarkdownParse();
        ArrayList<String> links = check.getLinks(content);
        String[] actual = {"'goole.com","google.com","ucsd.edu"};
        assertArrayEquals(actual, links.toArray());
    }
    @Test
    public void ReviewGetLinkedSnippet1() throws IOException {
        Path fileName = Path.of("Snippet-1.md");
        String content = Files.readString(fileName);
        MarkdownParse check = new MarkdownParse();
        ArrayList<String> links = check.ReviewedgetLinks(content);
        String[] actual = {"'goole.com","google.com","ucsd.edu"};
        assertArrayEquals(actual, links.toArray());
    }

    @Test
    public void MyGetLinkedSnippet2() throws IOException{
        Path fileName = Path.of("Snippet-2.md");
        String content = Files.readString(fileName);
        MarkdownParse check = new MarkdownParse();
        ArrayList<String> links = check.getLinks(content);
        String[] actual = {"a.com","a.com(())","example.com"};
        assertArrayEquals(actual, links.toArray());
    }

    @Test
    public void ReviewGetLinkedSnippet2() throws IOException{
        Path fileName = Path.of("Snippet-2.md");
        String content = Files.readString(fileName);
        MarkdownParse check = new MarkdownParse();
        ArrayList<String> links = check.ReviewedgetLinks(content);
        String[] actual = {"a.com","a.com(())","example.com"};
        assertArrayEquals(actual, links.toArray());
    }
    @Test
    public void MyGetLinkedSnippet3() throws IOException {
        Path fileName = Path.of("Snippet-3.md");
        String content = Files.readString(fileName);
        MarkdownParse check = new MarkdownParse();
        ArrayList<String> links = check.getLinks(content);
        String[] actual = {"https://www.twitter.com","https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule","https://cse.ucsd.edu/"};
        assertArrayEquals(actual, links.toArray());
    }
    @Test
    public void ReviewGetLinkedSnippet3() throws IOException{
        Path fileName = Path.of("Snippet-3.md");
        String content = Files.readString(fileName);
        MarkdownParse check = new MarkdownParse();
        ArrayList<String> links = check.ReviewedgetLinks(content);
        String[] actual = {"https://www.twitter.com","https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule","https://cse.ucsd.edu/"};
        assertArrayEquals(actual, links.toArray());
    }


}
