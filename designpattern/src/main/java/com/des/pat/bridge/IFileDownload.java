package com.des.pat.bridge;

import java.io.File;

public interface IFileDownload {
	
	public File downloadFile(String path);

	public boolean storeFile(Object object);
}
