package testes;

import Mod24.DAO.ClienteDAO;
import Mod24.DAO.ClienteDAOmock;
import Mod24.DAO.IClienteDAO;
import Mod24.Service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDAO mockDAO = new ClienteDAOmock();
        ClienteService service = new ClienteService(mockDAO);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNosalvarTest() {
        IClienteDAO mockDAO = new ClienteDAO();
        ClienteService service = new ClienteService(mockDAO);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IClienteDAO mockDAO = new ClienteDAOmock();
        ClienteService service = new ClienteService(mockDAO);
        String contrato = service.buscarContrato();
        Assert.assertEquals("Sucesso ao buscar ID do contrato", contrato);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest() {
        IClienteDAO mockDAO = new ClienteDAO();
        ClienteService service = new ClienteService(mockDAO);
        String contrato = service.buscarContrato();
        Assert.assertEquals("Sucesso ao buscar ID do contrato", contrato);
    }

    @Test
    public void excluirTest() {
        IClienteDAO mockDAO = new ClienteDAOmock();
        ClienteService service = new ClienteService(mockDAO);
        String resultado = service.excluirContrato();
        Assert.assertEquals("Excluido com sucesso", resultado);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest() {
        IClienteDAO mockDAO = new ClienteDAO();
        ClienteService service = new ClienteService(mockDAO);
        String resultado = service.excluirContrato();
        Assert.assertEquals("Excluido com sucesso", resultado);
    }

    @Test
    public void atualizarTest() {
        IClienteDAO mockDAO = new ClienteDAOmock();
        ClienteService service = new ClienteService(mockDAO);
        String resultado = service.atualizarContrato();
        Assert.assertEquals("Contrato Atualizado com sucesso", resultado);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarTest() {
        IClienteDAO mockDAO = new ClienteDAO();
        ClienteService service = new ClienteService(mockDAO);
        String resultado = service.atualizarContrato();
        Assert.assertEquals("Contrato Atualizado com sucesso", resultado);

    }


}
