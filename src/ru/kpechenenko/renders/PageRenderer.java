package ru.kpechenenko.renders;

import ru.kpechenenko.page.Page;

/**
 * Отвечает за рисование страницы определенным способом.
 */
public final class PageRenderer {
	private final Page page;
	private final Renderer renderer;

	public PageRenderer(Page page, Renderer renderer) {
		this.page = page;
		this.renderer = renderer;
	}

	public void renderPageSomeWhere() {
		page.resetParagraphIterator();

		renderer.header(page.getTitle());

		while (page.hasNextParagraph()) {
			renderer.paragraph(page.getNextParagraph());
		}

		renderer.footer();
	}
}
