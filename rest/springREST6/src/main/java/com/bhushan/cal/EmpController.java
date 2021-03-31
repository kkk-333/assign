package com.bhushan.cal;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@Autowired
	private EmpService empservice;
	
	@RequestMapping("/add/{a}/{b}")
	public double Add(@PathVariable int a,@PathVariable int b)
	{
		return empservice.add(a,b);
	}
	
	@RequestMapping("/sub/{a}/{b}")
	public double Sub(@PathVariable int a,@PathVariable int b)
	{
		return empservice.sub(a,b);
	}
	
	@RequestMapping("/multi/{a}/{b}")
	public double Multi(@PathVariable int a,@PathVariable int b)
	{
		return empservice.multi(a,b);
	}
	
	@RequestMapping("/srt/{a}")
	public double srt(@PathVariable int a)
	{
		return empservice.srt(a);
	}
	
}
