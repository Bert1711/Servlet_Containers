package ru.netology.repository;

import ru.netology.model.Post;
import java.util.List;
import java.util.Optional;

import java.util.concurrent.ConcurrentHashMap;

public class PostRepository {
  private final ConcurrentHashMap<Long, Post> posts = new ConcurrentHashMap<>();

  public List<Post> all() {
    return List.copyOf(posts.values());
  }

  public Optional<Post> getById(long id) {
    return Optional.ofNullable(posts.get(id));
  }

  public Post save(Post post) {
    posts.put(post.getId(), post);
    return post;
  }

  public void removeById(long id) {
    posts.remove(id);
  }
}