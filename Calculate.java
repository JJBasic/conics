import java.util.*;

public class Calculate {

  private double radius;
  private double[] cords = new double[2];
  private char xsign;
  private char ysign;
  
  public Calculate(){
    
  }
  

  public String circle()
  {
    if(cords[0] < 0) xsign = '+';
    else xsign = '-';

    if(cords[1] < 0) ysign = '+';
    else ysign = '-';

    cords[1] = Math.abs(cords[1]);
    cords[0] = Math.abs(cords[0]);
    return "(x" + xsign + cords[0] + ")^2 + (y" + ysign + cords[1] + ")^2 = " + Math.pow(radius, 2);
  }

  public void setX(double num){
    cords[0] = num;
  }

  public void setY(double num) {
    cords[1] = num;
  }

  public void setRadius(double num) {
    radius = num;
  }

  
}