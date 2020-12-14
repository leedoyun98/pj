package com.example.demo.cop.bbs.serivce.impl;

import java.util.List;

import com.example.demo.cop.bbs.serivce.ArticleService;
import com.example.demo.cop.bbs.serivce.model.ArticleDto;
import com.example.demo.cop.bbs.serivce.model.ReplyDto;

import org.springframework.stereotype.Service;
@Service
public class ArticleServiceImpl implements ArticleService {

    @Override
    public void writeArticle(ArticleDto article) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modifyArticle(ArticleDto article) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeArticle(ArticleDto article) {
        // TODO Auto-generated method stub

    }

    @Override
    public void writeReply(ReplyDto reply) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeReply(ReplyDto reply) {
        // TODO Auto-generated method stub

    }

    @Override
    public ArticleDto readArticle(int artId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ReplyDto> readReply(int artId) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
