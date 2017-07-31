package com.des.pat.facade;

public class AppDeployimpl implements AppDeploy {

	public String deploy() {
		StopServer s = new StopServerImpl();		
		StageApp sa = new StageAppImpl();
		StartServer st=new StartServerImpl();
		s.stop();
		sa.stage();	
		st.start();
		return "";
		
	}

}
