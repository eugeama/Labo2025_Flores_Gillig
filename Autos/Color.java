package Autos;

public enum Color {
    ROJO("ff0000"), NARANJA("ff8300"), AMARILLO("ffec00"), VERDE("13ff00"), AZUL("0042ff"), VIOLETA("6800ff"),
    ROSA("ff00bd");

    private String hexadecimal;

    private Color(String hexadecimal){
        this.hexadecimal=hexadecimal;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public void setHexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }
}

