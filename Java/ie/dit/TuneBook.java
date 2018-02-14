package ie.dit;

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();

	public TuneBook(String name)
	{
        BufferedReader inputStream = null;


        try {
            inputStream = new BufferedReader(new FileReader("hnj0.abc"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                tunes.add(l);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream != null) {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
	}


	 public String toString()
    {
        StringBuffer sb = new StringBuffer();
        //String song = " ";
        for(String song:tunes)
        {
            sb.append(song + "\n");
        }

        return sb.toString();

    }

    public String findTune(String title)
    {
    	 int match = Integer.MAX_VALUE;
        String closestWord = ""; 
        for(String s:tunes)
        {
            int close = Tune.MinimumEditDistance(tunes, s);
            if (close == 0)
            {
                return song;
            }
            if (close < match)
            {
                match = close;
                closestWord = s;
            }
        }
        return closestWord;
    }
    

     public static void main(String[] args)
    {
        TuneBook tb = new TuneBook("hnj0.abc");
        System.out.println(tb);

        tb.findTune("Scotsman over the Border");
        //t.play();
    }

}