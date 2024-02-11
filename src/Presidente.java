public class Presidente extends Gobernador{


    @Override
    public String procesarDocumento(Documento doc) {
        Integer accesoDoc = doc.getTipo();
        if(3 >= accesoDoc){
            System.out.println("Documento leído por el presidente! Lo paso al siguiente jerarca.");
        }else{
            System.out.println("¿¡Cómo que no lo puedo leer si soy el presidente!?");
        }
        if(getSiguienteJerarca() != null){
            getSiguienteJerarca().procesarDocumento(doc);
            return "soy el presidente";
        }
        return "sale mal";
    }
}
