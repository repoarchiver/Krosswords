package littlelui.krosswords.model;

public class Word {
	public static final int DIRECTION_HORIZONTAL = 0;
	public static final int DIRECTION_VERTICAL = 1;
	
	private int x;
	private int y;
	private int length;
	private int direction;
	
	private String key;
	private String hint;
	
	private String solution="";
	
	public Word(int x, int y, int length, int direction, int key, String hint) {
		this(x, y, length, direction, ""+key, hint);
	}

	public Word(int x, int y, int length, int direction, String key, String hint) {
		super();
		this.x = x;
		this.y = y;
		this.length = length;
		
		if (direction != DIRECTION_HORIZONTAL && direction != DIRECTION_VERTICAL)
			throw new IllegalArgumentException("Direction has to be either horizontal or vertical.");
		
		this.direction = direction;
		this.key = key;
		this.hint = hint;
	}

	public static int getDirectionHorizontal() {
		return DIRECTION_HORIZONTAL;
	}

	public static int getDirectionVertical() {
		return DIRECTION_VERTICAL;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getLength() {
		return length;
	}

	public int getDirection() {
		return direction;
	}

	public String getKey() {
		return key;
	}

	public String getHint() {
		return hint;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution.toUpperCase();
	}
	
	
	
	

}
