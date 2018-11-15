package com.example.service;


import com.example.model.DBFile;
import com.example.repository.DBFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@Service
public class DBFileStorageService {

    @Autowired
    private DBFileRepository dbFileRepository;


    public DBFile storeFile(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        DBFile dbFile = null;
        try {
            dbFile = new DBFile(fileName, file.getContentType(), file.getBytes());
        } catch (IOException e) {
            System.out.println("file not found");
        }

        return dbFileRepository.save(dbFile);

    }


   /* public static DBFile getFile(String fileId) {

    }*/
}