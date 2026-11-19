package com.demo.client;

import com.demo.sim.IdeaSim;

public class RelianceMobile {
	private IdeaSim r = new IdeaSim();

	public void startMobile() {
		System.out.println("welcome to reliance mobile...");
	}

	RelianceMobile() {
		startMobile();
		r.startIdeaSim();
	}
}
