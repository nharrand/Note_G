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
    static int[] hs2 = {0, 56, 176, 376, 664, 1040, 1504, 2056, 2696, 3424, 4240, 4240};

    //"#152A84", "#776EAA", "#201315", "#DB1D6B", "#CDE4CF", "#008460", "#DBE479", "#F1C42F", "#E22733"

    public void settings(){
        size(4 * (20 + n), hs2[n]);
    }

    public void setup() {
        Printer p = new Printer(
                () -> {
                    fill(0x15,0x2A,0x84);//"#CDE4CF"
                    stroke(0x15,0x2A,0x84);
                },
                () -> {
                    fill(0x77,0x6E,0xAA);//"#776EAA"
                    stroke(0x77,0x6E,0xAA);
                },
                pixel -> point(pixel.x, pixel.y)
                //pixel -> rect(pixel.x, pixel.y, pixel.w, pixel.h)
        );
        NoteG ng = new NoteG(21 + n, n, p);
        ng.run();



        System.out.println("Max res: " + p.maxRes);
        System.out.println("Last pixel: " + p.lastPixel);
        save("img/Note_G_" + n + ".png");
        System.out.println("Save " + "img/Note_G_" + n + ".png");


        for(int i = 1; i < ng.v.length; i++) {
            System.out.println("V" + i + " = " + ng.v[i]);
        }
    }

    public void draw(){
    }

    public void writeCell(int i) {

    }

    public static void main(String[] args) {
        int a = 8;
        System.out.println("n="+a);
        n = a;
        PApplet.main("se.kth.castor.App");
        //n = 6;
        //PApplet.main("se.kth.castor.App");
        /*for (int a = 1; a < 11; a++) {
            System.out.println("n="+a);
            n = a;
            PApplet.main("se.kth.castor.App");
        }*/
    }
}
