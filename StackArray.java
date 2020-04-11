import java.util.NoSuchElementException;

public class StackArray
{
    int arr[];
    int topOfStack;
    int size;
    int length;

    StackArray(int n)
    {
        this.size=n;
        length=0;
        arr = new int[size];
        topOfStack=-1;
    }

    //To check if Stack is empty or not
    public boolean isEmpty()
    {
        if(topOfStack==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //To check if the Stack if full or not
    public boolean isFull()
    {
        if(topOfStack==size-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //To get the size of the Stack
    public int getSize()
    {
        return length;
    }

    //To check the top element of the Stack
    public int peek()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("Underflow Exception");
        }
        else
        {
            return arr[topOfStack];
        }
    }

    //To add an element in the Stack
    public void push(int value)
    {
        if(topOfStack+1 >= size)
        {
            throw new IndexOutOfBoundsException("Overflow Exception");
        }
        if(topOfStack+1 < size)
        {
            arr[++topOfStack]=value;
        }
        length++;
    }

    //To delete an element from the Stack
    public int pop()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("Underflow Exception");
        }
        length--;
        return arr[topOfStack--];
    }

    //To display the Stack
    public void display()
    {
        if(length==0)
        {
            System.out.println("Empty Stac");
        }
        else
        {
            for(int i=topOfStack;i>=0;i--)
            {
                System.out.println(arr[i]);
            }
            System.out.println();
        }
    }


}
