Main.class:
	javac *.java
	
clean:
	rm -f *.class
	
run: Main.class
	java -Xmx64m Main