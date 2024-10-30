package com.example.Desayuno.Domains;

public class Desayuno {
    private String Tipo;
    private Bebida Bebida;
    private PlatoPrincipal PlatoPrincipal;
    private Acompañamiento Acompañamiento;
    private String Mensaje;
    private double PrecioTotal;
    public Desayuno() {}
    public Desayuno(DesayunoBuilder builder) {
        this.Tipo = builder.Tipo;
        this.Bebida = builder.Bebida;
        this.PlatoPrincipal = builder.PlatoPrincipal;
        this.Acompañamiento = builder.Acompañamiento;
        this.Mensaje = builder.Mensaje;
        this.PrecioTotal = builder.PrecioTotal;
    }
    public double CalcularPrecioTotal() {
        double precioBase = 3000;
        double precioPP = PlatoPrincipal != null ? PlatoPrincipal.getPrecio() : 0.0;
        double precioA = Acompañamiento != null ? Acompañamiento.getPrecio() : 0.0;
        double precioB = Bebida != null ? Bebida.getPrecio() : 0.0;
        PrecioTotal = precioBase + precioPP + precioA + precioB;
        return PrecioTotal;
    }

    @Override
    public String toString() {
        return "Desayuno{" +
                "Tipo='" + Tipo + '\'' +
                ", Bebida=" + Bebida.toString() +
                ", PlatoPrincipal=" + PlatoPrincipal.toString() +
                ", Acompañamiento=" + Acompañamiento.toString() +
                ", Mensaje='" + Mensaje + '\'' +
                ", PrecioTotal=" + PrecioTotal +
                '}';
    }

    public static class DesayunoBuilder{
        private String Tipo;
        private Bebida Bebida;
        private PlatoPrincipal PlatoPrincipal;
        private Acompañamiento Acompañamiento;
        private String Mensaje;
        private double PrecioTotal;
        public DesayunoBuilder(){

        }

        public DesayunoBuilder setTipo(String tipo) {
            Tipo = tipo;
            return this;
        }

        public DesayunoBuilder setBebida(com.example.Desayuno.Domains.Bebida bebida) {
            Bebida = bebida;
            return this;
        }

        public DesayunoBuilder setPlatoPrincipal(com.example.Desayuno.Domains.PlatoPrincipal platoPrincipal) {
            PlatoPrincipal = platoPrincipal;
            return this;
        }

        public DesayunoBuilder setAcompañamiento(com.example.Desayuno.Domains.Acompañamiento acompañamiento) {
            Acompañamiento = acompañamiento;
            return this;
        }

        public DesayunoBuilder setMensaje(String mensaje) {
            Mensaje = mensaje;
            return this;
        }

        public DesayunoBuilder setPrecioTotal(double precioTotal) {
            PrecioTotal = precioTotal;
            return this;
        }

        public Desayuno Armar(){
            return new Desayuno(this);
        }
    }
}
