package be.intecbrussel.jpaonetomanydemo;

import be.intecbrussel.jpaonetomanydemo.model.Comment;
import be.intecbrussel.jpaonetomanydemo.model.Post;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class SringLab2Application {

    public static void main(String[] args) {
        SpringApplication.run(SringLab2Application.class, args);


        // Create a Post
        Post post = new Post("post title", "post description", "post content");
        // Create Comments
        Comment comment1 = new Comment("Great Post!");
        comment1.setPost(post);
        Comment comment2 = new Comment("Really helpful Post. Thanks a lot!");
        comment2.setPost(post);
        // Add comments in the Post
        post.getComments().add(comment1);
        post.getComments().add(comment2);// Save Post and Comments via the Post entity

        /*
        postRepository.save(post);

        // Retrieve Post
        Post post2 = postRepository.findById(postId);

        // Get all the comments
        Set<Comment> comments = post.getComments();
         */
    }
}