package com.sfc.service;

import java.util.List;

import org.apache.http.Header;
import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ge.predix.solsvc.restclient.impl.RestClient;
import com.sfc.entity.Student;
import com.sfc.repository.StudentRepository;

@Service
public class StudentService {
	
	private static Logger log = Logger.getLogger(StudentService.class);
	
	@Autowired
	StudentRepository studentRepository;
	
	
	@Autowired
	@Qualifier("restClient")
	public RestClient rest;
		
//	@Autowired
//    private HttpServletRequest context;
	
	@Value("${predix_oauthRestHost}")
	String predix_oauthRestHost;
	
//	String predix_oauthClientId;
	
	@Value("${predix_oauthGrantType}")
	String predix_oauthGrantType;
	

	
//	@Value("${accessTokenEndpointUrl}")
//	String accessTokenEndpointUrl;
	
	@Value("${clientId}")
	String clientId;
	
	@Value("${clientSecret}")
	String clientSecret;
	
	/*public Student findStudentByEmail(String email){
		return studentRepository.findStudentByEmail(email);
	}*/
	
	public Student saveStudent(Student s){
		return studentRepository.save(s);
	}
	
	/*public Student findStudentById(Integer id){
		if(authorize()){
			log.debug("user is authorzed now !!!!!");
		return studentRepository.findOne(id);
		}
		log.debug("user not authorzed  !!!!!");
		return null;
	}*/
	
	public Student findStudentById(Integer id){		
		return studentRepository.findOne(id);		
	}
	
	public Student deleteStudent(Integer id){
		Student s=studentRepository.findOne(id);
		studentRepository.delete(id);
		return s;
	}
	
	public Student updateStudent(Integer id,Student st){
		Student s=studentRepository.findOne(id);
		studentRepository.save(s);
		return s;
	}
	
	public boolean authorize(){
		boolean isAuthorized=true;
		boolean oauthClientIdEncode = true;
		String oauthPort = "80";
		String oauthResource = "/oauth/token";
		String proxyHost = null;
		String proxyPort = null;
		try {
		List<Header> headers = this.rest.getOauthHttpHeaders(this.clientId + ":" + this.clientSecret, oauthClientIdEncode);
		//Request Token fro UAA
		String tokenString = this.rest.requestToken(headers, oauthResource, this.predix_oauthRestHost, oauthPort, "password",
				proxyHost, proxyPort);

		log.debug("TOKEN = " + tokenString);
		
		//Token is stored as a JSON object
		JSONObject token;
		
			token = new JSONObject(tokenString);		
			String authorization = "Bearer " + token.getString("access_token");
		} catch (JSONException e) {
			 isAuthorized=false;
			e.printStackTrace();
		}
		 catch (Exception e) {
			 isAuthorized=false;
				e.printStackTrace();
			}
		return isAuthorized;
	}
	

	

}
