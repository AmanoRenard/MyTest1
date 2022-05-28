package pers.amanorenard.homeworks.dailytraining.y22m4.day29;

import java.util.ArrayList;
import java.util.Iterator;

class TestArrayList<E> extends ArrayList<E> {
    @Override
    public String toString() {
        Iterator<E> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("ArrayList集合内元素:\n");
        for (;;) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append('\n').toString();
            sb.append(", ");
        }
    }

}
