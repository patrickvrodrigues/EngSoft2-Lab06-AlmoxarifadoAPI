package almoxarifado.teste.modelo;

import almoxarifado.builder.SolicitanteBuilder;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SolicitanteModeloTest {
    @Test
    public void deveCriarSolicitanteComBuilder(){
        Solicitante solicitante = SolicitanteBuilder.umSolicitante().constroi();

        Assert.assertEquals("Patrick Viegas", solicitante.getNome());
        Assert.assertEquals("99999999999", solicitante.getCpf());
        Assert.assertEquals("9899999999", solicitante.getTelefone());
    }

    @Test
    public void deveCriarSolicitanteCostumizadoComBuilder(){
        Solicitante solicitante = SolicitanteBuilder.umSolicitante()
                .comNome("Fernando")
                .comCpf("1234")
                .comTelefone("8888").constroi();
        Assert.assertEquals("Fernando", solicitante.getNome());
        Assert.assertEquals("1234", solicitante.getCpf());
        Assert.assertEquals("8888",solicitante.getTelefone());

    }
}
