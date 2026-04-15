public class MouseListener {
    private static MouseListener instance;
    private double scrollX, scrollY;
    private double xPos, yPos, lastX, lastY;
    private boolean mouseButtonPressed[] = new boolean[3];
    private boolean isDragging;

    private MouseListener() {
        // Valores já iniciam em 0 por padrão, então não precisa setar manualmente
    }

    public static MouseListener getInstance() {
        if (instance == null) {
            instance = new MouseListener();
        }
        return instance;
    }

    public double getX() {
        return xPos;
    }

    public double getY() {
        return yPos;
    }

    public double getScrollX() {
        return scrollX;
    }

    public double getScrollY() {
        return scrollY;
    }

    public boolean isDragging() {
        return dragging;
    }
}