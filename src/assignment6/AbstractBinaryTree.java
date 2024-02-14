package assignment6;


import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;
import com.sun.source.tree.Tree.Kind;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBinaryTree<E> implements BinaryTree<E> {
    public Position<E> sibling(Position<E> p) {
        Position<E> parent = parent(p);
        if (parent == null) return null;
        if (p == left(parent))
            return right(parent);
        else
            return left(parent);
    }
    public int numChildren(Position<E> p) {
        int count=0;
        if (left(p) != null)
            count++;
        if (right(p) != null)
            count++;
        return count;
    }
    public Iterable<Position<E>> children(Position<E> p) {
        List<Position<E>> snapshot = new ArrayList<>(2); // max capacity of 2
        if (left(p) != null)
            snapshot.add(left(p));
        if (right(p) != null)
            snapshot.add(right(p));
        return snapshot;
    }

    public abstract Position<E> left(Position<E> p);
    public abstract Position<E> right(Position<E> p);

    public abstract ExpressionTree getLeftOperand();

    public abstract ExpressionTree getRightOperand();

    public abstract Kind getKind();

    public abstract <R, D> R accept(TreeVisitor<R, D> visitor, D data);

    public abstract Position<E> parent(Position<E> p);
}