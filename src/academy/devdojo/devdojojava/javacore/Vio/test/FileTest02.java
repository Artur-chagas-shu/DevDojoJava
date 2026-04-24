package academy.devdojo.devdojojava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    static void main(String[] args) throws IOException {
        File fileDirecotry = new File("folder");
        boolean isDirectoryCreated = fileDirecotry.mkdir();
        System.out.println("Pasta criada? " +isDirectoryCreated);
        File fileArchiveDirectory = new File(fileDirecotry,"archive.txt");
        boolean isFileCreated = fileArchiveDirectory.createNewFile();
        System.out.println("Arquivo.txt criado? " +isFileCreated);
        File fileRenamed = new File(fileDirecotry,"arquivo_renomeado.txt");
        boolean isRenamed = fileArchiveDirectory.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomeado? "+ isRenamed);

        File directoryRenamed = new File("folder2");
        boolean isDirecotoryRenamed = fileDirecotry.renameTo(directoryRenamed);
        System.out.println("Diretorio folder renomeado? " + isDirecotoryRenamed);
    }
}
