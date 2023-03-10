import java.util.*;

class MarvellousX
 { 
    public int DigitCpunt(String s)
  {
    int iCnt=0;

    for (int i=0;i < s.length(); i++)
    {
        if((s.charAt(i)>='0')&&(s.charAt(i)<='9'))
        {
            iCnt++;
        }
    }
    return iCnt;

 }


}

class Program273
{
    public static void main(String ar[])
    {
      Scanner sobj = new Scanner(System.in);

      System.out.println("please enter string :");
      String str = sobj.nextLine();

      MarvellousX obj = new MarvellousX();
     int iRet =  obj.DigitCpunt(str);
     System.out.println("Number of Digits  are:"+iRet);

    }
}