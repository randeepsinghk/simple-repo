package com.des.pat.bridge;

public class TestBridge {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		IFileDownload i = new LinuxFileDownload();
		IBridgeFileDownloader b = new BridgeFileDownloader(i);
		b.downloadFile("c:\\test.txt");		
		IFileDownload j = new WindowsFileDownload();
		IBridgeFileDownloader x = new BridgeFileDownloader(j);
		x.downloadFile("c:\\test.txt");
	}

}
