package graphics;

import java.util.Iterator;

public class Screen {
	private int width, height;
	public int[] pixles;

	int xtime = 100;
	int ytime = 50;

	int counter = 50;

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixles = new int[width * height];
	}

	public void clear() {
		for (int i = 0; i < pixles.length; i++) {
			pixles[i] = 0;
			// im
		}
	}

	public void render() {
		counter++;
		if (counter % 100 == 0)
			xtime--;
		if (counter % 100 == 0)
			ytime--;

		for (int y = 0; y < height; y++) {
			if (ytime <0 || ytime >= height)
				break;
			for (int x = 0; x < width; x++) {
				if (xtime < 0 || xtime >= width)break;
				pixles[xtime + ytime * width] = 0xff00ff;
			}
		}
	}
}
