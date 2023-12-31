package com.yeonew.readinggarden.dto.request;

import com.yeonew.readinggarden.dto.ArticleDto;
import com.yeonew.readinggarden.dto.UserAccountDto;
import com.yeonew.readinggarden.dto.HashtagDto;

import java.util.Set;

public record ArticleRequest(
        String title,
        String content
) {

    public static ArticleRequest of(String title, String content) {
        return new ArticleRequest(title, content);
    }

    public ArticleDto toDto(UserAccountDto userAccountDto) {
        return toDto(userAccountDto, null);
    }

    public ArticleDto toDto(UserAccountDto userAccountDto, Set<HashtagDto> hashtagDtos) {
        return ArticleDto.of(
                userAccountDto,
                title,
                content,
                hashtagDtos
        );
    }

}
