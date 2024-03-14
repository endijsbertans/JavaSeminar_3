package service;
import model.PostType;
public interface IpostService {
	public abstract void publishPost(PostType type, String msg)throws Exception;

}
