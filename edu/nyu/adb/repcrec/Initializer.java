package edu.nyu.adb.repcrec;
import java.io.*;
import java.util.ArrayList;
/*
 * Types of commands to handle:
 * begin(T1)
 * beginRO(T1)
 * R(T1,x4)
 * W(T1,x6,v)
 * dump()
 * dump(i)
 * dump(xj)
 * end(T1)
 * fail(6)
 * recover(7)
 */
public class Initializer 
{
	public static void main(String args[])
	{
		Initializer initializer=new Initializer();
		String fileName=args[0];
		try
		{
			//			System.out.println(fileName);
			initializer.readFromFile(fileName);
		}
		catch(Exception e)
		{
			print("File Read Exception");
		}
	}
	public void readFromFile(String fileName) throws FileNotFoundException
	{
		FileInputStream fr=new FileInputStream(fileName);
		DataInputStream in = new DataInputStream(fr);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		try 
		{
			while((strLine=br.readLine())!=null)
			{
				//				System.out.println(strLine);
				String[] splitInput=strLine.split(";");
				for(String thisPart:splitInput)
				{
					String[] splitCommand=thisPart.split("\\(");
					splitCommand[1]=splitCommand[1].substring(0,splitCommand[1].length()-1);		
					processInput(splitCommand[0],splitCommand[1]);
				}
			}
		} 
		catch (IOException e) 
		{
			print("Error in reading Line");
		}
	}
	private void processInput(String command,String params) 
	{
		switch(command)
		{
		case "begin":
			print("Found begin with "+params);
			break;
		case "beginRO":
			print("Found beginRO with "+params);
			break;
		case "R":
			print("Found R with "+params);
			break;
		case "W":
			print("Found W with "+params);
			break;
		case "dump":
			print("Found dump with "+params);
			break;
		case "end":
			print("Found end with "+params);
			break;
		case "fail":
			print("Found fail with "+params);
			break;
		case "recover":
			print("Found recover with "+params);
			break;
		default:
			print("Invalid command");
			break;
		}
	}
	public static <T> void print(T print)
	{
		System.out.println(print);
	}
}
