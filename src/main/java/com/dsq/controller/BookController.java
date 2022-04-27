package com.dsq.controller;

import com.dsq.pojo.Books;
import com.dsq.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author daishq
 * @date: 2022/4/26 14:25
 * @description:
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍，并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        bookService.addBook(books);
        //重定向到@RequestMapping("/allBook")
        return "redirect:/book/allBook";
    }

    //跳转到修改界面
    @RequestMapping("/toUpdateBook")
    public String toUpdatePaper(int id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("books", books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        bookService.updateBook(books);
        //重定向到@RequestMapping("/allBook")
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //根据书名查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String bookName, Model model) {
        Books books = bookService.queryBookByName(bookName);
        List<Books> list = new ArrayList();
        list.add(books);
        if (books == null) {
            list = bookService.queryAllBook();
            model.addAttribute("error", "未查到");
        }
        model.addAttribute("list", list);
        return "allBook";
    }
}
