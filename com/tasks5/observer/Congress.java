package com.tasks5.observer;

public class Congress {
	private Spy[] spies;
	private int registeredSpies;

	Congress() {
		spies = new Spy[50];
		registeredSpies = 0;
	}

	public void registerSpy(Spy spy) {
		spies[registeredSpies++] = spy;
	}

	private void notifySpies(String textMessage) {
		for (Spy s : spies) {
			if (s != null) {
				if (Math.random() < 0.5) {
					s.update(new Message(textMessage));
				} else {
					s.exposed();

				}
			}
		}

	}

	public void begin(String[] themes) {
		System.out.println("Відкриття З'їзду корупціонерів.");
		System.out.println();
		for (String theme : themes) {
			System.out.println("Початок розгляду питання \"" + theme + "\"");
			notifySpies(theme);
			System.out.println();
		}
		System.out.println("З'їзд корупціонерів завершено.");
	}

}
