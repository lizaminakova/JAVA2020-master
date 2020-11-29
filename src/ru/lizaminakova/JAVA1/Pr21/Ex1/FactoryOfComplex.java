package ru.lizaminakova.JAVA1.Pr21.Ex1;

public abstract class FactoryOfComplex implements ComplexFactory {
    public Complex create(){
        return new Complex();
    }
    public Complex create(double Re, double Im){
        return new Complex(Re, Im);
    }
}
