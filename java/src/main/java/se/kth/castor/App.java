package se.kth.castor;

import processing.core.PApplet;

public class App  extends PApplet {
    static int n = 0;
    static int[] hs2 = {0, 56, 176, 376, 664, 1040, 1504, 2056, 2696, 3424, 4240, 4240};

    public void settings(){
        size(4 * (20 + n), hs2[n]);
    }

    public void setup() {
        Printer p = new Printer(
                () -> {
                    fill(0x00, 0x84, 0x60);//"#008460"
                    stroke(0x00, 0x84, 0x60);
                },
                () -> {
                    fill(0xCD,0xE4,0xCF);//"#CDE4CF"
                    stroke(0xCD,0xE4,0xCF);
                },
                pixel -> point(pixel.x, pixel.y)
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

    public void draw(){ }

    public static void main(String[] args) {
        int a = 5;
        System.out.println("n="+a);
        n = a;
        PApplet.main("se.kth.castor.App");
    }
}
