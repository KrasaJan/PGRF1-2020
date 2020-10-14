package streda_17_25_c02.rasterize;

import streda_17_25_c02.model.Line;

import java.awt.*;

public abstract class LineRasterizer {

    Raster raster;
    Color color;

    public LineRasterizer(Raster raster) {
        this.raster = raster;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setColor(int color) {
        this.color = new Color(color);
    }

    public abstract void rasterize(Line line);

    public abstract void rasterize(int x1, int y1, int x2, int y2, Color color);

}
