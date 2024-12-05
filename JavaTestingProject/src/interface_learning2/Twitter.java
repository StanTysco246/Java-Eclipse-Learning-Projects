/**
 * 
 */
package interface_learning2;

/**
 * @author ICT
 *
 */
public class Twitter implements SharePost {

	private String tweet;
	
	Twitter(String t){
		this.tweet = t;
	}
	
	public void createTweet() {
		System.out.println(this.tweet);
		System.out.println("New Tweet has been posted");
	}
	
	@Override
	public void sharingPost() {
		System.out.println(this.tweet);
		System.out.println("This post has been retweeted");// TODO Auto-generated method stub
		
	}
	
}
