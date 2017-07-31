package com.des.pat.adapter;

public class XmlServiceImpl implements XmlService {

	public String getXmlData() {
		
		return "<import name=\"person\"> <item> <firstName>Emil</firstName><lastName>Example</lastName> <addresses><address><street>Example Blvd.</street> </address> <address><street>Example Ave.</street> </address> </addresses></item></import>";
	}

}
