package part1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class One {

    public static void main(String[] args) {

        new PrintStream(System.out,true, StandardCharsets.UTF_8).println("Всем привет");

    }
}
