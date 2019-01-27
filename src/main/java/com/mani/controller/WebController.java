package com.mani.controller;

import com.mani.model.File;
import com.mani.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@EnableAutoConfiguration
public class WebController {

    @Autowired
    FileRepository repository;

    @RequestMapping("/delete")
    public String delete() {
        repository.deleteAll();
        return "Done";
    }

    @RequestMapping("/save")
    public String save() {
        // save a single Customer
        File myFile = new File();
        myFile.setFileName("test.com");
        myFile.setFilePath("/opt/mani/");
//        myFile.setFileSize(1024);
        repository.save(myFile);
//        repository.save(new Customer("JSA-1", "Jack", "Smith"));

        // save a list of Customers
//        repository.save(Arrays.asList(new Customer("JSA-2", "Adam", "Johnson"), new Customer("JSA-3", "Kim", "Smith"),
//                new Customer("JSA-4", "David", "Williams"), new Customer("JSA-5", "Peter", "Davis")));

        return "Done";
    }

    @RequestMapping("/findall")
    public String findAll() {
        String result = "";
        Iterable<File> files = repository.findAll();

        for (File file : files) {
            result += file.toString() + "<br>";
        }

        return result;
    }

    @RequestMapping("/findbyid")
    public String findById(@RequestParam("id") String id) {
        String result = "";
        result = repository.findById(id).toString();
//        result = repository.findOne(id).toString();
        return result;
    }

//    @RequestMapping("/findbylastname")
//    public String fetchDataByLastName(@RequestParam("lastname") String lastName) {
//        String result = "";
//
//        for (Customer cust : repository.findByLastName(lastName)) {
//            result += cust.toString() + "<br>";
//        }
//
//        return result;
//    }
}