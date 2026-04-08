package academy.devdojo.devdojojava.javacore.Minterfaces.test;

import academy.devdojo.devdojojava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.devdojojava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.devdojojava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
