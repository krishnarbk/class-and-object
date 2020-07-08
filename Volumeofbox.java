public class Volumeofbox {
	private int width;
	private int height;
	private int depth;

	public Volumeofbox(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getDepth() {
		return depth;
	}


	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getVolume(){
		return  width*depth*height;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volumeofbox v=new Volumeofbox(1,2,3);
		System.out.println(v.getVolume());
	}

}