import java.util.*;

class ArrayX
{
  protected int Arr[];

  public ArrayX(int iSize)
  {
     Arr = new int[iSize];

  }

  protected void Accept()
  {
     Scanner sobj = new Scanner(System.in);

     System.out.println("Please Enter:"+Arr.length + " Elements");
     for(int iCnt=0;iCnt<Arr.length;iCnt++)
     {
         System.out.println("Enter the element no:"+(iCnt+1));
         Arr[iCnt]=sobj.nextInt();
     }
     
  }

  protected void Display()
  {
     System.out.println("Elements of array are:");

     for(int iCnt=0;iCnt<Arr.length;iCnt++)
     {
        System.out.println(Arr[iCnt]+"\t");

     }
     System.out.println();
  }


}

class MarvellousX extends ArrayX
{
  public MarvellousX(int iSize)
  {
    super(iSize);

  }
  
  public boolean Checkpallindrome()
  {
   int iStart =0;
   int iEnd=Arr.length-1;
   boolean bFlag=true;

   while(iStart < iEnd)
   {
    if(Arr[iStart] != Arr[iEnd])
    {
        bFlag=false;
        break;

    }
    iStart++;
    iEnd--;

   }
   return bFlag;



  }
 

}

class Program266
{
    public static void main(String arr[])
    {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the size of array that you want to create ");
      int iSize = sobj.nextInt();

      MarvellousX obj =new MarvellousX(iSize);

      obj.Accept();
      obj.Display();

      boolean bRet=obj.Checkpallindrome();
      if(bRet==true)
      {
        System.out.println("Array is a pallindrome");

      }

      else 
      {
        System.out.println("Array is not a pallindrome");
      }





    }
}