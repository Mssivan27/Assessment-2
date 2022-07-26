package com.prodapt.OOPbasics;

public class TesterEmployee1 { 
	public static void main(String[] args)
	{
			Employee1 emp1=new Employee1("SANTHOSH SIVAN",21,"Software developer");
			Employee1 emp2=new Employee1("jeison",20,"Software developer");
			Employee1 emp3=new Employee1("gowthams",21,"Software developer");
			Employee1 emp4=new Employee1("yogesh",18,"Software developer");
			Employee1 emp5=new Employee1("seethu",21,"Software developer");
			
			HrManager e1=new HrManager();
			e1.processRecords(emp1.name,emp1.age,emp1.designation);
			e1.processRecords(emp2.name,emp2.age,emp2.designation);
			e1.processRecords(emp3.name,emp3.age,emp3.designation);
			e1.processRecords(emp4.name,emp4.age,emp4.designation);
			e1.processRecords(emp5.name,emp5.age,emp5.designation);
           
	}

}
