package like;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name = "likeDislikeBean")
@SessionScoped
public class LikeDislikeBean {
	 private int likeCount = 0;
	    private int dislikeCount = 0;

	    public void likeAction() {
	        likeCount++;
	    }

	    public void dislikeAction() {
	        dislikeCount++;
	    }

	    // Getters
	    public int getLikeCount() {
	        return likeCount;
	    }

	    public int getDislikeCount() {
	        return dislikeCount;
	    }
}
