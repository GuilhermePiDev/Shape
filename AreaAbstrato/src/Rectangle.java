public class Rectangle extends Shape {
private double width;
private double height;

public Rectangle(){
}

public Rectangle(Color color, Double width, Double height){
super(color);
this.height = height;
this.width = width;
}

public double getWidth() {
return width;
}

public void setWidth(double width) {
this.width = width;
}

public double getHeight() {
return height;
}

public void setHeight(double height) {
this.height = height;
}

@Override
public double Area() {
return width * height;
}
}