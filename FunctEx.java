@FunctionalInterface
interface Add
{
int add(int a,int b);
}
public class FunctEx
{
public static void main(String[] args)
{
    Add i=new Add(){
        @Override
        public int add(int a, int b) {
            return a+b;
        }
    };
        System.out.println(i.add(10,20));
}
}