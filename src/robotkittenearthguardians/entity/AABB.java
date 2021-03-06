package robotkittenearthguardians.entity;

import robotkittenearthguardians.util.Vector2F;

public class AABB extends Entity{

	protected Vector2F bbPosition, size;
	
	/**
	 * AABB constructor that creates a bounding box.
	 * @param width width of mob
	 * @param height height of mob
	 */
	public AABB(Vector2F position, Vector2F size) {
		this.size = new Vector2F(size);
		bbPosition = new Vector2F();
		
		bbPosition.setXVector(position.getXVector() + size.getXVector());
		bbPosition.setYVector(position.getYVector() + size.getYVector());
	}
	
	/**
	 * Updates the AABB with the position of the object is is bounding.
	 * @param position objects positon Vector
	 */
	public void update(final Vector2F position) {
		bbPosition.setXVector(position.getXVector() + size.getXVector());
		bbPosition.setYVector(position.getYVector() + size.getYVector());
	}
}
