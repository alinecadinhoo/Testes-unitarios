package Mod24.Service;

import Mod24.DAO.ClienteDAO;
import Mod24.DAO.ClienteDAOmock;
import Mod24.DAO.IClienteDAO;

public class ClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        //clienteDAO = new ClienteDAO();
        //clienteDAO = new ClienteDAOmock();
        this.clienteDAO = clienteDAO;

    }

    public String salvar() {
        clienteDAO.salvar();
        return "Sucesso";
    }

    public String buscarContrato() {
        clienteDAO.buscarContrato();
        return "Sucesso ao buscar ID do contrato";
    }

    public String excluirContrato() {
        clienteDAO.excluirContrato();
        return "Excluido com sucesso";
    }

    public String atualizarContrato() {
        clienteDAO.atualizarContrato();
        return "Contrato Atualizado com sucesso";
    }
}

