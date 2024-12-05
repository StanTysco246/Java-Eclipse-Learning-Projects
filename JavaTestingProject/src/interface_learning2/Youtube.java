/**
 * 
 */
package interface_learning2;

/**
 * @author ICT
 *
 */
public class Youtube implements EditPost, StoryVideo {

	private String video;
	private String description;
	
	Youtube(String v, String d){
		this.video = v;
		this.description = d;
	}
	
	public void editDescription(String s) {
		this.description = s;
	}
	
	public void createVideo() {
		System.out.println("Title: " + this.video);
		System.out.println("Description: " + this.description);
		System.out.println("New video has been uploaded");
	}
	
	@Override
	public void storyVideo() {
		System.out.println("Title: " + this.video);
		System.out.println("Description: " + this.description);
		System.out.println("This is Youtube Shorts");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editingPost(String s) {
		this.video = s;
		System.out.println("This video has been updated");// TODO Auto-generated method stub
		
	}

}
