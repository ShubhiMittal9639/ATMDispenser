package com.example.atmdispenser;

public class TenNotes extends ATMDispenser{

    TenNotes(ATMDispenser dispenser) {
        super(dispenser);
    }
    public int dispense(Integer amount){
        if (amount >= 10) {
            int notes = amount / 10;
            int rem = amount % 10;
            System.out.println(notes + "notes for 10");
            if (rem != 0) {
                return  notes + super.dispense(amount-notes*10);
            } else {
                return notes;
            }
        }
        return 0;
    }
}
