package ie.dit;

public class Tune
{
	private int x;

	private String title;
	private String altTitle;
	private String notation;

	public void setInfo(int x, String title, String altTitle)
	{
		this.x = x;
		this.title = title;
		this.altTitle = altTitle;
	}

	public Tune(int x, String title, String altTitle, String notation)
	{
		this.notation = notation;
		setInfo(x, title, altTitle);
	}

	public String toString()
	{
		String str = title + ", " + altTitle;

		return str;


		/*String song;
		return s.append(song + ) 
		StringBuffer sb = new StringBuffer();
        for(String song: tunes)
        {
            sb.append(word + ", ");
        }

        return sb.toString();
		*/

		 
	}





}