package gradesCalc;

import acm.program.*;

public class gradesCalc extends ConsoleProgram
{
	public void run()
	{
		println("Grades Calculations");
		int numStudents = readInt("How many students?");
		double[] grades = getGrades(numStudents);
		
		while (true)
		{
			String command = getCommand();
			if (command.equals("a"))
			{
				println("Average: " + getAverage(grades));
			}
			else if (getCommand() == "M")
			{
				println("Max: " + getAverage(grades));
			}
			else if (getCommand() == "-")
			{
				println("Min: " + getAverage(grades));
			}
			else if (getCommand() == "Q")
			{
				break;
			}
			else 
			{
				println("Invalid command");
			}
		}

		println("Goodbye :(");
	}
	
	public String getCommand()
	{
		println("What do you want to do?");
		return readLine("(A)verage, (M)ax, (-)Min, (Q)uit: ").toLowerCase().trim();
	}
	
	public double[] getGrades (int numStudents)
	{
		double[] grades = new double[numStudents];
		
		for (int i = 0; i < numStudents; i++)
		{
			grades[i] = readDouble("Student " + (i + 1) + ": ");
		}
		
		return grades;
	}
	
	public double getAverage (double[] items)
	{
		double average = 0.0;
		for (double item : items)
		{
			average += item;
		}
		return average/items.length;
	}
	
	public double getMax (double[] items)
	{
		double max = 0.0;
		for (double item : items)
		{
			 += item;
		}
		return average;
	}
	
	public double getMin (double[] items)
	{
		return 0;
	}
}
