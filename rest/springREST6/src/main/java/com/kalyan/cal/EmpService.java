package com.kalyan.cal;
import java.lang.Math;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
//	@Autowired
//	private Calculator cal;
	
	public double add(int a,int b)
	{
		double c = a+b;
		return c;
	}
	
	public double sub(int a,int b)
	{
		double c = a-b;
		return c;
	}
	

	public double multi(int a,int b)
	{
		double c = a*b;
		return c;
	}

	public double divi(int a,int b)
	{
		double c = a/b;
		return c;
	}

	
	public double srt(int a)
	{
		double c =  Math.sqrt(a);
		return c;
	}
	

}
