package com.example.atmdispenser;

public class HundredNotes extends ATMDispenser {

    public HundredNotes(ATMDispenser dispenser){
        super(dispenser);
    }

    @Override
    public int dispense(Integer amount) {
        if (amount >= 100) {
            int rem = amount % 100;
            int notes = amount / 100;
            System.out.println(notes + " notes of 100");
            if (rem != 0) {
                return notes + super.dispense(amount - notes * 100);
            } else {
                return notes;
            }
        }
        return 0 ;
    }
}
