public class LeftEngine extends Engine {

	public LeftEngine() {

	}
	
	public void move(Point point) {
		point.setX(point.getX() - 1);
	}
}