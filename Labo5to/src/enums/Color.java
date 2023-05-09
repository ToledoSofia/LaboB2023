package enums;

public enum Color {
    NEGRO("#000000"), AZUL("#0000FF"), MARRON("#804000"), GRIS("#808080"), VERDE("#008000"), NARANJA("#FF8000"), ROSA("#F7BEF1"), VIOLETA("#78288C"), ROJO("#78288C"), BLANCO("#78288C"), AMARILLO("#FFFF00");
    private String hexadecimal;
    private Color(String codigoHexa){
        hexadecimal = codigoHexa;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public void setHexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }
}
