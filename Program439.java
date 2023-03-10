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
    Arr[] = new int[Size];

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
        Arr[i] = sobj.nextInt();
    }
    

  }

  public void InsertionSort()
  {


  }
  
  public void SelectionSort()
  {


  }
  public void BubbleSort()
  {


  }
  
  

}
class Program439
{
    public static void main(String a[])
    {
       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the size of array :");

       int iSize = sobj.nextInt();






















    }
}