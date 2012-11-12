package edu.nyu.adb.repcrec;

import java.util.ArrayList;
import java.util.HashMap;


public class Site extends Thread{

	private DataLockManager dataLockManager;
	private int siteId;
	private HashMap<String ,ArrayList> siteTable=new HashMap();
	
	public Site(int siteId){
		this.dataLockManager=new DataLockManager();
		this.siteId=siteId;
	}
}
