public abstract class Gobernador{
    private Gobernador siguienteJerarca;
    public abstract String procesarDocumento(Documento doc);
    public void setSiguienteJerarca(Gobernador jerarca){
        siguienteJerarca = jerarca;
    };
    public Gobernador getSiguienteJerarca(){
        return siguienteJerarca;
    }
}
