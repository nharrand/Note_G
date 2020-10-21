package se.kth.castor;

import org.apache.commons.math3.fraction.BigFraction;
import processing.core.PApplet;

public class Examples  extends PApplet {
	static BigFraction n = new BigFraction(0);
	static int width = 120;
	static int height = 0;
	static int[] hs = {56, 168, 368, 656, 1032, 1496, 2048, 2688, 3416, 4232, 4232};
	static int[] hs2 = {56, 176, 376, 664, 1040, 1504, 2056, 2696, 3424, 4240, 4240};

	//"#152A84", "#776EAA", "#201315", "#DB1D6B", "#CDE4CF", "#008460", "#DBE479", "#F1C42F", "#E22733"

	public void settings(){
		size(4, 8);
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

		p.print(n);



		System.out.println("Max res: " + p.maxRes);
		System.out.println("Last pixel: " + p.lastPixel);
		save("ex/Example_" + n.toString().replace("/","_").replace(" ","") + ".png");
	}

	public void draw(){	}

	public static void main(String[] args) {
		int[] val = new int[]{-1, 0, 1, 2, 3, 4, 15, 16, 21845, 23130, 42405, 43690};
		/*for (int a = 0; a < val.length; a++) {
			System.out.println("a: " + val[a]);
			n = val[a];
			PApplet.main("se.kth.castor.Examples");
		}*/

		try {
			n = new BigFraction(0);
			PApplet.main("se.kth.castor.Examples");
			Thread.sleep(3000);
			n = new BigFraction(0, 1);
			PApplet.main("se.kth.castor.Examples");
			Thread.sleep(3000);
			n = new BigFraction(1,1);
			PApplet.main("se.kth.castor.Examples");
			Thread.sleep(3000);
			n = new BigFraction(2,1);
			PApplet.main("se.kth.castor.Examples");
			Thread.sleep(3000);
			n = new BigFraction(1,2);
			PApplet.main("se.kth.castor.Examples");
			Thread.sleep(3000);
			n = new BigFraction(1,6);
			PApplet.main("se.kth.castor.Examples");
			Thread.sleep(3000);
			n = new BigFraction(-1,30);
			PApplet.main("se.kth.castor.Examples");
			Thread.sleep(3000);
			n = new BigFraction(1,42);
			PApplet.main("se.kth.castor.Examples");
			Thread.sleep(3000);
			n = new BigFraction(-1,30);
			PApplet.main("se.kth.castor.Examples");
			Thread.sleep(3000);
			n = new BigFraction(5,66);
			PApplet.main("se.kth.castor.Examples");
			Thread.sleep(3000);
			n = new BigFraction(7,6);
			PApplet.main("se.kth.castor.Examples");
			Thread.sleep(3000);
			n = new BigFraction(-3617,510);
			PApplet.main("se.kth.castor.Examples");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}