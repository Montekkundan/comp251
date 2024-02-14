package assignment6;

public interface BinaryTree<E> {
    Position<E> root();
    Position<E> parent(Position<E> p) throws IllegalArgumentException;
    Position<E> left(Position<E> p) throws IllegalArgumentException;
    Position<E> right(Position<E> p) throws IllegalArgumentException;
    Position<E> addRoot(E e) throws IllegalStateException;
    Position<E> addLeft(Position<E> p, E e) throws IllegalArgumentException;
    Position<E> addRight(Position<E> p, E e) throws IllegalArgumentException;
    int size();
    boolean isEmpty();
}