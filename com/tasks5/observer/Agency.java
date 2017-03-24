package com.tasks5.observer;

public class Agency {
	public static String[] aliases = { "містер Білий", "містер Помаранчевий", "містер Блондин", "містер Рожевий",
			"містер Коричневий", "Едді Кебот", "Джо Кебот", "містер Синій", "Холдевей", "Мартін Неш" };


	public void spyExposed(String alias) {
		System.out.println("Шпигуна під псевдо \"" + alias + "\" розкрито!");

	}

	public void receiveMessage(String text, String alias) {
		System.out.println("Шпигун \""+alias+"\" повідомляє про: \""+text+"\"");

	}

}
