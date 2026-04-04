package org.chakriya.file_uploading_demo.model.response.enitity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FileMetadata {
    private String fileName;
    private String fileUrl;
    private String fileType;
    private Long fileSize;
}
