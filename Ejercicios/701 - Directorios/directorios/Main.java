package directorios;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
 
public class Main 
{


 
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		File f=new File(".");
		SortedSet<String> lista=new TreeSet();
		listar(lista,f);
		Iterator it = lista.iterator();
	    while (it.hasNext()) {
	         // Get element
	         Object element = it.next();
	         System.out.println(element.toString());
	      }
 
	}
 
	static public void listar(SortedSet lista,File file) throws IOException
	{
		File[] files=file.listFiles();
		for(File f :files)
		{
			lista.add(file.getPath()+'\\'+f.getName());
			if (f.isDirectory()){
				listar(lista,f);
			}
			
 
		}
	}
 
}