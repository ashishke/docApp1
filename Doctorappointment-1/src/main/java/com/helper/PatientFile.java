package com.helper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.MultipartFile;

public class PatientFile {
	
	public static void saveFile(MultipartFile file){
		try {
		File savefile =new ClassPathResource("static/PatientFile").getFile();
		Path path=Paths.get(savefile.getAbsolutePath()+File.separator+file.getOriginalFilename());
		
		Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
