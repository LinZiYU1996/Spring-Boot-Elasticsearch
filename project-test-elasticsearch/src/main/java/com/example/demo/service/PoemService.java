package com.example.demo.service;

import com.example.demo.entity.Poem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by linziyu on 2018/5/19.
 * 业务逻辑
 *
 */
public interface PoemService {
   //保存Poem实体
   void save (Poem poem);

   //基于title和content进行搜索，返回分页
   Page<Poem> search(String title, String content, Pageable pageable);

   //基于content进行搜索，返回分页
   Page<Poem> search(String content,Pageable pageable);

   //返回所有数据集合
   Page<Poem> findAll(Pageable pageable);
}
