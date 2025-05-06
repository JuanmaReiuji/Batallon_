package co.edu.uniquindio.poo;

public enum TipoFuncion {
    LOGISTICA(0), COMUNICACIONES(1), MEDICO(2);

    private final int valor;

    TipoFuncion(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}