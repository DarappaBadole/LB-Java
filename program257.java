//multiplication of  factors 
import java.util.*;

class Digits
{

    public boolean CheckArmstrong(int iNo)
    {
        int iDigitCount=0;
        int iTemp=iNo;
        int iDigit=0;
        int iCnt=0,iPower=1;
        int iSum=0;


        while(iTemp!=0) //logic of number of digits
        {
            iDigitCount++;
            iTemp=iTemp/10;
        }
        iTemp=iNo;

        while(iTemp!=0)
        {
            iDigit=iTemp%10;

            for(iCnt=1; iCnt<=iDigitCount; iCnt++)///  logic of power
            {
                iPower=iPower*iDigit;

            }
            iSum=iSum+iPower;
            iPower=1;               // ******************

            iTemp=iTemp/10;


        }
        if(iNo==iSum)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}


class program257
{

 public static void main(String arr[])
 {
   Scanner sobj = new Scanner(System.in);

   System.out.println("Please Enter Number:");
   int iNo = sobj.nextInt();

   

   Digits dobj = new Digits();

   boolean bRet = dobj.CheckArmstrong(iNo);

   if(bRet==true)
   {
    System.out.println(iNo+ " is a armstrong number");
   }

   else 
   {
     System.out.println(iNo+ "is not a armstrong number");
   }
   

  



 }


}