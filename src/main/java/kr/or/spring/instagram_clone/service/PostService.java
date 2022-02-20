package kr.or.spring.instagram_clone.service;

import java.util.List;

import kr.or.spring.instagram_clone.dto.Likes;
import kr.or.spring.instagram_clone.dto.Post;
import kr.or.spring.instagram_clone.dto.User;

public interface PostService {
	public static final Integer LIMIT = 5;
	public List<Post> getPosts(Integer start, Long id);
	public List<Post> getPosts(Integer start, String name);
	public int deletePost(Long id, String ip);
	public Post addPost(Post post, String ip, String image, User user);
	public Likes addLikes(Likes likes, User user, Long post_id);
	public int getCount();
}