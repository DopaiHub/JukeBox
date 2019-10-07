//Adam Nguyen
/**
 * import linkedlist and queue to have song queue
 */
import java.util.LinkedList;
import java.util.Queue;
/**
 * JukeBox class is a singleton and only one instance can be made
 * @author Adam Nguyen
 *
 */
public class JukeBox {
	/**
	 * Queue of type string is made, along with static JukeBox
	 */
	private Queue<String> songQueue=new LinkedList<>();
	private static JukeBox jukeBox;
	
	/**
	 * private constructor to do nothing(singleton)
	 */
	private JukeBox()
	{	}
	/**
	 * getInstance method creates a new JukeBox if it doesn't exist, otherwise return the existing JukeBox
	 * @return
	 */
	public static JukeBox getInstance()
	{
		if(jukeBox==null)
		{
			System.out.println("Initializing the JukeBox!!! Let's get Dancing");
			jukeBox=new JukeBox();
		}
		return jukeBox;
	}
	/**
	 * playNextSong method prompts user to add songs if its empty, otherwise it plays the next song and removes it from the queue
	 */
	public void playNextSong()
	{
		if(songQueue.size()==0)
		{
			System.out.println("You need to add songs to the list");
		}
		else
		{
			System.out.println("Lets jam to "+songQueue.remove());
		}
	}
	/**
	 * Takes in a song and adds it to the queue, along with showing its place in the queue
	 * @param song
	 */
	public void requestSong(String song)
	{
		songQueue.add(song);
		System.out.println(song+" is now number "+songQueue.size()+" on the list");
	}
	/**
	 * hasMoreSongs method returns true if size of queue is >0 otherwise its false
	 * @return
	 */
	public boolean hasMoreSongs()
	{
		if(songQueue.size()>0)
			return true;
		else
			return false;
	}

}
