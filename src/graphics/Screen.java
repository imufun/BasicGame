package graphics;

import java.util.Iterator;

public class Screen {
	private int width, height;
	public int[] pixles;

	int time = 0;
	int counter = 50;

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixles = new int[width * height];
	}

	public void clear() {
		for (int i = 0; i < pixles.length; i++) {
			pixles[i]=0;
			//im
		}
	}

	public void render() {
		counter++;
		if (counter % 100 == 0) {
			time++;
		}

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				pixles[time + time * width] = 0xff00ff;
			}
		}
	}
}
