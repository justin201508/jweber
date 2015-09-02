package com.hexin.jweber.core;

import java.util.List;

import com.hexin.jweber.core.listener.LifecycleListener;

/**
 * the life cycle management interface 
 * init,
 * start,
 * stop,
 * destory
 * 
 * @author suntao@myhexin.com
 *
 */
public interface Lifecycle {
	
	public void addLifecycleListener(LifecycleListener listener);
	public List<LifecycleListener> findLifecycleListeners();
	public void removeLifecycleListener(LifecycleListener listener);
	
}
