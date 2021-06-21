package practice;

import java.util.ArrayList;
import java.util.List;

public class cardemo  {
	
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
		}
		if(sum != 0)
		{
		finalResult = sum/count;
		}
		
		
		return finalResult;
		
	}
		
	}