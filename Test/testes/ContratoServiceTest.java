package testes;

import Mod24.DAO.ContratoDao;
import Mod24.DAO.IContratoDao;
import Mod24.DAO.mocks.ContratoDAOMock;
import Mod24.Service.ContratoService;
import Mod24.Service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {


    @Test
    public void salvarTest(){
        IContratoDao DAO = new ContratoDAOMock();
        IContratoService service = new ContratoService(DAO);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao DAO = new ContratoDao();
        IContratoService service = new ContratoService(DAO);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest(){
        IContratoDao DAO = new ContratoDAOMock();
        IContratoService service = new ContratoService(DAO);
        String contrato = service.buscarContrato();
        Assert.assertEquals("Sucesso ao buscar ID do contrato", contrato);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNobuscarComBancoDeDadosTest(){
        IContratoDao DAO = new ContratoDao();
        IContratoService service = new ContratoService(DAO);
        String contrato = service.buscarContrato();
        Assert.assertEquals("Sucesso ao buscar ID do contrato", contrato);

    }


    @Test
    public void excluirTest(){
        IContratoDao DAO = new ContratoDAOMock();
        IContratoService service = new ContratoService(DAO);
        String resultado = service.excluirContrato();
        Assert.assertEquals("Excluido com sucesso", resultado);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoexcluirComBancoDeDadosTest(){
        IContratoDao DAO = new ContratoDao();
        IContratoService service = new ContratoService(DAO);
        String resultado = service.excluirContrato();
        Assert.assertEquals("Excluido com sucesso", resultado);

    }

    @Test
    public void atualizarTest() {
        IContratoDao DAO = new ContratoDAOMock();
        IContratoService service = new ContratoService(DAO);
        String resultado = service.atualizarContrato();
        Assert.assertEquals("Contrato Atualizado com sucesso", resultado);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoatualizarComBancoDeDadosTest() {
        IContratoDao DAO = new ContratoDao();
        IContratoService service = new ContratoService(DAO);
        String resultado = service.atualizarContrato();
        Assert.assertEquals("Contrato Atualizado com sucesso", resultado);
    }

}

