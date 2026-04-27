package academy.devdojo.devdojojava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    static void main(String[] args) throws IOException {
        Path path = Paths.get("folder2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAcessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime " +creationTime);
        System.out.println("lastModifiedTime " +lastModifiedTime);
        System.out.println("lastAcessTime " +lastAcessTime);
        System.out.println("-----------------------------");
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime,newCreationTime,creationTime);

         creationTime = fileAttributeView.readAttributes().creationTime();
         lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
         lastAcessTime = fileAttributeView.readAttributes().lastAccessTime();


        System.out.println("creationTime " +creationTime);
        System.out.println("lastModifiedTime " +lastModifiedTime);
        System.out.println("lastAcessTime " +lastAcessTime);

    }
}
