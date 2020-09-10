package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){

        //Given
        Product product1 = new Product("Wine");
        Product product2 = new Product("Cat Food");
        Product product3 = new Product("Meat");
        Product product4 = new Product("Fruits");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);

        int product1ID = product1.getId();
        int product2ID = product2.getId();
        int product3ID = product3.getId();
        int product4ID = product4.getId();

        Item item1 = new Item(product1,new BigDecimal(5.99),5,new BigDecimal(3));
        Item item2 = new Item(product2,new BigDecimal(3.99),5,new BigDecimal(1));
        Item item3 = new Item(product2,new BigDecimal(4.99),20,new BigDecimal(1));
        Item item4 = new Item(product4,new BigDecimal(5.99),5,new BigDecimal(1));
        Item item5 = new Item(product3,new BigDecimal(0.99),5,new BigDecimal(1));

        Invoice invoice1 = new Invoice("AF22245");
        Invoice invoice2 = new Invoice("AFG4521");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item5);

        invoice2.getItems().add(item3);
        invoice2.getItems().add(item4);

        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);

        int invoice1ID = invoice1.getId();
        int invoice2ID = invoice2.getId();

        //Then
        Assert.assertTrue(invoiceDao.existsById(invoice1ID));
        Assert.assertNotEquals(0,invoice1ID);
        Assert.assertNotEquals(0,invoice2ID);


        //CleaningUp
        invoiceDao.deleteById(invoice1ID);
        invoiceDao.deleteById(invoice2ID);

        productDao.deleteById(product1ID);
        productDao.deleteById(product2ID);
        productDao.deleteById(product3ID);
        productDao.deleteById(product4ID);

    }

}
