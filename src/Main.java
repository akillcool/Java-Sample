
public class Main
{
	public void myDraw(Shape s)
	{
		s.draw();
	}
	
	public static void main(String[] args)
	{
		Main main = new Main();
		main.myDraw(new Circle());
		main.myDraw(new Triangle());
		main.myDraw(new Square());
	}
}
