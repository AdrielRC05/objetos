package geometriaAbstracta;

public abstract class FiguraGeometrica {
    private String color;

    public String getColor() {
        return color;
    }

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void doubleArea();
}
