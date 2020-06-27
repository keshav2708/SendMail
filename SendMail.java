import java.io.*;
import java.util.*;
public class SendMail
{
    public static void sendmail(String s[],int size)//sendmail function is invoked
    {
        System.out.println("The emails are sorted in alphabetical order::");
        for(int i=0;i<size;i++)
        {
        System.out.println("\t"+s[i]);
        }
    }
    public static void main(String args[])
    {
        int n;
        System.out.println("enter the number of email addresses");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        String email[]=new String[n];
        System.out.println("Enter the email addresses::");
        for(int i=0;i<n;i++)
        {
            email[i]=s.next();
        }
        String temp=null;
        System.out.println("The email address before sorting::");
        for(int i=0;i<n;i++)
        {
          System.out.println("\t"+email[i]);  
        }//swaping is done
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(email[i].compareTo(email[j])>0)
                {
                    temp=email[i];
                    email[i]=email[j];
                    email[j]=temp;

                }
            }
        }
        sendmail(email,n); //user defined function
        s.close();
    }
}