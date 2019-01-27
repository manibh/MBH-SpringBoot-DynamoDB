package com.mani.repositories;

import com.mani.model.File;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface FileRepository extends CrudRepository<File, String> {
    List<File> findByFileName(String fileName);
//    List<File> findByFilePath(String filePath);
}
