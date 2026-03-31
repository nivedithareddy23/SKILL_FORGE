@FunctionalInterface
interface Add
{
int operation(int a,int b);
}
public class FunctExLambda
{
public static void main(String[] args)
{
    Add i=(a,b)->a+b;
    Add i2=(a,b)->a*b;
    Add i3=(a,b)->a/b;
    System.out.println(i.operation(10,20));
    System.out.println(i2.operation(10,20));
    System.out.println(i3.operation(10,20)); 
}
}