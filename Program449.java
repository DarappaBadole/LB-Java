import java.util.*;

class Node
{
    public int Data;
    public Node Next;

    public Node(int No)
    {
        this.Data = No;
        this.Next = null;
    }
}

class SinglyLL
{
    private Node Head;
    public int Count;

    public SinglyLL()
    {
        Head  = null;
        Count = 0;

    }

    protected void finalize()
    {
      // free memory

    }

    public void InsertFirst(int No)
    {
        Node newn = new Node(No);

        if(this.Head == null)
        {
            this.Head = newn;
        }

        else
        {
            newn.Next = this.Head;
            this.Head = newn;
        }
        this.Count++;
    
    }

    public void Display()
    {
        Node temp = this.Head;

        while(temp !=null)
        {
            System.out.print(" | "+temp.Data+"|->");
            temp = temp.Next;
        }
        System.out.println("NULL");

    }

    public int CountNodes()
    {
        return this.Count;
    }

    public void InsertLast(int No)
    {
        Node newn = new Node(No);

        if(this.Head == null)
        {
            this.Head = newn;
        }

        else
        {
           Node temp = Head;
           while(temp.Next != null)
           {
            temp = temp.Next;

           }
           temp.Next = newn;
        }
        this.Count++;

    }

    public void DeleteFirst()
    {
        if(this.Count == 0)
        {
            return;
        }

        else if(this.Count == 1 )
        {
           this.Head = null;
           
        }
        else
        {
            Head = Head.Next;


        }

        this.Count--;

       
    }

     public void DeleteLast()
    {
        if(this.Count == 0)
        {
            return;
        }

        else if(this.Count == 1 )
        {
           this.Head = null;
           
        }
        else
        {
            Node temp = this.Head;
            
            while(temp.Next.Next!= null)
            {
                temp = temp.Next;

            }
            temp.Next = null;
            
        }

        this.Count--;

       
    }
}

class Program449
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        SinglyLL obj = new SinglyLL();
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);
      

        obj.InsertLast(101);
        obj.InsertLast(111);
         

        obj.DeleteFirst();
        obj.DeleteLast();
        obj.Display();


        int Ret = obj.CountNodes();

        System.out.println("Number of Nodes are :"+Ret);

        
        







    }
}