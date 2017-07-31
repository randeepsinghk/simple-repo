package com.des.pat.bridge;

import java.io.File;

public class WindowsFileDownload implements IFileDownload {

	public File downloadFile(String path) {
		System.out.println("downloading file on windows...");
		return null;
	}

	public boolean storeFile(Object object) {
		System.out.println("storing file on windows...");
		return true;
	}
}
