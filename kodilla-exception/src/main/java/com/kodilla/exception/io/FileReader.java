package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() throws FileReaderException {

        ClassLoader classLoader = getClass().getClassLoader();
        try{
        File file = new File(classLoader.getResource("file/na!mes.txt").getFile());

        Stream<String> fileLines = Files.lines(Paths.get(file.getPath()));
            fileLines.forEach(System.out::println);

        }catch (Exception e) {
            throw new FileReaderException();
        }finally {
            System.out.println("Im am gonna be here... always");
        }
    }
}
