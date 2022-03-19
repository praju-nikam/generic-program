package com.java.bridgelabs.maximum;

public class Test<E>
{
    private E number1;
    private E number2;
    private E number3;

    public E getNumber1() {
        return number1;
    }

    public void setNumber1(E number1) {
        this.number1 = number1;
    }

    public E getNumber2() {
        return number2;
    }

    public void setNumber2(E number2) {
        this.number2 = number2;
    }

    public E getNumber3() {
        return number3;
    }

    public void setNumber3(E number3) {
        this.number3 = number3;
    }

    @Override
    public String toString() {
        return "Test [number1=" + number1 + ", number2=" + number2 + ", number3=" + number3 + ", getNumber1()="
                + getNumber1() + ", getNumber2()=" + getNumber2() + ", getNumber3()=" + getNumber3() + "]";
    }

}
