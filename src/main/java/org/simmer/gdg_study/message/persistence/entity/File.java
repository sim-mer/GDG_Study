package org.simmer.gdg_study.message.persistence.entity;

import jakarta.persistence.Id;
import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "file")
public class File {
    @Id
    private String id;
    private String name;
    private String fileType;
    private String url;

    protected File() {
    }

    @Builder
    public File(String name, String fileType, String url) {
        this.name = name;
        this.fileType = fileType;
        this.url = url;
    }
}
