package com.hexin.jweber.core;

public enum LifeCycleEvent {
	
	// init
	beforeInitEvent("beforeInit"),
	afterInitEvent("afterInit"),
	// start
	beforeStartEvent("beforeStart"),
	startEvent("startEvent"),
	afterStartEvent("afterStartEvent"),
	// stop
	beforeStopEvent("beforeStop"),
	stopEvent("stopEvent"),
	afterStopEvent("afterStopEvent"),
	// destory
	beforeDestoryEvent("beforeDestory"),
	stopDestory("DestoryEvent"),
	afterDestoryEvent("afterDestoryEvent");
	
	private String event ;
	
	private LifeCycleEvent(String event) {
		this.event = event;
	}
	
	public boolean equals(LifeCycleEvent event) {
		return event == this;
	}
}
