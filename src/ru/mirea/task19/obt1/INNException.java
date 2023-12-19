package ru.mirea.task19.obt1;

import java.math.BigInteger;


//обработка ситуации, когда программа обнаруживает недействительный ИНН и
//Нуждается в уведомлении об этом с указанием конкретного числового значения, вызвавшего проблему.

public class INNException extends Exception{
    private final BigInteger innNum;

    public INNException(BigInteger inn){
        super("ИНН с номером " + inn + " не действителен");
        innNum = inn;
    }

    public BigInteger getInnNum(){
        return innNum;
    }
}
