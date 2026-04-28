package academy.devdojo.devdojojava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListFiles extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
        }
    }

public class PathMatcherTest02 {
    static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        Files.walkFileTree(path,new ListFiles());
    }

}
