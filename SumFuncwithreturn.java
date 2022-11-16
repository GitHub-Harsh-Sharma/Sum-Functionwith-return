import java.io.*;
class SumFuncwithreturn
{
    public void input() throws IOException
    {
    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number1:");
        int num1=Integer.parseInt(br.readLine());
        System.out.print("Enter number2:");
        int num2=Integer.parseInt(br.readLine());
        int add=sum(num1,num2);
        System.out.println("Sum="+add);
    }
    public int sum(int num1,int num2)
    {
        int add=num1+num2;
        return(add);
    }
    public static void main(String[] args)throws IOException
    {
        SumFuncwitharg sf=new SumFuncwitharg();
        sf.input();
    }
}