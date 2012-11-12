package edu.nyu.adb.repcrec;
import java.io.*;
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
			initializer.readFromFile(fileName);
		}
		catch(Exception e)
		{
			System.out.println("File Read Exception");
		}
	}
	public void readFromFile(String fileName) throws FileNotFoundException
	{
		FileInputStream fr=new FileInputStream(fileName);
		DataInputStream in = new DataInputStream(fr);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		try {
				while((strLine=br.readLine())!=null)	
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

