package com.lol.service;

// CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供相应的增删改查方法，供CustomerView调用

import com.lol.bean.Customer;

public class CustomerList {
    private Customer[] customers;   // To store customers data
    private int total = 0;          // To store the quantity of customers

    // Constructor
    /**
     * @Description: Constructor to initialize CustomerList
     * @Param: totalCustomer: the length of array
     * @Author: Luna Huang
     * @Date: 9/28/20
     * @Time: 10:34 AM
     **/
    public CustomerList() {}

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * @Description Add the customer information to array
     * @Param customer:
     * @return true: success to add it
     *          false: fail to add it
     * @Author Luna Huang
     * @Date 9/28/20
     * @Time 10:37 AM
     **/
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }

        customers[total++] = customer;

        return true;
    }
    
    /**
     * @Description Modify the targeted index customer's information
     * @Param index
     * @Param cust
     * @return true: success to modify
     *         false: fail to modify
     * @Author Luna Huang
     * @Date 9/28/20
     * @Time 10:42 AM
     **/
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        }

        customers[index] = cust;

        return true;
    }

    /**
     * @Description delete the targeted customers' information
     * @Param index
     * @return true: success to delete it
     *         false: fail to delete
     * @Author Luna Huang
     * @Date 9/28/20
     * @Time 10:49 AM
     **/
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }

        for(int i = index; i < total; i++) {
            customers[i] = customers[i + 1];
            index++;
        }
        // customers[total - 1] = null;
        total--;

        return true;
    }

    /**
     * @Description get all the customers' information
     * @return
     * @Author Luna Huang
     * @Date 9/28/20
     * @Time 11:00 AM
     **/
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }

        return custs;
    }

    /**
     * @Description get the targeted customer's information
     * @Param index
     * @return if it exits, return the customer's information;
     *         if not, return null
     * @Author Luna Huang
     * @Date 9/28/20
     * @Time 11:56 AM
     **/
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }

        return customers[index];
    }

    /**
     * @Description get the total number of actual customers
     * @Param
     * @return
     * @Author Luna Huang
     * @Date 9/28/20
     * @Time 12:01 PM
     **/
    public int getTotal() {
        return total;
    }
}
