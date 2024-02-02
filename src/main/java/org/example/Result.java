package org.example;

public class Result extends Number {

    ///////////////////////////////////////////////////ПЕРЕОПРЕДЕЛЕНИЕ СЕТТЕРА//////////////////////////////////////////
    @Override
    public void setvalue(String value) {
        super.setvalue(value);
        System.out.printf("HEX:" + HEX(getvalue()) + "   DEC:" + getvalue() + "   OCT:" + OCT(getvalue()) + "   BIN:" + BIN(getvalue()) + "\n");
    }

    ///////////////////////////////////////////////////ПРЕОБРАЗОВАНИЕ В НУЖНУЮ СИСТЕМУ//////////////////////////////////

    private String HEX(String arg) {
        String hex = Integer.toHexString(Integer.parseInt(arg));
        return hex.toUpperCase();
    }

    private String OCT(String arg) {
        return Integer.toOctalString(Integer.parseInt(arg));
    }

    private String BIN(String arg) {
        return Integer.toBinaryString(Integer.parseInt(arg));
    }
}
