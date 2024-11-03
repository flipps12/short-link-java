package com.example.demo.Controllers;

import com.example.demo.Link.Dtos.RequestCreateLink;
import com.example.demo.Services.LinkService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class MainController {

    private final LinkService linkService;

    @GetMapping("/{shortenedLink}")
    public void redirect(@PathVariable String shortenedLink, HttpServletResponse response) throws IOException {
        System.out.println(shortenedLink);
        response.sendRedirect(linkService.findLink(shortenedLink));
    }

    @PostMapping("api/create")
    public boolean create(@RequestBody RequestCreateLink requestCreateLink) {
        System.out.println(requestCreateLink);
        return linkService.createLink(requestCreateLink);
    }

}
