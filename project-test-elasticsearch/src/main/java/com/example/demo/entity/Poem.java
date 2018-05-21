package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



/**
 * Created by linziyu on 2018/5/19.
 * 实体类
 *
 *
 */
//定义索引名字及类型
@Document(indexName = "poem",type = "poem",shards = 1, replicas = 0)
public class Poem {

    @Id
    private long id;
    private String title;
    private String content;

    public Poem(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Poem(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Poem() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
