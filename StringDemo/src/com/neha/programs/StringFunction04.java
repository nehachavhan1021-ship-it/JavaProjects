package com.neha.programs;

public class StringFunction04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line="I Like Cricket";
		String res=line.replace("Cricket", "Football");
		System.out.println(res);
		
		String ps="neha123";
		System.out.println(ps.replaceAll("[0-9]", "x"));
		
		String name="maithili";
		System.out.println(name.replaceAll("[a-z]","ne"));
		
		System.out.println("--------------");
		
		String info="Neha,19,cse,BE,01-06-2006";
		String[] split=info.split(",");
		for(String data:split)
			System.out.println(data);
		
		String blank="   ";
		System.out.println(blank.isBlank());
		
		System.out.println(blank.isEmpty());
		
		
		String city="";
		System.out.println(city.equals("berlin"));
		
		System.out.println("Neha".concat(" Chavhan"));
		
	int code=1234567;
	System.out.println(String.valueOf(code).substring(0,3));
	String n="233444433";
	System.out.println(Integer.parseInt(n)+12);
	//Float.parseFloat()
			//Double.parseDouble()
	String id ="name122 ";
	System.out.println(id.repeat(2));
		
			
		

	}

}
