package com.yeonew.readinggarden.config;

import com.yeonew.readinggarden.domain.Hashtag;
import com.yeonew.readinggarden.domain.UserAccount;
import com.yeonew.readinggarden.domain.Article;
import com.yeonew.readinggarden.domain.ArticleComment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class DataRestConfig {

    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return RepositoryRestConfigurer.withConfig((config, cors) ->
                config
                        .exposeIdsFor(UserAccount.class)
                        .exposeIdsFor(Article.class)
                        .exposeIdsFor(ArticleComment.class)
                        .exposeIdsFor(Hashtag.class)
        );
    }

}
