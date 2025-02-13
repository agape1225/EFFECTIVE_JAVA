import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Point {

    private final Collection stamps;
    private final Collection<Stamp> stamps;

    static int numElementsInCommon(Set<?> s1, Set<?> s2) {}

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if(! ( o instanceof Point ))
            return false;
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }
}
