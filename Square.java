
public class Square{
	private String name;
	private Rectangle rectangle;
	
	public Square()
	{
		this("NoNameSquare",3,new Point("corner",0,0));
	}
	
	public Square(String name) 
	{
		this(name,3,new Point("corner",0,0));
	}
	
	public Square(String name,int side)
	{
		this(name,side,new Point("corner",0,0));
	}
	
	public Square(String name,int side,Point corner)
	{
		this.name = name;
		this.rectangle = new Rectangle(name,side,side,corner);
	}
	
	public Square(Square s)
	{
		this.name = s.name;
		rectangle = new Rectangle(s.getRectangle());
	}
	
	public double getArea()
	{
		return rectangle.getArea();
	}
	
	public double getPerimeter()
	{
		return rectangle.getPerimeter();
	}

	public int compareTo(Object arg0) 
	{
		return rectangle.compareTo(arg0);
	}
	
	public double getDistance(Object other)
	{
		if(!(other instanceof Square)) throw new InvalidDistanceComputationException("Square", other.getClass().toString());
		else
		{
			Square r = (Square)other;
			return rectangle.getCorner().getDistance(r.getCorner());
		}
	}
	
	public boolean equals(Object other)
	{
		if(!(other instanceof Square)) throw new InvalidComparisonException("Square", other.getClass().toString());
		else
		{
			Square r = (Square)other;
			return rectangle.getCorner() == r.getCorner() && rectangle.getLength() == r.getLength() && r.getWidth() == r.getWidth();
			
		}
	}
	
	public String toString()
	{
		return "Square: " + rectangle.getName() + ", Side: " + rectangle.getLength();
	}
	
	public void scale(int scaleFactor)
	{
		rectangle.scale(scaleFactor);
		
	}
	
	public Point getCorner()
	{
		return rectangle.getCorner();
	}
	
	public int getLength()
	{
		return rectangle.getLength();
	}
	
	public int getWidth()
	{
		return rectangle.getWidth();
	}
	
	public String getName()
	{
		return name;
	}
	
	public Rectangle getRectangle()
	{
		return rectangle;
	}
}
