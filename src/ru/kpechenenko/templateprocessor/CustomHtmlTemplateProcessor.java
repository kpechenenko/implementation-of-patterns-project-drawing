package ru.kpechenenko.templateprocessor;

/**
 * Самодельный шаблонизатор HTML, код которого нельзя изменить под конкретный интерфейс, сделано в учебных целях.
 */
public final class CustomHtmlTemplateProcessor {
	private final StringBuilder htmlPage;

	public CustomHtmlTemplateProcessor() {
		htmlPage = new StringBuilder(
			"<!DOCTYPE html>\n" +
				"<html lang=\"ru\">\n" +
				"<head>\n" +
				"    <meta charset=\"UTF-8\">\n" +
				"    <title>Custom html шаблонизатор</title>\n" +
				"</head>\n" +
				"<body>\n"
		);
	}

	public void addSingleTag(String tag) {
		htmlPage.append("    ");
		htmlPage.append(tag);
		htmlPage.append("\n");
	}

	public void addPairTag(String openTag, String body) {
		htmlPage.append("    ");
		htmlPage.append(openTag);
		htmlPage.append(body);
		htmlPage.append(getCloseTag(openTag));
		htmlPage.append("\n");
	}

	private String getCloseTag(String openTag) {
		return openTag.charAt(0) + "/" + openTag.substring(1);
	}

	public void finishCreatingPage() {
		htmlPage.append("</body>\n</html>\n");
	}

	public String getContent() {
		return htmlPage.toString();
	}
}
