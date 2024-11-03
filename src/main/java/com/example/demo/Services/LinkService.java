package com.example.demo.Services;

import com.example.demo.Link.Dtos.RequestCreateLink;
import com.example.demo.Link.Models.Links;
import com.example.demo.Repositories.LinkRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkService {

    private final LinkRepository linkRepository;

    public String findLink(String shortenedLink) {
        String foundLink = linkRepository.findByShortenedLink(shortenedLink).get().getLink();

        return foundLink;
    }

    public boolean createLink(RequestCreateLink requestCreateLink) {
        Links newLink = Links.builder()
                .shortenedLink(requestCreateLink.getShortenedLink())
                .link(requestCreateLink.getLink())
                .build();

        linkRepository.save(newLink);

        return true;
    }

}
