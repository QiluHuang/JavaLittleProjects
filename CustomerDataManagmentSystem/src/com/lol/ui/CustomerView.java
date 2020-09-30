package com.lol.ui;

import com.lol.bean.Customer;
import com.lol.service.CustomerList;
import com.lol.util.CMUtility;

/**
 * @Description CustomerView in charge of menu display and users' actions
 * @Author Luna Huang
 * @Date 9/28/20
 * @Time 12:05 PM
 **/

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
//        Customer customer = new Customer("John", 'M', 18, "999-9999-9999", "johnsmith@email.com");
//        customerList.addCustomer(customer);
    }

    /**
     * @Description Display the interface of CustomerView
     * @Author Luna Huang
     * @Date 9/28/20
     * @Time 12:13 PM
     **/
    public void enterMainMenu() {

        boolean isFlag = true;
        while(isFlag) {
            System.out.println("-------------------- Customer Data Management System --------------------");
            System.out.println();
            System.out.println("                      1 Add New Customer");
            System.out.println("                      2 Modify Existed Customer");
            System.out.println("                      3 Delete Customer");
            System.out.println("                      4 List All Customers");
            System.out.println("                      5 Exit\n");
            System.out.print("Please enter the number(1-5): ");

            char menu = CMUtility.readMenuSelection();
            System.out.println();

            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("Are you sure you want to log out (Y/N):  ");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    System.out.println();
                    break;
            }
        }

    }

    private void addNewCustomer() {
        System.out.println("---------------------------- Add New Customer ----------------------------");
        System.out.print("Name: ");
        String name = CMUtility.readString(15);
        System.out.print("Gender: ");
        char gender = CMUtility.readChar();
        System.out.print("Age: ");
        int age = CMUtility.readInt();
        System.out.print("Phone: ");
        String phone = CMUtility.readString(11);
        System.out.print("E-mail: ");
        String email = CMUtility.readString(30);

        // Encapsulate all information above
        Customer customer = new Customer(name, gender, age, phone, email);

        System.out.println();
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("Add successfully!!!");
        } else {
            System.out.println("Customer list is full, fail to add any more customer's information");
        }

        System.out.println();
        System.out.println("---------------------------------- End ----------------------------------");
        System.out.println();




    }

    private void modifyCustomer() {
        System.out.println("---------------------------- Modify Customer -----------------------------");

        Customer customer;
        int index;

        for (;;) {
            System.out.print("Please select the index of the targeted customer(-1 will exit).");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            customer = customerList.getCustomer(index - 1);

            if (customer == null) {
                System.out.println("Cannot find the targeted customer!");
            } else {
                break; // found the targeted customer
            }
        }

        // modify the targeted customer
        System.out.print("Name(" + customer.getName() + "): ");
        String name = CMUtility.readString(15, customer.getName());

        System.out.print("Gender(" + customer.getGender() + "): ");
        char gender = CMUtility.readChar(customer.getGender());

        System.out.print("Age(" + customer.getAge() + "): ");
        int age = CMUtility.readInt(customer.getAge());

        System.out.print("Phone(" + customer.getPhone() + "): ");
        String phone = CMUtility.readString(11, customer.getPhone());

        System.out.print("E-mail(" + customer.getEmail() + "): ");
        String email = CMUtility.readString(30, customer.getEmail());

        Customer updatedCustomer = new Customer(name, gender, age, phone, email);

        boolean isReplaced = customerList.replaceCustomer(index - 1, updatedCustomer);

        if (isReplaced) {
            System.out.println();
            System.out.println("---------------------------------- End ----------------------------------");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("----------------------------- Fail to Modify----------------------------");
            System.out.println();
        }


    }

    private void deleteCustomer() {
        System.out.println("---------------------------- Delete Customer -----------------------------");

        int index;

        for (;;) {
            System.out.print("Please select the index of the targeted customer(-1 will exit).");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            Customer customer = customerList.getCustomer(index - 1);
            if (customer == null) {
                System.out.println("Cannot find the target customer!");
            } else {
                break;
            }
        }

        // find the target customer
        System.out.println("");
        System.out.print("Are you sure you want to delete him (Y/N):  ");
        char isDelete = CMUtility.readChar();
        if (isDelete == 'Y') {
            customerList.deleteCustomer(index - 1);
        } else {
            return;
        }
    }

    private void listAllCustomers() {
        System.out.println("----------------------------- Customer List -----------------------------");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("No Any Customer");
        } else {
            System.out.println("Index\tName\tGender\t\tAge\t\tPhone number\t\t\tE-mail");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                Customer cust = custs[i];
                System.out.println("  " + (i + 1) + "\t\t" + cust.getName() + "\t\t" + cust.getGender() +
                        "\t\t" + cust.getAge() + "\t\t" + cust.getPhone() + "\t\t" + cust.getEmail());
            }
        }
        System.out.println("---------------------------------- End ----------------------------------");
        System.out.println();

    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
