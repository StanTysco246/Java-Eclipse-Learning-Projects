/**
 * 
 */
package interface_learning2;

/**
 * @author ICT
 *
 */
public class InterfaceLearning2Driver {

	/**
	 * @param args
	 */
	//EditPost ep = new Facebook("Hello World!"); static variable should be declared inside static method
	public static void main(String[] args) {
		Facebook fb = new Facebook("Today is good day");
		Twitter tw = new Twitter("This is my first tweet");
		Youtube yt =  new Youtube("First Video", "This is my first video");
		
		//EditPost ep = new Facebook("");
		//ep.editingPost("Hello World!");
		//ep.createPost();
		
		fb.createPost();
		fb.editingPost("Today");
		fb.sharingPost();
		fb.storyVideo();
		
		tw.createTweet();
		tw.sharingPost();
		
		yt.createVideo();
		yt.editingPost("Briefing");
		yt.editDescription("First take");
		yt.storyVideo();
		
		// TODO Auto-generated method stub

	}

}
