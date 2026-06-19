package com.main.enums;

public enum ArithmeticOperationEnum {

    ADD("ADD"), SUBTRACT("SUBTRACT");

    private final String operation;

    ArithmeticOperationEnum(String operation) {
        this.operation=operation;
    }

    public String getOperation() {
        return this.operation;
    }


}
