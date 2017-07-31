package com.des.pat.factory;

public class TestFactory {

	public static void main(String[] args) {
		generateReport();
	}

	private static void generateReport() {
		Report r1 =testReport("pdf");
		r1.generate();
		Report r2 =testReport("csv");
		r2.generate();
		Report r3 =testReport("html");
		r3.generate();
	}

	private static Report testReport(String type) {
		if(type.equals("pdf")){
			return new PdfReport();
		}else if (type.equals("csv")){
			return new CsvReport();
		}else if (type.equals("html")){
			return new HtmlReport();
		}
		
		return null;
	}

}
