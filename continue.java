import java.math.*;
import java.io.*;
import java.util.*;


public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
      int i=0;

      while(i < 3)
      {
        i++;

        System.out.println("Before "+i);

        if(i==2)
            continue;
        System.out.println("After "+i);
      }

    } 
} 
