package com.tasks5.observer;

public class Main {
	static Congress congress;
	private static Agency agency;

	public static void main(String[] args) {
		congress = new Congress();

		agency = new Agency();

		for (String alias : Agency.aliases) {
			congress.registerSpy(new Spy(alias, agency));
		}
		congress.begin(new String[] { "1. Розширення лав", "2. Способи відмивання", "3. Джерела надходження" });

	}
}
