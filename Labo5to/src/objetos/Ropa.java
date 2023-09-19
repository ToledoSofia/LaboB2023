package objetos;

import enums.Color;

public abstract class Ropa extends Objeto{
    private Color color;
    private String material;
    private String marca;
    private boolean estado;

    public Ropa() {
        super();
    }

    public Ropa(Color color, String material, String marca, boolean estado) {
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public Ropa(String marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
