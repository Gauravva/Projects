package com.jspiders.car_dekho_case_study.operation;
import  com.jspiders.car_dekho_case_study.entity.Car;
import java.util.Scanner;
import java.util.ArrayList;
public class CarDekhOperation 
{
	 ArrayList<Car> list =new ArrayList<Car>();
	 Scanner s=new Scanner(System.in);
	 int j;
	 public void addCar() 
	 {
		//Scanner s=new Scanner(System.in);
		System.out.println("How many Car You want to add");
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			
			System.out.println("Enter Your CarID ");
			int cid=s.nextInt();
			System.out.println("Enter Your CarName");
			String cname=s.next();
			System.out.println("Enter Your Model");
			String model=s.next();
			System.out.println("Enter Your Brand");
			String brand=s.next();
			System.out.println("Enter Your Fuel_Type");
			String fuel_type=s.next();
			System.out.println("Enter Your Price");
			double price=s.nextDouble();
			Car c1=new Car(cid,cname,model,brand,fuel_type,price);
			list.add(c1);
			if(i<num)
			{
				System.out.println("Add Another Car");
			}
			j=i;
			
		}
		System.out.println("Your Car "+j+" is Added Successfully");
	   
		
	}
	public void searchCar()
	{
		//Scanner s2=new Scanner(System.in);
		System.out.println("Enter Your CarId Number ");
		int sid=s.nextInt();
		boolean found=false;
		for(Car car:list)
		{
			if(car.getCar_id()==sid) 
			{
				System.out.println("***Your Car Details***");
				System.out.println("==================================================================================");
				System.out.println("Car_Id\t"+"Car_Name\t"+"Car_Model\t"+"Car_Brand\t"+"Car_FuelType\t\t"+"Car_Price\t");
				System.out.println(car.getCar_id()+"\t"+car.getCarName()+"\t\t  "+car.getCModel()+"\t\t  "+car.getBrand()+"\t\t  "+car.getFuel_type()+"\t\t"+car.getPrice());
				
				found=true;
				break;
			}
			
		}
		if(!found) {
			System.out.println("Your Car is Not Found "+sid);
		}
		
		
	 
	}
	public void updateCar()
	{
		//Scanner s=new Scanner(System.in);
		boolean flag=false;
		System.out.println("Enter CarId Number which you want to Update");
		int searchid=s.nextInt();
		for(Car car:list) {
			if(car.getCar_id()==searchid)
			{
				System.out.println("Your Car is Found\n");
				System.out.println("  Enter Your Update Details!!!  ");
				System.out.println("================================");
				System.out.println("Enter Your CarID ");
				int cid=s.nextInt();
				System.out.println("Enter Your CarName");
				String cname=s.next();
				System.out.println("Enter Your Model");
				String model=s.next();
				System.out.println("Enter Your Brand");
				String brand=s.next();
				System.out.println("Enter Your Fuel_Type");
				String fuel_type=s.next();
				System.out.println("Enter Your Price");
				double price=s.nextDouble();
				car.setCar_id(cid);
				car.setCarName(cname);
				car.SetCModel(model);
				car.setBrand(brand);
				car.setFuel_type(fuel_type);
				car.setPrice(price);
				System.out.println("Your Car is Successfully Updated....");
				flag=true;
				break;
				
			}
			
		}
	
		if(!flag)
		{
			System.out.println("Your Car is not Found....");
			System.out.println("Please Add your car First...");
		}
		
	}
	public void deleteCar()
	{
		boolean flag=false;
		System.out.println("Enter Your CarID Number");
		int cid=s.nextInt();
		for (Car car:list)
		{     
		  
			if(car.getCar_id()==cid) 
			{
				list.remove(car);
				System.out.println("Your Car"+cid+"is Sucessfully Deleted");
				flag=true;
				break;
			}
			
			
		}
		if(!flag)
		{
			System.out.println("Your Car is Not Found / Invalid Input");
		}
		
	}
	
	public void details()
	{
		if(list.isEmpty()==false){
			
			System.out.println("***Your Car Details***");
			System.out.println("==================================================================================");
			System.out.println("Car_Id\t"+"Car_Name\t"+"Car_Model\t"+"Car_Brand\t"+"Car_FuelType\t\t"+"Car_Price\t");
			for(Car car:list) 
			{
			System.out.println(car.getCar_id()+"\t"+car.getCarName()+"\t\t  "+car.getCModel()+"\t\t  "+car.getBrand()+"\t\t  "+car.getFuel_type()+"\t\t"+car.getPrice());
			}
		}
		else {
			System.out.println("No car Found!!!! Please Add Car first then Check Details");
		}
	}
}

		