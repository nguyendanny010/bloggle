package bloggle.api.service;

import java.util.List;

import bloggle.api.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);
    List<CommentDto> getCommentsByPostId(long postId);
    CommentDto getCommentById(long postId, long commentId);
    CommentDto updateComment(long postId, long commentId, CommentDto commentRequest);
    void deleteComment(long postId, long commentId);
}
