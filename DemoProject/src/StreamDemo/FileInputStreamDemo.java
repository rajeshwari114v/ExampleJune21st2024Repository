package DemoProject.src.StreamDemo;

import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        readContent();
    }

    private static void readContent()
    {
        FileInputStream fin=null;
        int n=0;
        try
        {
            fin=new FileInputStream("C:\\Demo\\Sample.txt");
            while(true)
            {
                n=fin.read();
                if(n==-1)
                {
                   break;
                }
                char ch=(char) n;
                System.out.print(ch);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
