package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceTest {

    @Autowired
    @Qualifier("proxyAccountService")
    private  IAccountService as;

    @Test
    public void testTransfer(){
        as.transfer("aaa", "bbb", 100f);
    }

    @Test
    public void testFindAll(){
        List<Account> accounts = as.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

//
//    @Test
//    public void testFindAll() {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as = ac.getBean("accountService", IAccountService.class);
//        List<Account> accounts = as.findAll();
//        for (Account account : accounts) {
//            System.out.println(account);
//        }
//    }
//
//    @Test
//    public void testFindOne() {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as = ac.getBean("accountService", IAccountService.class);
//        Account account = as.findById(1);
//        System.out.println(account);
//    }
//
//    @Test
//    public void testSave() {
//        Account account = new Account();
//        account.setName("test");
//        account.setMoney(12345f);
//
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as = ac.getBean("accountService", IAccountService.class);
//        as.save(account);
//
//    }
//
//    @Test
//    public void testUpdate() {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as = ac.getBean("accountService", IAccountService.class);
//        Account account = as.findById(4);
//        account.setMoney(23456f);
//        as.update(account);
//    }
//
//    @Test
//    public void testDelete() {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as = ac.getBean("accountService", IAccountService.class);
//        as.delete(4);
//    }
//
//    @Test
//    public void testTransfer(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as = ac.getBean("accountService", IAccountService.class);
//        as.transfer("aaa", "bbb", 100f);
//    }
}
