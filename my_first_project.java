package com.Lockedme.simplilearn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class my_first_project {
	
	
	public static void main(String[]arg) throws IOException {
	    Scanner pq= new Scanner(System.in);
		my_first_project classobj=new my_first_project();
		
		
		classobj.devloper_detail();
		int str2;
		str2=pq.nextInt();
		int ch=str2;
		do {
		switch(ch)
		{
		case 1:
			classobj.applicant_detail();
			break;
			
		case 2:
			classobj.file_delet();
			break;
			
		case 3:
			classobj.searched();
			break;
		case 4:
			
			System.out.println("see youn soon..........!");
			break;
		}
		
		}
		while(ch !=4);
		
		
	}
	//private String appname;
//	private String appemail;
	

	Scanner sc= new Scanner(System.in);
	public void devloper_detail() {
		
		System.out.println("the name of the devloper is swapnil jounjalkar");
		System.out.println("Application name : Lockedme  ");
		System.out.println("applicant detail press 1");
		System.out.println("file delete press 2");
		System.out.println("file search press 3");
		System.out.println("exit.....!");
	}
	
	public void applicant_detail() throws IOException {
	/*	System.out.println("APPLICANT NAME:");
		 appname=sc.next();
		 System.out.println("APPLICANT EMAIL ID:");
		 appemail=sc.next();
		 
		 */
		System.out.println("text file name:");
		File appli=new File("C:\\Users\\ASUS\\test2\\"+sc.next().toLowerCase());//creating a file object and text file out1
		FileWriter fw=new FileWriter(appli);
		PrintWriter fp=new PrintWriter(fw);
		String app;
		System.out.println("Applicant name:");
		fp.println("Applicant name =="+sc.next()+" "+sc.next()+" ");
		System.out.println("Email id:");
		fp.println("Email id=="+sc.next());
		fp.close();
		 
		
	}
	
	//@SuppressWarnings("unused")
	public void file_delet() {
		
		File filename=new File("C:\\Users\\ASUS\\test2");
		String[] qr=filename.list();
		
	  System.out.println("the following files are listed in a test2 directory.........");
	  Arrays.sort(qr);
		for(int i=0;i<qr.length;i++) {
			
			System.out.println(i+qr[i]);
		}
		System.out.println("Delete specific file are................");
		String sfs;
	sfs=sc.next();

		File filename1=new File("C:\\Users\\ASUS\\test2\\"+sfs);
		String[] xc=filename1.list();
		
		if(filename1.delete())
		{
			System.out.println("the file "+sfs+" deleted.......!");
		}
		else
		{
			System.out.println("the given file "+sfs+" not found......!");
		}
		
		/*for(String xc1:xc)
		{
			File fd1=new File(filename1,xc1);
			fd1.delete();
		}*/
	}
	 public void searched() throws IOException
	 {  
		 System.out.println("ENTER THE FILE NAME (IN LOWERCASE)==");
		 String newtxtfile;
	 newtxtfile =sc.next();
		 File file=new File("C:\\Users\\ASUS\\test2");
		
		 String[] gh=file.list();
		

		 int fixed=0;
		 for(int j=0;j<gh.length;j++)		 {
			
			 if (gh[j].equals(newtxtfile)) {
				 System.out.println("the file are found "+gh[j]+" at a index-->"+j);
				 fixed=fixed+1;
			 }
			/* else {
				 
			 }*/
		 
		 }
		 if(fixed==0) {
			 
			 System.out.println("the file not found...!");
		 }
		 
	 }
	
	
	
	
	
	
}


