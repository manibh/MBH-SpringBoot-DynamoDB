package com.mani;

import com.mani.repositories.FileRepository;
import com.mani.model.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Test {

    protected String path;
    @Autowired
    FileRepository fileRepository;

    public Test(){
        init();
    }


    public void init(){
//        System.out.println("Enter the path: ");
//        Scanner scanner = new Scanner(System.in);
//        this.path = scanner.nextLine();
//        System.out.println("Your path is : " + path);
    }

    public void test() throws Exception {
//        FileUtils fileUtils=new FileUtils();
//        System.out.println("====>" + path);
//        fileUtils.ListFolderFilesV2(path);
//        DbUtils dbUtils = new DbUtils();
//        dbUtils.connect();
//        File myFile = new File();
//        myFile.setFileName("test.com");
//        myFile.setFilePath("/opt/mani/");
//        myFile.setFileSize(1024);
//        fileRepository.save(myFile);


    }
}
