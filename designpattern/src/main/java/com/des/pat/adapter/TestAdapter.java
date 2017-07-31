package com.des.pat.adapter;

import org.json.JSONObject;

public class TestAdapter {
	
	public static void main(String[] args) {
		convert();
	}

	private static void convert() {
		XmlToJsonAdapter x = new XmlToJsonAdapter();
		XmlServiceImpl xm = new XmlServiceImpl();		
		JSONObject data=x.getJsonData(xm);		
		JsonService s = new JsonServiceImpl();
		s.sendJsonData(data);
	}

}
