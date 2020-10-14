package se.kth.castor;

import processing.core.PApplet;

import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class App  extends PApplet {
    static int n = 0;
    static int width = 120;
    static int heigth = 0;
    static int[] hs = {56, 168, 368, 656, 1032, 1496, 2048, 2688, 3416, 4232, 4232};
    static int[] hs2 = {56, 176, 376, 664, 1040, 1504, 2056, 2696, 3424, 4240, 4240};

    public void settings(){
        size(width, hs[n]);
    }

    public void setup() {
        Printer p = new Printer(
                () -> {
                    fill(0xFF,0,0);
                    stroke(0xFF,0,0);
                },
                () -> {
                    fill(0,0,0xFF);
                    stroke(0,0,0xFF);
                },
                pixel -> rect(pixel.x, pixel.y, pixel.w, pixel.h)
        );
        NoteG ng = new NoteG(31, n, p);
        ng.run();

        System.out.println("Max res: " + p.maxRes);
        System.out.println("Last pixel: " + p.lastPixel);
        save("img/Note_G_" + n + ".png");
    }

    public void draw(){
    }

    public void writeCell(int i) {

    }

    public static void main(String[] args) {
        for (int a = 1; a < 11; a++) {
            n = a;
            PApplet.main("se.kth.castor.App");
        }
    }
}
