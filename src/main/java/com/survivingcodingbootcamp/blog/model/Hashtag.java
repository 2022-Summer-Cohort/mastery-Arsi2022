package com.survivingcodingbootcamp.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String hashtagName;
    @ManyToMany(mappedBy = "hashtags")
    private Collection <Post> posts;

    public Hashtag(String hashtagName, Post... posts) {
        this.hashtagName = hashtagName;
        this.posts = Arrays.asList(posts);
    }

    public Hashtag() {
    }

    public long getId() {
        return id;
    }

    public String getHashtagName() {
        return hashtagName;
    }

    public Collection<Post> getPosts() {
        return posts;
    }
}
