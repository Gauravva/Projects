package com.jspiders.car_dekho_case_study.menu;
import com.jspiders.car_dekho_case_study.operation.CarDekhOperation;
import java.util.Scanner;
public class CarMenu {

	public static void main(String[] args) 
	{
		CarDekhOperation operation=new CarDekhOperation ();
		Scanner s=new Scanner(System.in);
		boolean exit=true;
		System.out.println("Enter Your Choice");
		while(exit) 
		{
			System.out.println("*************MENU**************");
			System.out.println(" 1.Add Car Details\n 2.Search Car Details\n 3.Update Car Details\n 4.Delete car Details\n 5.Car Details\n 6.Exit");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:
			{
				operation.addCar();
			}
			break;
			case 2:
			{
				operation.searchCar();
			}
			break;
			case 3:
			{
				operation.updateCar();
			}
			break;
			case 4:
			{
				operation.deleteCar();
			}
			break;
			case 5:
			{
				operation.details();
			}
			break;
			case 6:
			{
				exit=false;
				System.out.println("Thank You!!");
			}
			break;
			default:
			{
				System.out.println("Invalid Input");
			}
			
		  }
		}
	}
}
			
			
		
		
	



