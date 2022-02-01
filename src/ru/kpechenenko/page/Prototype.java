package ru.kpechenenko.page;

/**
 * Описывает поведение того, что должно давать копии своих объектов.
 * В учебных целях переопределение метода Object не происходит.
 */
interface Prototype {
	Object getClone();
}
