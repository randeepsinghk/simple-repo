package com.des.pat.bridge;

import java.io.File;

public class LinuxFileDownload implements IFileDownload {

	public File downloadFile(String path) {
		System.out.println("downloading file on linux...");
		return null;
	}

	public boolean storeFile(Object object) {
		System.out.println("storing file on linux...");
		return true;
	}
}
