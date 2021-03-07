package hu.golsoft.hirharsona.service;

import hu.golsoft.hirharsona.dto.Article;
import hu.golsoft.hirharsona.dto.Journalist;
import hu.golsoft.hirharsona.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private ArticleRepository artRepo;

    @Autowired
    public ArticleService(ArticleRepository artRepo){
        this.artRepo = artRepo;
    }

    public List<Article> getSel(){
        List<Article> auth = artRepo.getSel();
        return auth;
    }

    public List<Article> getLast(){
        List<Article> lastTen = artRepo.getLast();
        return lastTen;
    }
}
