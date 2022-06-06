package bloggle.api.service;

import bloggle.api.payload.PostDto;
import bloggle.api.payload.PostResponse;

public interface PostService {
   PostDto createPost(PostDto postDto); 
   PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
   PostDto getPostById(long id);
   PostDto updatePost(PostDto postDto, long id);
   void deletePostById(long id);
}
