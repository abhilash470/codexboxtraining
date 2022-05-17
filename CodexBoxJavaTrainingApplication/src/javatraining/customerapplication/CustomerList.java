package javatraining.customerapplication;

import java.util.*;
public class CustomerList extends CustomerDetails {
    public static void main(String[] args) {
        CustomerDetails customer=new CustomerDetails();
        customer.setCid(1);
        customer.setAddress("hyderabad");
        customer.setCname("Abhilash");
        customer.setAmount(23455);
        customer.setItems(7);
        CustomerDetails customer2=new CustomerDetails();
        customer2.setCid(2);
        customer2.setAddress("hyderabad");
        customer2.setCname("Abhilash");
        customer2.setAmount(23455);
        customer2.setItems(7);

        List<CustomerDetails> customers= new ArrayList<>();
        customers.add(customer);
        customers.add(customer2);
       /* for(int i=0;i<2;i++) {
            System.out.println(customers.get(i).getCid());
            System.out.println(customers.get(i).getCname());
            System.out.println(customers.get(i).getAmount());
            System.out.println(customers.get(i).getAddress());
            System.out.println(customers.get(i).getItems());
        }*/
        for(CustomerDetails customers1: customers){
            System.out.println(customers1.getCid());
            System.out.println(customers1.getItems());
            System.out.println(customers1.getAddress());
            System.out.println(customers1.getCname());

            System.out.println(customers1.getAmount());
            System.out.println("****************************");

        }
    }
}
