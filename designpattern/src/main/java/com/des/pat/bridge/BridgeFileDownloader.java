package com.des.pat.bridge;

import java.io.File;

public class BridgeFileDownloader implements IBridgeFileDownloader {
	
	IFileDownload df;
	
	public BridgeFileDownloader(IFileDownload f){
		this.df=f;
	}
	public File downloadFile(String path) {
		return df.downloadFile(path);		
	}
	public boolean storeFile(Object object) {
		return df.storeFile(object);
	}

}
