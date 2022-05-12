package com.dsq.service;

import com.dsq.dao.BookMapper;
import com.dsq.pojo.Books;

import java.util.List;
import java.util.Map;

public class BookServiceImpl implements BookService {
    //service 调dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }

    public List<Books> queryBookByLimit(Map<String, Integer> map) {
        return bookMapper.queryBookByLimit(map);
    }
}
