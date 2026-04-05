package FactoryMethod;

public class ServicoDevolucao implements IServico {
    public String executar() {
        return "Devolução finalizada";
    }
    public String cancelar() {
        return "Devolução cancelada";
    }
}