public class CalculateSquare{
  
  public static void main(String args[]){
    double squareofNumber = square(9);
    double cubeofNumber = cube(9);
    
    System.out.println(squareofNumber);
    System.out.println(cubeofNumber);
    
    
  }
  
  public Double square(Integer num){
    return (Math.pow(num,2));
 }
  
    public Double cube(Integer num){
    return (Math.pow(num,3));
 }
  
}
