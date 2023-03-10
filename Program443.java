import java.util.*;

interface Marvellous
{
    public void BubbleSort();
    public void SelectionSort();
    public void InsertionSort();

}

class Sorting
{
  public int Arr[];

  public Sorting(int Size)
  {
    Arr = new int[Size];

  }

  public void Accept()
  {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter the elements :");
    for(int i =0 ;i < Arr.length ; i++)
    {
        Arr[i] = sobj.nextInt();
    }


  }

  public void Display()
  {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter the elements :");
    for(int i =0 ;i < Arr.length ; i++)
    {
       System.out.println(Arr[i]);
    }
    

  }

  public void InsertionSort()
  {


  }
  
  public void SelectionSort()
  {
        int i = 0, j =0 , Min_Index = 0 , temp = 0;

        for(i = 0 ; i < Arr.length-1 ; i++)
        {   
            Min_Index = i;
            for(j = i+1 ;j<Arr.length ; j++)
            {
                if(Arr[j] < Arr[Min_Index])
                {
                    Min_Index = j;

                }
            }

            temp = Arr[i];
            Arr[i] = Arr[Min_Index];
            Arr[Min_Index] = temp;
        }


  }
  public void BubbleSort()
  {
    int i = 0 , j = 0, temp =0;
    boolean flag = false;

    for(i=0 ; i<Arr.length ;i++)
    {   
        flag = false;
        for(j = 0 ; j<Arr.length-i-1 ;j++)
        {
            if(Arr[j] < Arr[j+1])
            {
                temp = Arr[j];
                Arr[j] = Arr[j+1];
                Arr[j+1] = temp;
                flag = true;

            }

        }
        if(flag == false)
        {
            break;
        }
    }


  }
  
  

}
class Program443
{
    public static void main(String a[])
    {
       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the size of array :");

       int iSize = sobj.nextInt();

       Sorting obj = new Sorting(iSize);
       obj.Accept();
       obj.Display();

       obj.SelectionSort();
        obj.Display();























    }
}