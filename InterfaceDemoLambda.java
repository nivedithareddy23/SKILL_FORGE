interface Drawable
{
void draw();
}
class InterfaceDemoLambda
{
public static void main(String[] args)
{
Drawable i=()->System.out.println("Square");
i.draw();
}
}