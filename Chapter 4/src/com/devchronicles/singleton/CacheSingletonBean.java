package com.devchronicles.singleton;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.DependsOn;
import javax.ejb.EJB;

@Startup
@DependsOn("MyLoggingBean")
@Singleton
public class CacheSingletonBean {

	private Map<Integer, String> myCache;

	@EJB
	MyLoggingBean loggingBean;

	@PostConstruct
	public void start() {
		loggingBean.logInfo("Started!");
		myCache = new HashMap<Integer, String>();
	}

	public void addUser(Integer id, String name) {
		myCache.put(id, name);
	}

	public String getName(Integer id) {
		return myCache.get(id);
	}
}
