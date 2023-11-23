package day38_a_abstraction_interface.shopping;

public abstract class Shopping {

    // Abstract class - cannot instantiate
// can have abstract method
// cant have all the other instance and static members.
// can have constructor

        public double price;

        public abstract void buyItem();


        public abstract void returnItem();
    }

