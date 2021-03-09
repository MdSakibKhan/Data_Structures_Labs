public class Square{
  double m=0.0;
  double n=0.0;
  public void setHeight(int a){
    m=a;
  }
  public void setWidth(int b){
    n=b;
  }
  public double getHeight(){
    return m;
  }
  public double getWidth(){
    return n;
  }
  public double getArea(){
    return m*n;
  }

}