package academy.devdojo.devdojojava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\artur\\IdeaProjects\\DevDojoJava\\file.txt");
        Path p2 = Paths.get("C:\\Users\\artur\\IdeaProjects\\DevDojoJava","file.txt");
        Path p3 = Paths.get("C:","Users\\artur\\IdeaProjects\\DevDojoJava","file.txt");
        Path p4 = Paths.get("C:","Users","artur","IdeaProjects","DevDojoJava","file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
