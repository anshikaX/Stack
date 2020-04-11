import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();

        StackArray obj = new StackArray(n);

        char ch;
        do {
            System.out.println("\nStack Operations:");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Check empty");
            System.out.println("5.Check full");
            System.out.println("6.Get Size");

            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter an element to push");
                    int value = sc.nextInt();
                    try
                    {
                        obj.push(value);
                    } catch (Exception e)
                    {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    try
                    {
                        System.out.println("Popped Element = " + obj.pop());

                    } catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 3:
                    try
                    {
                        System.out.println("Peek Element = " + obj.peek());
                    } catch (Exception e)
                    {

                        System.out.println("Error : " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Empty status = " + obj.isEmpty());
                    break;

                case 5:
                    System.out.println("Full status = " + obj.isFull());
                    break;

                case 6:
                    System.out.println("Size = " + obj.getSize());
                    break;

                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
                //To display Stack
                obj.display();

                System.out.println("\nDo you want to continue (Type y or n) \n");

                ch = sc.next().charAt(0);

            }
            while (ch == 'Y' || ch == 'y') ;
        }


    }

