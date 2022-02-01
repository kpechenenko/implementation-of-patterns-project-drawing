package ru.kpechenenko.page;

import java.util.ArrayList;
import java.util.List;

/**
 * Хранит в себе информацию на странице в виде абзацев.
 * Реализует паттерны "Итератор" и "Прототип".
 */
public final class Page implements ParagraphIterator, Prototype {
	private final String title;

	private final List<String> paragraphs;
	private Integer currentParagraphIndex;

	public Page(String title) {
		this.title = title;
		paragraphs = new ArrayList<>();
		currentParagraphIndex = null;
	}

	// Приватный конструктор для реализации паттерна "Прототип".
	private Page(Page otherPage) {
		this.title = otherPage.getTitle();
		paragraphs = new ArrayList<>(otherPage.paragraphs);
		currentParagraphIndex = 0;
	}

	public void addParagraph(String text) {
		paragraphs.add(text);
	}

	// Реализация паттерна "Итератор" для обхода абзацев на странице.
	@Override
	public boolean hasNextParagraph() {
		return currentParagraphIndex < paragraphs.size();
	}

	// Реализация паттерна "Итератор".
	@Override
	public String getNextParagraph() {
		if (this.hasNextParagraph()) {
			return paragraphs.get(currentParagraphIndex++);
		}
		return null;
	}

	// Реализация паттерна "Итератор".
	@Override
	public void resetParagraphIterator() {
		currentParagraphIndex = 0;
	}


	public String getTitle() {
		return title;
	}

	// Реализация паттерна "Прототип".
	@Override
	public Object getClone() {
		return new Page(this);
	}
}
