package io.dowlath.bookmarkerapi.api;

import io.dowlath.bookmarkerapi.domain.Bookmark;
import io.dowlath.bookmarkerapi.domain.BookmarkService;
import io.dowlath.bookmarkerapi.domain.BookmarksDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
    private final BookmarkService bookmarkService;

    @GetMapping
    public BookmarksDTO getBookmarks(@RequestParam(name="page",defaultValue = "1") Integer page){
        return bookmarkService.getBookmarks(page);
    }

}
