package ru.kpechenenko.renders.console;

import ru.kpechenenko.renders.Renderer;

/** Отвечает за рисование страницы с абзацами в виде списка. */
public final class ListRenderer implements Renderer {

	@Override
	public void header(String text) {
		System.out.println("======");
		System.out.printf("|Заголовок %s\n", text);
		System.out.println("======");
	}

	@Override
	public void paragraph(String text) {
		System.out.printf("|--%s\n", text);
	}

	@Override
	public void footer() {
		System.out.println("======");
		System.out.printf("|%s\n", "Подвал");
		System.out.println("======");
	}
}
