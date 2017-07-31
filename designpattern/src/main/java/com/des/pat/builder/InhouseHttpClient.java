package com.des.pat.builder;

public class InhouseHttpClient {
	
	private final String host ;
	private final int port;
	private final String proxy ;
	
	
	
	private InhouseHttpClient(HttpBuilder builder){
		this.host=builder.host;
		this.port=builder.port;
		this.proxy=builder.proxy;
	}
	
	@Override
	public String toString() {
		return "host :"+ host + " port  : "+ port + " proxy : "+ proxy;
	}
	
	
	
	public static class HttpBuilder {
		
		private String host;
		private int port;
		private  String proxy ;
		
		public HttpBuilder host(String host){
			this.host=host;
			return this;
		}
		
		public HttpBuilder port(int port){
			this.port=port;
			return this;
		}
		
		public HttpBuilder proxy(String proxy){
			this.proxy=proxy;
			return this;
		}
		
		public InhouseHttpClient build(){
			InhouseHttpClient in = new  InhouseHttpClient(this);
			return in;
		}

	}

}
