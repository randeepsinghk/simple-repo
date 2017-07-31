package com.des.pat.adapter;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XmlToJsonAdapter {
	
	public JSONObject getJsonData(XmlService x) {
		String xml=x.getXmlData();
		  System.out.println("xml is " +xml);
		try {
            JSONObject xmlJSONObj = XML.toJSONObject(xml);
            String json = xmlJSONObj.toString();
            System.out.println(json);
            return xmlJSONObj;
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
		return null;
	}

}
