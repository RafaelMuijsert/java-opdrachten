package Week5;
public class GekDing

{

	private int waarde;



	public GekDing( int w )

	{

		waarde = w;

	}



	public boolean equals( Object obj )

	{

		if(obj == null) { return true; }
		GekDing that = (GekDing) obj;
		return
				( this.waarde  >  that.waarde ) ||
				(this.waarde == 1 && that.waarde == -1);
	}
}