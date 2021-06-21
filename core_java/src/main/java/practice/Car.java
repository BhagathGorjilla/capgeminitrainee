package practice;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private String model;
	private String Company;
	private float Price;
	
	public Car() {}
	
	public Car(String model, String Company , float Price){
		super();
		this.model=model;
		this.Company=Company;
		this.Price=Price;
	}
	
	public String getmodel() {
		return model;
	}
	
	public String getCompany() {
		return Company;
	}
	
	public float getPrice() {
		return Price;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", Company=" + Company + ", Price=" + Price
				+ "]";
	}
	
	public static class cardemo  {
		ArrayList<Car> carList = new ArrayList<Car>();
				
		public List<String> uniqueCompany(){
			
			List<String> uniqueList = new ArrayList<String>();
			for(int i = 0;i<carList.size();i++)
			{
				if(!(uniqueList.contains(carList.get(i).getCompany())))
						{
				uniqueList.add(carList.get(i).getCompany());
						}	
			}
			return uniqueList;

		}
		
		public float averageByCompany(String company) {
			float sum = 0;
			int count = 0;
			float finalResult = 0.0f;
			
			for(int i = 0;i<carList.size();i++)
			{
				if(carList.get(i).getCompany() == company)
				{
					sum = sum + carList.get(i).getPrice();
					count++;
				}
	
			finalResult = sum/count;
			}			
			return finalResult;	
		}	
		}
	
	public static void main(String[] args) { 
		
		cardemo obj = new cardemo();
		
		obj.carList.add(new Car("Swift Dzire","Maruti",200000.0F));
		obj.carList.add(new Car("Swift","Maruti",180000.0F));
		obj.carList.add(new Car("Xuv500","Mahindra",1000000.0F));
		
		System.out.println(obj.uniqueCompany());
		System.out.println(obj.averageByCompany("Maruti"));
		
		
	}


}