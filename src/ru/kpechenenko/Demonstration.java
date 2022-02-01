package ru.kpechenenko;

import ru.kpechenenko.page.Page;
import ru.kpechenenko.renders.PageRenderer;
import ru.kpechenenko.renders.Renderer;
import ru.kpechenenko.renders.console.ListRenderer;
import ru.kpechenenko.renders.html.AdapterHtmlRenderer;

public class Demonstration {
	public static void main(String[] args) {
		// Создаём страницу, которую будем рисовать.
		Page dishesPage = new Page("Меню");
		dishesPage.addParagraph("Борщ");
		dishesPage.addParagraph("Котлеты с пюрешкой");
		dishesPage.addParagraph("Компот");

		// При помощи "Прототипа" создаём копию страницы, добавляем дополнительную информацию на неё.
		Page extendedDishesPage = (Page) dishesPage.getClone();
		extendedDishesPage.addParagraph("Пицца");
		extendedDishesPage.addParagraph("Бешбармак");


		Renderer listRenderer = new ListRenderer();
		PageRenderer pageTextRenderer = new PageRenderer(dishesPage, listRenderer);

		System.out.println("Отрисовка в виде списка в консоль:");
		pageTextRenderer.renderPageSomeWhere();

		System.out.println();

		// Создаём "Адаптер" для "библиотечного" класса, чтобы можно было нарисовать страницу через общий интерфейс.
		Renderer htmlRenderer = new AdapterHtmlRenderer();
		PageRenderer pageHtmlRenderer = new PageRenderer(extendedDishesPage, htmlRenderer);

		System.out.println("Отрисовка в виде html в магическом консольном браузере:");
		pageHtmlRenderer.renderPageSomeWhere();
	}
}
