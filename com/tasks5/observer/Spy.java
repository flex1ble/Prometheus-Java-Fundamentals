package com.tasks5.observer;

public class Spy implements Observer {
	private Agency agency;
	private String alias;
	private boolean exposed;

	Spy(String alias, Agency agency) {
		this.alias = alias;
		this.agency = agency;
		exposed = false;
	}

	@Override
	public void update(Message message) {
		if (!exposed){
		  agency.receiveMessage(message.text, this.alias);
		}

	}

	public void exposed() {
		this.exposed = true;
		agency.spyExposed(this.alias);
	}

}
