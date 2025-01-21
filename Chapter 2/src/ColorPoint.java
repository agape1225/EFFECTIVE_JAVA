import java.awt.*;
import java.sql.Timestamp;
import java.util.Objects;

public class ColorPoint extends Point{
    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color){
        this.point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    public Point asPoint() {
        return point;
    }

    @Override public boolean equals(Object o){
        if(!(o instanceof ColorPoint))
            return false;
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    Timestamp
}
