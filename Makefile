CLASSPATH = lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:lib/commonmark-0.18.1.jar:.

MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -g -cp $(CLASSPATH) MarkdownParseTest.java

MarkdownParse.class: MarkdownParse.java
	javac -g -cp $(CLASSPATH) MarkdownParse.java

test: MarkdownParseTest.class
<<<<<<< HEAD
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkdownParseTest 
=======
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkdownParseTest 
>>>>>>> 5c94d012a5da9119c39686a8b88dc94496d8bb94
