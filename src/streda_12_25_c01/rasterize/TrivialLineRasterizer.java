package streda_12_25_c01.rasterize;

import streda_12_25_c01.model.Line;

import java.awt.*;

public class TrivialLineRasterizer extends LineRasterizer {

    public TrivialLineRasterizer(Raster raster) {
        super(raster);
    }

    @Override
    public void rasterize(Line line) {
        int x1 = line.getX1();
        int y1 = line.getY1();
        int x2 = line.getX2();
        int y2 = line.getY2();
        Color color = new Color(line.getColor());
        rasterize(x1, y1, x2, y2, color);
    }

    @Override
    public void rasterize(int x1, int y1, int x2, int y2, Color color) {
        float k = (y2 - y1) / (float) (x2 - x1);
        float q = y1 - k * x1;

        for (int x = x1; x <= x2; x++) {
            float y = k * x + q;
            raster.setPixel(x, Math.round(y), 0xffff00);
        }
    }

}
