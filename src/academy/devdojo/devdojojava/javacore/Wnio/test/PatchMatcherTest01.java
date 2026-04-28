package academy.devdojo.devdojojava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PatchMatcherTest01 {
    static void main(String[] args) {
        Path path1 = Paths.get("folder/subfolder/file.bkp");
        Path path2 = Paths.get("folder/subfolder/file.txt");
        Path path3 = Paths.get("folder/subfolder/file.java");
        matchs(path1,"glob:*.bkp");
        matchs(path1,"glob:**/*.bkp");
        matchs(path1,"glob:**/*.{bkp,txt,java}");
        matchs(path2,"glob:**/*.{bkp,txt,java}");
        matchs(path3,"glob:**/*.{bkp,txt,java}");
        matchs(path1,"glob:**/*.???");
        matchs(path2,"glob:**/*.???");
        matchs(path3,"glob:**/file.????");
    }
    private static void matchs(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
