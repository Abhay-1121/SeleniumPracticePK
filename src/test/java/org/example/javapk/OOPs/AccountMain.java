package org.example.javapk.OOPs;

public class AccountMain {
    public static void main(String[]args)
    {
        Account accobj=new Account();

        accobj.setAcc_no(1234);
        accobj.setName("Hina");
        accobj.setAmount(5000);

        System.out.println(accobj.getAcc_no());
        System.out.println(accobj.getName());
        System.out.println(accobj.getAmount());

    }
}
