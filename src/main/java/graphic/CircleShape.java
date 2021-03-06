package graphic;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleShape implements Rendered {
    private static final Color DEFAULT = Color.BLACK;

    private final Point point;
    private final Color color;

    public CircleShape(Point point) {
        this(point, DEFAULT);
    }

    public CircleShape(Point point, Color color) {
        this.point = point;
        this.color = color;
    }

    @Override
    public void render(Graphics2D g2d) {
        double pointSize = point.getSize();
        g2d.setColor(Color.WHITE);
        g2d.draw(new Ellipse2D.Double(point.getX(), point.getY(), pointSize, pointSize));
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.draw(new Ellipse2D.Double(point.getX(), point.getY(), pointSize - 2 / pointSize, pointSize - 2 / pointSize));
        g2d.setColor(color);
        g2d.fill(new Ellipse2D.Double(point.getX(), point.getY(), pointSize, pointSize));
    }
}
