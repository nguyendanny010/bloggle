package bloggle.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bloggle.api.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
    List<Comment> findByPostId(long postId);
}
