package ru.kpechenenko.renders.html;

import ru.kpechenenko.renders.Renderer;
import ru.kpechenenko.templateprocessor.CustomHtmlTemplateProcessor;

/**
 * Отвечает за рисование страницы с абзацами в виде html страницы.
 * Выступает адаптером для самодельного html шаблонизатора с якобы закрытым кодом.
 * Реализация паттерна "Адаптер".
 */
public final class AdapterHtmlRenderer implements Renderer {
	/**
	 * Поле с "библиотечным" шаблонизатором.
	 */
	private final CustomHtmlTemplateProcessor htmlTemplate;

	public AdapterHtmlRenderer() {
		htmlTemplate = new CustomHtmlTemplateProcessor();
	}

	@Override
	public void header(String text) {
		htmlTemplate.addPairTag("<h1>", text);
	}

	@Override
	public void paragraph(String text) {
		htmlTemplate.addPairTag("<p>", text);
	}

	@Override
	public void footer() {
		htmlTemplate.addSingleTag("<hr>");
		htmlTemplate.finishCreatingPage();
		System.out.println(htmlTemplate.getContent());
	}
}
