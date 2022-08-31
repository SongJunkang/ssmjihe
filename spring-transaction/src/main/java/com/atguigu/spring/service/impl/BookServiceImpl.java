package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;


@Service
public class BookServiceImpl  implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
//    @Transactional(
//            //          noRollbackFor = ArithmeticException.class ，下方的式全类名，方法。
//            //noRollbackForClassName ="java.lang.ArithmeticException";因为什么不回滚
//            propagation = Propagation.REQUIRES_NEW
//
////            timeout = 3
//          )
    public void buyBook(Integer userId, Integer bookId) {


//        try {
//            //设置休眠5s，大于设置的3s，所以运行不完，报错，强制回滚。
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        //查询图书的价格。

        Integer price  = bookDao.getPriceByBookId(bookId);

        //更新图书的库存。

        bookDao.updateStock(bookId);

        //更新用户的余额。

        bookDao.updateBalance(userId,price);



    }
}
