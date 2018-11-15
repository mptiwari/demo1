package com.example.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Data
@Table(name = "files",uniqueConstraints = {
        @UniqueConstraint(columnNames = "file_id") })
public class DBFile{

    private static final long serialVersionUID = 6447426794596398975L;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name= "file_id")
    private String fileId;

    @Column(name= "file_name")
    private String fileName;

    @Column(name= "file_type")
    private String fileType;

    @Column(name= "file_data")
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] fileData;


    public DBFile() {

    }

    public DBFile(String fileName, String fileType, byte[] fileData) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileData = fileData;
    }

}