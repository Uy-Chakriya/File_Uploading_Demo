package org.chakriya.file_uploading_demo.service;

import org.chakriya.file_uploading_demo.model.response.enitity.FileMetadata;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    FileMetadata uploadFile(MultipartFile file);
    Resource getFileByFileName(String fileName);
}
