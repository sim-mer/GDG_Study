package org.simmer.gdg_study.message.persistence.entity;


import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "message")
public class Message {
    @Id
    private String id;

    @CreatedDate
    private LocalDateTime createdAt;

    private Long chatroomId;
    private Long memberChatroomId; // nickname을 위함

    private String type;
    private String content;

    private List<File> files;

    protected Message() {
    }

    @Builder
    public Message(Long chatroomId, Long memberChatroomId, String type, String content, List<File> files) {
        this.chatroomId = chatroomId;
        this.memberChatroomId = memberChatroomId;
        this.type = type;
        this.content = content;
        this.files = files;
    }
}
