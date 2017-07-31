package com.des.pat.adapter;

import org.json.JSONObject;

public class JsonServiceImpl implements JsonService {

	public void sendJsonData(JSONObject json) {
		System.out.println("sending json..."+ json.toString());

	}

}
