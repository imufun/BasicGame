package graphics;

import java.util.Iterator;
import java.util.Random;

public class Screen {
	// private static final int MAP_SIZE_MASK = 0;
	private int width, height;
	public int[] pixles;

	private Random random = new Random();

	public int MAP_SIZE = 64;
	public final int MAP_SIZE_MASK = MAP_SIZE - 1;
	public int[] tiles = new int[MAP_SIZE * MAP_SIZE];

	// int xtime = 100;
	// int ytime = 50;

	int counter = 50;

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixles = new int[width * height];

		for (int i = 0; i < MAP_SIZE * MAP_SIZE; i++) {
			tiles[i] = random.nextInt(0xffffff);
			//tiles[0]=0;
		}

	}

	public void clear() {
		for (int i = 0; i < pixles.length; i++) {
			pixles[i] = 0;
			// im
		}
	}

	public void render(int xOffset, int yOffset) {
		for (int y = 0; y < height; y++) {
			int yy = y + yOffset;
			for (int x = 0; x < width; x++) { 
				int xx = x + xOffset;				 
				int tileIndex = ((xx >> 4) & MAP_SIZE_MASK) + ((yy >> 4) & MAP_SIZE_MASK) * MAP_SIZE;
				pixles[x + y * width] = tiles[tileIndex];
			}
			// }
		}
	}

}
