/** AIM :WAP to create a calculator class to add two numbers
 * . Use constructor overloading to initialize the data with either
 * default values or user provided values. Use method
 *  overloading to add integer or double.
 NAME : REHAN AKHTAR ALI SHIAKH
 CLASS : COMPUTER A
 * 
 */
public class Calculator {
    int a;
    int b;
    Calculator(){
         a=0;
         b=0;

}
Calculator(int p,int q){
    a=p;
    b=q;
}

void add(int i,int j)
{
    int sum=i+j;
    System.out.println("add :"+sum);
}
void add(double i,double j)
{
    double sum=i+j;
    System.out.println("add :"+sum);
}

    
}
