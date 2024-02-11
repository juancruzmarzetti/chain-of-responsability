public class Diputado extends Gobernador{
    @Override
    public String procesarDocumento(Documento doc) {
        Integer accesoDoc = doc.getTipo();
        if(1 == accesoDoc){
            System.out.println("Documento leído por el diputado! Lo paso al siguiente jerarca.");
        }else if(1 < accesoDoc){
            System.out.println("No pude leer el documento, lo paso al siguiente jerarca");
        }
        if(getSiguienteJerarca() != null){
            getSiguienteJerarca().procesarDocumento(doc);
            return "soy el diputado";
        }
        return "sale mal";
    }
}
