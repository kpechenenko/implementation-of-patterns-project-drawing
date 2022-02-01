package ru.kpechenenko.renders;

/**
 * Описывает отрисовку элементов в отрисовщике.
 */
public interface Renderer {
	void header(String text);

	void paragraph(String text);

	void footer();
}
