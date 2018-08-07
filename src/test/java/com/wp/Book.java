package com.wp;

import java.util.Date;

/**
 * Created by 浅笑 on 2018/7/30.
 */
public class Book {
    private Integer bookid;
    private String bookname;
    private String bookauthor;
    private Integer bookprice;
    private Date bookdate;

    public Book(Integer bookid, String bookname, String bookauthor, Integer bookprice, Date bookdate) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookauthor = bookauthor;
        this.bookprice = bookprice;
        this.bookdate = bookdate;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public Integer getBookprice() {
        return bookprice;
    }

    public void setBookprice(Integer bookprice) {
        this.bookprice = bookprice;
    }

    public Date getBookdate() {
        return bookdate;
    }

    public void setBookdate(Date bookdate) {
        this.bookdate = bookdate;
    }
}
