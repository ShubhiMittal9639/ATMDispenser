package com.example.atmdispenser;

public abstract class ATMDispenser {
    ATMDispenser nextDispenser;

    public int dispense(Integer amount) throws Exception{
        int total=0;
        if (nextDispenser != null) {
            total+=nextDispenser.dispense(amount);
            return total;
        } else if (amount != 0) {
            throw new Exception("Exact value not formed");
        }
        return 0;
    }

    ATMDispenser(ATMDispenser dispenser) {
        this.nextDispenser = dispenser;
    }

}
