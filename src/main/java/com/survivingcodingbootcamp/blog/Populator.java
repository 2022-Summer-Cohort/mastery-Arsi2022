package com.survivingcodingbootcamp.blog;

import com.survivingcodingbootcamp.blog.model.Hashtag;
import com.survivingcodingbootcamp.blog.model.Post;
import com.survivingcodingbootcamp.blog.model.Topic;
import com.survivingcodingbootcamp.blog.repository.HashtagRepository;
import com.survivingcodingbootcamp.blog.repository.PostRepository;
import com.survivingcodingbootcamp.blog.repository.TopicRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    private TopicRepository topicRepo;
    private PostRepository postRepo;
    private HashtagRepository hashtagRepo;

    public Populator(TopicRepository topicRepo, PostRepository postRepo, HashtagRepository hashtagRepo) {

        this.topicRepo = topicRepo;
        this.postRepo = postRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Hashtag hashtag1 = new Hashtag("Tech");
        hashtagRepo.save(hashtag1);
        Hashtag hashtag2 = new Hashtag("design");
        hashtagRepo.save(hashtag2);
        Hashtag hashtag3 = new Hashtag("programming");
        hashtagRepo.save(hashtag3);
        Hashtag hashtag4 = new Hashtag("apple");
        hashtagRepo.save(hashtag4);
        Hashtag hashtag5 = new Hashtag("Windows");
        hashtagRepo.save(hashtag5);


        Topic topic1 = new Topic("Learning TDD");
        topicRepo.save(topic1);
        Topic topic2 = new Topic("Battling Imposter Syndrome");
        topicRepo.save(topic2);
        Topic topic3 = new Topic("Introductory Java");
        topicRepo.save(topic3);
        Topic topic4 = new Topic("Object Oriented Programming and You");
        topicRepo.save(topic4);


        Post post1 = new Post("TDD For Fun and Profit", topic1, "Liban","adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim",hashtag3,hashtag4);
        postRepo.save(post1);
        Post post2 = new Post("Test the Fear Away", topic2, "Arsema","adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enm", hashtag1, hashtag2);
        postRepo.save(post2);
        Post post3 = new Post("Unit Tests and You", topic3, "Yonas","adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enm",hashtag5,hashtag1);
        postRepo.save(post3);

    }

}
