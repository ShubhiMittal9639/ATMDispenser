package com.example.atmdispenser;

public class TwoThousandNotes extends ATMDispenser {

    public TwoThousandNotes(ATMDispenser dispenser) {
        super(dispenser);
    }

    @Override
    public int dispense(Integer amount) throws Exception {
        if (amount >= 2000) {
            int rem = amount % 2000;
            int notes = amount / 2000;
            System.out.println(notes + "notes of 2000");
            if (rem != 0) {
                return notes + super.dispense(amount - notes * 2000);
            }else {
                return notes;
            }
        }
        return 0;
    }
}
