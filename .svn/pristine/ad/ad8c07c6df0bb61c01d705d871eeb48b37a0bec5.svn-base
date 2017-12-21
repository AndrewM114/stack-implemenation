import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


import javax.swing.JFileChooser;

public class StackImplement<T> implements Stack<T>
{
ArrayList<T> data = new ArrayList<T>();
    
    
    
    
    @Override
    public void push(T item)
    {
            data.add(item);
            
    }

    @Override
    public T pop()
    {
        int i = data.size() - 1;
        T top;
        if (isEmpty() == true)
        {
            return null;
        }
        else
        {
            top = data.get(i);
            data.remove(i);
            return top;
        }
    }

    @Override
    public boolean isEmpty()
    {
        if (data.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}
