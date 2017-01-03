package com.qingjie.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingjie.domain.Post;
import com.qingjie.repository.AuthorRepository;
import com.qingjie.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	private PostRepository postRepository;
	private AuthorRepository authorRepository;

	@Autowired
	public PostServiceImpl(PostRepository postRepository, AuthorRepository authorRepository) {
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}

	@Override
	public Iterable<Post> list() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}

	@Override
	@Transactional
	public Post create(Post post) {
		authorRepository.save(post.getAuthor());
		return postRepository.save(post);
	}

	@Override
	public Post read(long id) {
		// TODO Auto-generated method stub
		return postRepository.findOne(id);
	}

	@Override
	public Post update(long id, Post update) {
		Post post = postRepository.findOne(id);
		if (update.getTitle() != null) {
			post.setTitle(update.getTitle());
		}
		return postRepository.save(post);
	}

	@Override
	public void delete(long id) {
		postRepository.delete(id);

	}

}
