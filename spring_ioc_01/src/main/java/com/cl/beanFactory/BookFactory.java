package com.cl.beanFactory;

import com.cl.bean.Book;
import org.springframework.beans.factory.FactoryBean;

public class BookFactory implements FactoryBean<Book> {

    public Book getObject() throws Exception {
        Book book = new Book();
        book.setAuthor("cailei");
        book.setBName("哈利波特");
        return book;
    }

    public Class<?> getObjectType() {
        return null;
    }
}
