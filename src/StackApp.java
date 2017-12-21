import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;




import javax.swing.JFileChooser;


public class StackApp
{
	StackImplement<Character> SI = new StackImplement<Character>();
	
	
    public void go()
    {
    	int numline = 0;
    	Scanner in;
    	
    	in = readFile();
    	
    	while (in.hasNextLine())
    	{
    		numline += 1;
    		String line = in.nextLine();
    		Scanner li = new Scanner(line);
    		li.useDelimiter("");
    		//System.out.print(line);
    		while (li.hasNext())
    		{
    			char ch = li.next().charAt(0);
    			
    			pushItem(ch);
    			popItem(ch);
    			
    		
    		}
    		if (SI.isEmpty() == true)
    		{
    			System.out.println("No errors found");
    			
    		}
    		if (SI.isEmpty() == false)
    		{
    			for (char data: SI.data )
    			{
    				System.out.println("Extra or missing " + data + " on line " + numline);
    			}	
    		}	
    	}
    }
   
    public Scanner readFile()
    {
      //File inputFile = new File ("input.txt");
        JFileChooser chooser = new JFileChooser();
        Scanner in = null;
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = chooser.getSelectedFile();
            try
            {
                in = new Scanner(selectedFile);
                //String ch = in.next();
                //probably won't keep this, just trying to figure out how this works
                //System.out.print(ch);
                return in;
            } catch (FileNotFoundException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }           
        }
        return null;
    }
   

    public void popItem(char ch)
    {
    	if (ch == ')' || ch == ']' || ch == '}')
		{		
			SI.pop();
		}
    }
    public void pushItem(char ch)
    {
    	if (ch == '(' || ch == '[' || ch == '{')
		{		
			SI.push(ch);
		}
    }
    public static void main(String[] args)
    {
        StackApp stackApp = new StackApp();
        stackApp.go();
    }
}
