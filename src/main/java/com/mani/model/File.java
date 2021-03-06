package com.mani.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

// reference https://github.com/derjust/spring-data-dynamodb

@DynamoDBTable(tableName = "files")
public class File {

    private String fileName;
    private String filePath;
    private long fileSize;




    public File() {
        // Default constructor is required by AWS DynamoDB SDK
    }

    public File(String fileName, String filePath, long fileSize) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileSize = fileSize;
    }

    @DynamoDBHashKey(attributeName = "fileName")
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @DynamoDBAttribute(attributeName = "path")
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

//    @DynamoDBAttribute
//    public long getFileSize() {
//        return fileSize;
//    }
//
//    public void setFileSize(long fileSize) {
//        this.fileSize = fileSize;
//    }





    @Override
    public String toString(){
        return "file name=" + this.fileName + " , path=" + filePath;
    }
}
