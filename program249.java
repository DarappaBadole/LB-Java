import java.util.*;

class Arithmatic
{ 
  public int iValue1;       //  Characteristics
  public int iValue2;       // characteristics

  public Arithmatic(int i,int j)      // parameterised constru
  {
    iValue1=i;
    iValue2=j;
  }

  public int Addition() //behaviour
 {
    int Sum=0;
    Sum=iValue1+iValue2;

    return Sum;
 }

}

class program249
{
 
 
 public static void main(String arr[])
 {
  
  Scanner sobj = new Scanner(System.in);
  
  System.out.println("Enter First Number:");
  int iNo1= 0 , iNo2=0 , iAns=0;

  iNo1 =sobj.nextInt();

  System.out.println("Enter second Number:");
  iNo2 =sobj.nextInt();

  Arithmatic aobj=new Arithmatic(iNo1,iNo2);

  iAns=aobj.Addition();
  


  System.out.println("Addition is"+iAns);


 }

}