public class Ministro extends Gobernador{
    @Override
    public String procesarDocumento(Documento doc) {
        Integer accesoDoc = doc.getTipo();
        if(2 >= accesoDoc){
            System.out.println("Documento leído por el ministro! Lo paso al siguiente jerarca.");
        }else{
            System.out.println("soy el ministro, no lo leí, lo paso al siguiente jerarca");
        }
        if(getSiguienteJerarca() != null){
            getSiguienteJerarca().procesarDocumento(doc);
            return "soy el ministro";
        }
        return "sale mal";
    }
}
