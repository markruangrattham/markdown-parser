import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void getLinks() throws IOException {
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        MarkdownParse check = new MarkdownParse();
        ArrayList<String> links = check.getLinks(content);
        String[] actual = {};
        assertArrayEquals(actual, links.toArray());
    
        
    }

}