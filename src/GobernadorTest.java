import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GobernadorTest {
    @Test
    public void TestGobernador(){
        Gobernador presidente = new Presidente();
        Gobernador diputado = new Diputado();
        Gobernador ministro = new Ministro();

        diputado.setSiguienteJerarca(ministro);
        ministro.setSiguienteJerarca(presidente);

        Documento doc = new Documento("Documento súper confidencial", 1);

        String respuesta = diputado.procesarDocumento(doc);
        String respuestaEsperada = "soy el diputado";
        Assertions.assertEquals(respuestaEsperada, respuesta);
    }


}