package ie.dit;

import java.util.ArrayList;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();

	public TuneBook(String name)
	{
        BufferedReader inputStream = null;


        try {
            inputStream = new BufferedReader(new FileReader(name));

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
        for(String song:tunes)
        {
            sb.append(song + "\n");
        }

        return sb.toString();

    }

}