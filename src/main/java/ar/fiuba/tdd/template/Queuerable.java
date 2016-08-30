package ar.fiuba.tdd.template;

/**
 * Created by martin on 8/28/16.
 */
public interface Queuerable<T> {

    boolean isEmpty();

    int size();

    void add(T item); // agregar un item

    T top(); // retornar el primer item, lanzar exception si esta vacío.

    void remove(); // remover el primer item, lanzar exception si esta vacío.
}
