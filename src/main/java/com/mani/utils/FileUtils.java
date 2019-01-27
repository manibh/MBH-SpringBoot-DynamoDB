package com.mani.utils;

import javax.annotation.Resource;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;


@Resource(name = "fileUtils")
public class FileUtils {

    public HashSet<String> ListFolderFiles(String path) throws Exception{
//        This is try with resource syntax https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        HashSet pathsMap = new HashSet();
        try (Stream<Path> pathStream = Files.walk(Paths.get(path))) {
//            paths.filter(Files::isRegularFile).forEach(System.out::println);
// For following syntax refer to https://stackoverflow.com/questions/33610330/java-files-walk-to-filter-files-only-with-starting-with-o
            pathStream.filter(Files::isRegularFile).forEach(filePath-> {
                pathsMap.add(filePath.getFileName());
            });
            System.out.println("this is my map size" + pathsMap.size());

            pathsMap.forEach(mypath -> {
                System.out.println(mypath);
            });
            pathsMap.forEach(s -> {
                System.out.println(s);
            });

//            for (Iterator<String> it = pathsMap.iterator(); it.hasNext(); ) {
//                String i = it.next();
//                System.out.println(i);
//            }
//            paths.filter(Files::isRegularFile).forEach(pathsMap::ad);
            return pathsMap;
        }
    }

    public HashMap<Path,File> ListFolderFilesV2(String path) throws Exception{
        HashMap<Path, File> pathsMap = new HashMap();
        try (Stream<Path> pathStream = Files.walk(Paths.get(path))) {
            pathStream.filter(Files::isRegularFile).forEach(filePath-> {
                System.out.println(filePath.toFile());
                pathsMap.put(filePath.getFileName(),filePath.toFile());

            });
            System.out.println("this is my map size" + pathsMap.size());
// syntax reference: https://www.mkyong.com/java8/java-8-foreach-examples/
            pathsMap.forEach((k,v) -> {
                System.out.println(k + "   " + v);
            });
        }
        return new HashMap<>();
    }

}
