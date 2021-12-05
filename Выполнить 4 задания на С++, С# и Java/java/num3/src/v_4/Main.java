package v_4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    try(FileReader fileReader = new FileReader("input.txt")) {
            Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'y', 'u', 'i', 'o'));
	        int c; StringBuilder s = new StringBuilder();
	        while ((c=fileReader.read()) != -1){
	            if (((char) c == ' ') && (s.length() > 0)){
                    if (set.contains(s.charAt(s.length()-1))) System.out.println(s);
                    s = new StringBuilder();
                } else if ((char) c != ' '){
	                s.append((char) c);
                }
            }
	        if (s.length() > 0 && set.contains(s.charAt(s.length()-1))) System.out.println(s);
        }catch (IOException e){
	        System.out.print(e.getMessage());
        }
    }
}
