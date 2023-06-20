package Mod24.Service;

import Mod24.DAO.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDAO;

    public ContratoService(IContratoDao dao) {
        this.contratoDAO = dao;
    }
    public String salvar() {
        contratoDAO.salvar();
        return "Sucesso";
    }

    @Override
    public String buscarContrato() {
        return "Sucesso ao buscar ID do contrato";
    }

    @Override
    public String excluirContrato() {
        return "Excluido com sucesso";
    }

    @Override
    public String atualizarContrato() {
        return "Contrato Atualizado com sucesso";
    }
}
