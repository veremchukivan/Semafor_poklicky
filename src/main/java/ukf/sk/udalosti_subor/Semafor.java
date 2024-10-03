package ukf.sk.udalosti_subor;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Semafor extends Canvas {
    private  int stav;
    GraphicsContext gc;

    public Semafor() {
        super(20,80);
        gc=getGraphicsContext2D();
        stav=0;
        vykresli();
    }
    public void zmenastavu(){
        stav=(stav+1)%3;
        vykresli();
    }
    public void vykresli() {
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0,20,80);
        gc.setStroke(Color.WHITE);
        gc.strokeOval(2,10,16,16);
        gc.strokeOval(2,30,16,16);
        gc.strokeOval(2,50,16,16);
        switch (stav){
            case 0:gc.setFill(Color.RED);
            gc.fillOval(2,10,16,16);
            break;
            case 1:gc.setFill(Color.YELLOW);
            gc.fillOval(2,30,16,16);
            break;
            case 2:gc.setFill(Color.GREEN);
            gc.fillOval(2,50,16,16);
            break;
        }

    }
}
