package ie.dit;

public class Tune
{
	private int x;

	private String title;
	private String altTitle;
	private String notation;

	public void setInfo(int x, String title, String altTitle, String notation)
	{
		this.x = x;
		this.title = title;
		this.altTitle = altTitle;
		this.notation = notation;
	}

	public Tune(int x, String title, String altTitle, String notation)
	{
		setInfo(x, title, altTitle, notation);
	}

	public String toString()
	{
		
		StringBuffer sb = new StringBuffer();
        for(String song: tunes)
        {
            sb.append(word + ", ");
        }

        return sb.toString();
		

		 
	}





}