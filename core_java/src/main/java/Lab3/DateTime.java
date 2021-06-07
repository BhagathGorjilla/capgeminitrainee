package Lab3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateTime {

	public static void main(String[] args) {

            LocalDate previousdate=LocalDate.of(1998,Month.NOVEMBER,22);
            LocalDate currentdate=LocalDate.now();
               
            Period duration = previousdate.until(currentdate);
            System.out.print(duration.getYears()+" Years   ");
            System.out.print(duration.getMonths()+" Months  ");
            System.out.print(duration.getDays()+" days ");
           
           
            
            

	}	

}