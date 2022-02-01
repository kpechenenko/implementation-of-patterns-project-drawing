package ru.kpechenenko.page;

/**
 * Описывает поведение итератора абзацев.
 * Встроенный параметризованный интерфейс не используется в учебных целях.
 */
interface ParagraphIterator {
	boolean hasNextParagraph();

	String getNextParagraph();

	void resetParagraphIterator();
}
