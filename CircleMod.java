public class CircleMod {
    private double a = 1;
    private double b = 1;
    private double d = 1;
    private double e = 1;
    private double f = 1;

  public CircleMod() {

  }

public String solve()
  {
     double h;
     double k;
     double r;

    h = (d/a)/2.0;
    k = (e/b)/2.0;
    r = Math.pow(d, 2) + Math.pow(e, 2) - f;
    
    String outString = "" + a + "(x + " + h + ")^2 + " + b + "(y + " + k + ")^2 = " + r;

    return outString;
  }

  public void setA(double aIn) {
    a = aIn;
  }

  public void setB(double in) {
    b = in;
  }

  public void setD(double in) {
    d = in;
  }

  public void setE(double in) {
    e = in;
  }

  public void setF(double in) {
    f = in;
  }
}
