

public abstract class Shape {


private Color color;

/*Construtor padrão*/

public Shape(){

}

public Shape (Color color){

this.color = color;

}



public Color getColor(){

return color;

}


public void setColor(Color color){

this.color = color;

}


/*Padrão para forçar o Programador utilizar esse metodo em outra class*/

public abstract double Area();


}
