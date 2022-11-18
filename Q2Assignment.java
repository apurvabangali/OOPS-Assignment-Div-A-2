import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.time.*;
import java.time.DayOfWeek;
import java.io.*;
import java.util.Scanner;

public class Q2Assignment {

    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    float time = 9;
	int kms=0;
	int val=0;
	int num;
    int month = 0;
    int day = 0;
	
	
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        System.out.println("*************");
        System.out.println("");
        System.out.println("Developed by Apurva Bangali 1132220036");
        System.out.println("OODP101 Object Oriented Design and programming");
        System.out.println(formatter.format(date));
        System.out.println("");
        System.out.println("*************");


        // Requriment -2//
        do {
            System.out.println("--Please Enter number between 1 to 6 for different operations--");
            num = sc.nextInt();

            switch(num) {
                case 1:  System.out.println(" ----Here we performing  user  Details----");
                    System.out.println("Enter Your name");
                    String name = sc.next();

                    System.out.println("Enter Your approximate kilometers of travel");
                     kms = sc.nextInt();

                    System.out.println("Month of travel");
                    month = sc.nextInt();

                    System.out.println("on which date of this month, you wish to travel!!");
                    day = sc.nextInt();

                    System.out.println("Now enter the time of travel using 24 hour clock just like 9.00 for 9am, 13.00 for 1pm");
                    time = sc.nextFloat();
                    break;


                case 2:  System.out.println (" ------Here we performing  Display Charges under company 1-----");
                    LocalDate localDate = LocalDate.of(2022,month,day);
                    
                    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
			System.out.println("day when you are travel is: " + day +" " + "Month of travel is: " + month +" " + "day is: " + dayOfWeek.name());

                      val = dayOfWeek.getValue();

                    System.out.println("Int Value of "  + dayOfWeek.name()   + " - " + val);
	
			if((time>=7 && time<=9) || (time>=16 && time <=18))
			{
					System.out.println("extra charges will applied accordingly beacuse time is between 7.00 AM - 9.00 AM and 16.00PM to 18.00PM ");
					double Total_charges = 5.50 + 2.50 + 0.75*kms;
					System.out.println("Total charges are: " + Total_charges+"$");
				

					}			
					
			else if(val==6 || val==7)
				{
					System.out.println("extra charges will applied accordingly because this is weekend time");
					double Total_charges = 5.50 + 3.00 + 0.75*kms;
					System.out.println("Total charges are: " + Total_charges+"$");
						
					}

						
				else
				{
					System.out.println("Not Extra Charges will added");
					double Total_charges = 5.50 + 0.75*kms;
					System.out.println("Total charges are: " + Total_charges+"$");

				}

                    break;

                case 3:  System.out.println (" -------Here we performing Display Charges under company 2-----");
				
				LocalDate localDatee = LocalDate.of(2022,month,day);
                    
                    DayOfWeek dayOfWeeke = DayOfWeek.from(localDatee);
			System.out.println("day when you are travel is: " + day +" " + "Month of travel is: " + month +" " + "day is: " + dayOfWeeke.name());

                      val = dayOfWeeke.getValue();

                    System.out.println("Int Value of "  + dayOfWeeke.name()   + " - " + val);
	
				if((time>=7 && time<=9) || (time>=16 && time <=18))
				{
					System.out.println("extra charges will applied accordingly beacuse time is between 7.00 AM - 9.00 AM and 16.00PM to 18.00PM ");
					double Total_charges = 4.50 + 2.00 + 0.85*kms;
					System.out.println("Total charges are: " + Total_charges+"$");
				

					}			
					
			else if(val==6 || val==7)
				{
					System.out.println("extra charges will applied accordingly because this is weekend time");
					double Total_charges = 4.50 + 2.50 + 0.85*kms;
					System.out.println("Total charges are: " + Total_charges+"$");
						
					}

						
				else
				{
					System.out.println("Not Extra Charges will added");
					double Total_charges = 4.50 + 0.85*kms;
					System.out.println("Total charges are: " + Total_charges+"$");

				}

                    break;

                case 4: System.out.println ("----- Here we performing  Display Charges under company 3----");

					LocalDate localDateee = LocalDate.of(2022,month,day);
                    
                    DayOfWeek dayOfWeekee = DayOfWeek.from(localDateee);
			System.out.println("day when you are travel is: " + day +" " + "Month of travel is: " + month +" " + "day is: " + dayOfWeekee.name());

                      val = dayOfWeekee.getValue();

                    System.out.println("Int Value of "  + dayOfWeekee.name()   + " - " + val);
	
				if((time>=7 && time<=9) || (time>=16 && time <=18))
				{
					System.out.println("extra charges will applied accordingly beacuse time is between 7.00 AM - 9.00 AM and 16.00PM to 18.00PM ");
					double Total_charges = 1.00 + 3.00 + 0.85*kms;
					System.out.println("Total charges are: " + Total_charges+"$");
				

					}			
					
			else if(val==6 || val==7)
				{
					System.out.println("extra charges will applied accordingly because this is weekend time");
					double Total_charges = 5.50 + 1.50 + 0.85*kms;
					System.out.println("Total charges are: " + Total_charges+"$");
						
					}

						
				else
				{
					System.out.println("Not Extra Charges will added");
					double Total_charges = 5.50 + 0.85*kms;
					System.out.println("Total charges are: " + Total_charges+"$");

				}

                    break;

                case 5: System.out.println("---- Here we performing  Show Report----");
				System.out.println("Expensive Company is: Company 1");
				System.out.println("Cheapest Company is: Company 3");


                    break;

                case 6: System.out.println ("--Exit System--");
					name = null;
					kms =0;
					month=0;
					day=0;
					time=0;
			System.out.println("Thankyou for using our system");
			System.out.println("All user details have been set null or 0");
			System.out.println("Good Bye....");
	
                    break;	
                default:
                case 7: System.out.println("You have entered invalid value!! please enter valid value");
            }
        }
	 while(num!=8);


    }
}