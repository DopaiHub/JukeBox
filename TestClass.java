import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test class for jukeBox
 * @author Adam Nguyen
 *
 */
public class TestClass {
	/**
	 * make jukebox
	 */
		JukeBox jukeBox=JukeBox.getInstance();
	@Test
	/**
	 * test if instance only makes 1 jukeBox
	 */
	public void testInstance()
	{
		JukeBox jukeBox2=JukeBox.getInstance();
		assertEquals(jukeBox,jukeBox2);
	}
	@Test
	/**
	 * Test if size is empty
	 */
	public void testSizeEmpty()
	{
		assertEquals(false,jukeBox.hasMoreSongs());
	}
	@Test
	/**
	 * test if size is not empty
	 */
	public void testSizeNotEmpty()
	{
		jukeBox.requestSong("1");
		assertEquals(true,jukeBox.hasMoreSongs());
	}
	@Test
	/**
	 * test if adding song works to jukebox
	 */
	public void testAddSong()
	{
		jukeBox.requestSong("Test");
		assertEquals(true,jukeBox.hasMoreSongs());
	}
	@Test
	/**
	 * test if removing song works from jukebox
	 */
	public void testRemoveSong()
	{
		while(jukeBox.hasMoreSongs())
			jukeBox.playNextSong();
		assertEquals(false,jukeBox.hasMoreSongs());
	}
	@Test
	/**
	 * test if jukebox is empty if playNextSong method works
	 */
	public void testEmptyPlaySong()
	{
		if(jukeBox.hasMoreSongs()==true)
			assertEquals(true,jukeBox.hasMoreSongs());
		else
		{
			jukeBox.playNextSong();
			assertEquals(false,jukeBox.hasMoreSongs());
		}
	}
	@Test
	/**
	 * test adding 5 songs and checking size
	 */
	public void testAdd5Songs()
	{
		while(jukeBox.hasMoreSongs())
		{
			jukeBox.playNextSong();
		}
		for(int i=0;i<5;i++)
		jukeBox.requestSong("Song "+i);
		int size=0;
		while(jukeBox.hasMoreSongs())
		{
			size++;
			jukeBox.playNextSong();
		}
		assertEquals(5,size);
	}

}
