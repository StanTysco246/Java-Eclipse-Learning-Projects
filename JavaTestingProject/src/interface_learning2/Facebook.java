/**
 * 
 */
package interface_learning2;

/**
 * @author ICT
 *
 */
public class Facebook implements EditPost, SharePost, StoryVideo {

	private String post;
	
	Facebook(String p){
		this.post = p;
		//this.tempPost = p; interface variable is final and static
	}
	
	public void createPost() {
		System.out.println(this.post);
		System.out.println("This post has been created");
	}
	
	@Override
	public void storyVideo() {
		System.out.println(this.post);
		System.out.println("This is Facebook Story");// TODO Auto-generated method stub
		
	}

	@Override
	public void sharingPost() {
		System.out.println(this.post);
		System.out.println("This post has been shared");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editingPost(String s) {
		this.post = s;
		System.out.println("This post has been editted");// TODO Auto-generated method stub
		
	}
	
}
