class SlidingDemo
{
public static void  main(String[] args)
{
String s="Neethu";
char[] arr=s.toCharArray();
for(int i=0;i<arr.length;i++)
{
for(int j=i;j<arr.length;i++)
{
for(int k=i;k<=j;k++)
{
System.out.println(arr[k]+" ");
}
System.out.println();
}
}
}
}