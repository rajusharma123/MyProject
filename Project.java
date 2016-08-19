import java.io.*;
import java.util.StringTokenizer;

class Project

{

	
		public static void main (String args[]) throws IOException
{
		

		char a[] = new char[1000];

		int ch,i=0,count=0;
		String ss[] = new String[100]; 
		

		FileInputStream f = new FileInputStream("Main.java");

		
		
		while((ch=f.read())!=-1)
		{

			
			a[i] = (char)ch;
			
			i++;
			count++;
		}
		
		i=0;
		while(i<count)
		{
			

			if(a[i]=='(')
			{
			
				while(a[i]!=')')
				{
					a[i]='n';
					i++;
				}
			}
			if(a[i]=='"')
			{
				i++;
				while(a[i]!='"')
				{
					a[i]='n';
					i++;
				}
			}


			i++;
		}
		
		
		

		
		String s = new String(a);
		String s1 = new String();
		String s2 = new String();
		
		StringTokenizer st = new StringTokenizer(s);
		
		

	i=0;
	count=0;

	while(st.hasMoreTokens())
		{
				s="class";
				
				if(s.equals(st.nextToken()))
				{
					ss[i]=st.nextToken();
					i++;
					count++;
					s="{";
					s1="extends";
					s2=st.nextToken();
					if(s.equals(s2))
					{	
					
					}
					else if(s1.equals(s2))
					{
						
						ss[i]="extends";
						i++;
						count++;
						ss[i]=st.nextToken();
						i++;
						count++;	
					}
					
													
				}
					
				
					
					
		}
		

		
			
						
				
					
				




		
			i=0;

			while(i<count)
		{
			System.out.println(ss[i]);
			i++;
		}

	

		

		
			








}

}