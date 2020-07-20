	import java.lang.Math;	
	interface  Polygon {
		 void getArea();
		void getPerimeter();
		default void getSides(){
		System.out.println(" ");
		}
		}

		class Rectangle implements Polygon {
		   public void getArea() {
		      int length = 6;
		      int breadth = 5;
		      int area = length * breadth;
		      System.out.println("The area of the rectangle is "+area);
		   }
		public void getPerimeter() {
		      int length = 6;
		      int breadth = 5;
		      int perimeter =2*( length + breadth);
		      System.out.println("The perimeter of the rectangle is "+perimeter);
		}
		}

		class Square implements Polygon {
		   public void getArea() {
		      int length = 5;
		      int area = length * length;
		      System.out.println("The area of the square is "+area);
		   }
		public void getPerimeter() {
		      int length = 6;
		      int perimeter =4*(length);
		      System.out.println("The perimeter of the square is "+perimeter);
		
		}
		}

		class Polygons {
		   public static void main(String[] args) {
		      Rectangle r1 = new Rectangle();
		      r1.getArea();
		      r1.getSides();
			r1.getPerimeter();

		      Square s1 = new Square();
		      s1.getArea();
			s1.getPerimeter();
		   }
}
