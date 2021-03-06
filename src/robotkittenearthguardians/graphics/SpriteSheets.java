package robotkittenearthguardians.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheets {

	private String path;
	private final int X_SIZE;
	private final int Y_SIZE;
	private int[] pixels;
	
	//<-------------------Actors------------------->>
	public static SpriteSheets player = new SpriteSheets("/actors/player1.png", 192, 240);
	public static SpriteSheets waterBalloon = new SpriteSheets("/actors/waterballoon_enemy.png", 256, 32);
	public static SpriteSheets waterBottlePack = new SpriteSheets("/actors/waterbottle_pack.png", 600, 96);
	public static SpriteSheets waterBottleSingle = new SpriteSheets("/actors/waterbottle_single.png", 192, 64);
	public static SpriteSheets waterGunMech = new SpriteSheets("/actors/watergun_mech.png", 408, 112);
	public static SpriteSheets explodingWaterBottle = new SpriteSheets("/actors/explosiveWatBotSing.png", 192, 192);
	//<<------------Projectiles/Particles---------->>
	public static SpriteSheets enemyBullet = new SpriteSheets("/projectiles/enemyBullet.png", 16, 16);
	public static SpriteSheets mainBullet = new SpriteSheets("/projectiles/bullet.png", 16, 16);
	public static SpriteSheets shotgunBullet = new SpriteSheets("/projectiles/shotgun_bullet.png", 192, 16);
	public static SpriteSheets watergunMechBullet = new SpriteSheets("/projectiles/mechBullet.png", 160, 16);
	public static SpriteSheets bulletImpact = new SpriteSheets("/projectiles/bullet_impact.png", 128, 16);
	public static SpriteSheets missle = new SpriteSheets("/projectiles/missle.png", 64, 160);
	public static SpriteSheets smokeTrail = new SpriteSheets("/projectiles/missle_smoke_trail.png", 416, 32);
	public static SpriteSheets mainExplosion = new SpriteSheets("/projectiles/main_explosion.png", 1088, 64);
	public static SpriteSheets missleAmmo = new SpriteSheets("/projectiles/missleIcon.png", 256, 32);
	//<<------------------Stage--------------------->>
	public static SpriteSheets mainStage = new SpriteSheets("/bg/stage_test.png", 1600, 913);
	public static SpriteSheets mainBg = new SpriteSheets("/bg/bg.png", 1600, 963);
	public static SpriteSheets clouds = new SpriteSheets("/bg/clouds.png", 1600, 963);
	//<<------------------Font--------------------->>
	public static SpriteSheets titleFont = new SpriteSheets("/font/main_title.png", 1152, 648);
	
	public SpriteSheets(String path, int xSize, int ySize) {
		this.path = path;
		this.X_SIZE = xSize;
		this.Y_SIZE = ySize;
		pixels = new int[X_SIZE * Y_SIZE];
		load();
	}
	
	/**
	 * Translates the Sprite Sheet image at the given path into a pixels array.
	 */
	private void load() {
		try {
			BufferedImage image = ImageIO.read(SpriteSheets.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns SpriteSheets pixel array to the caller
	 * @return int[] pixels
	 */
	public int[] getPixels() {
		return pixels;
	}
	
	/**
	 * Returns the SpriteSheets X_SIZE to the caller
	 * @return int X_SIZE
	 */
	public int getXSheetSize() {
		return X_SIZE;
	}
	
	/**
	 * Returns the SpriteSheets Y_SIZE to the caller
	 * @return int Y_SIZE
	 */
	public int getYSheetSize() {
		return Y_SIZE;
	}
	
	public int getSpriteSheetsPixels(int i) {
		return pixels[i];
	}
}
