package com.example.controller;

import com.example.model.DBFile;
import com.example.service.DBFileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;



@RestController
@RequestMapping("/upload")
@CrossOrigin
public class UploadController{


    @Autowired
    private DBFileStorageService dbFileStorageService;

    @PostMapping
    public String fileUpload(@RequestParam("file")MultipartFile file){

        DBFile dbFile = dbFileStorageService.storeFile(file);
        return "File upload successfully";
    }


    /*@GetMapping("/downloadFile/{fileId}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileId) {
        DBFile dbFile = DBFileStorageService.getFile(fileId);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(dbFile.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + dbFile.getFileName() + "\"")
                .body(new ByteArrayResource(dbFile.getData()));
    }*/

}