package com.kharoud;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.jni.File;

public class FileUpload extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try { 
			
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		List<FileItem> mutlifiles = sf.parseRequest(request);
		
		for( FileItem item: mutlifiles) {
			
			item.write(new java.io.File("C:\\Users\\SHARMA\\Desktop\\JavaApplications\\" + item.getName()));
			
		
		}
		
		System.out.println("file uploaded");
		
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
