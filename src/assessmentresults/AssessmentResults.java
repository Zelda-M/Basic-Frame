package assessmentresults;

import java.util.Scanner;

public class AssessmentResults {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        //Declarations
        double mark=0;
        int total=80;
        
        System.out.println("Enter the test mark: ");
        mark = scan.nextDouble();

       while (!(mark ==-1))
       {
            System.out.println("Enter the test mark: ");
            mark = scan.nextDouble();
       }
       
         boolean isValid = validateMarks (mark , total);
         int percentage = 0;
        String Status ="";
         if(isValid == true)
         {
            percentage = calaculatePercentage (mark,  total);
           Status = determineResults ( percentage);
           displayValues (percentage , Status);
         }
        
    }
    public static boolean validateMarks (double mark , int total)
    {
        total =80;
        boolean isValid = false;
        
        if((mark >0 && mark<=total))
        {
            isValid = true;
        }else
        {
            isValid = false;
        }
        return isValid;
    }
    
    public static int calaculatePercentage (double mark, int total)
    {
        total = 80;
        int percentage = (int)((mark / total) * 100);
        
        return percentage;
    }
    public static String determineResults (int percentage)
    {
        String Status="";
        
        if(percentage >= 50 && percentage <=100)
        {
            Status = "Pass";
        }else
            if(percentage < 0 && percentage>100)
            {
                Status = "Fail";
            }
        return Status;
    }
    public static void displayValues (int percentage , String Status)
    {
        System.out.println("Your percentage mark is: " + percentage);
        System.out.println("Results " + Status);
    }
    
}
