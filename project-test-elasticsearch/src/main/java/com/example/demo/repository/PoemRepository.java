package com.example.demo.repository;

import com.example.demo.entity.Poem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by linziyu on 2018/5/19.
 * dao层
 *
 */
public interface PoemRepository extends ElasticsearchRepository<Poem,Long>{
    Page<Poem> findByTitleLikeOrContentLike(String title, String content, Pageable pageable);
    Page<Poem> findByContentLike(String content,Pageable pageable);

}
