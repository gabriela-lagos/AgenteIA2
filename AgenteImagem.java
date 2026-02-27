public class AgenteImagem extends AgenteIA {
    
    
public AgenteImagem(String nome){
        super(nome);
        this.status = "status";
    }
    
    @Override
    public void processarRequisicao(String input)
            throws FalhaProcessamentoAgenteException,
                   PromptInadequadoException,
                   ErroComunicacaoIAException {
    
        String normalizado = input.toLowerCase();
        if (normalizado.contains("hackear") || normalizado.contains("roubar")) {
            throw new PromptInadequadoException("O prompt contém termos proibidos relacionados à segurança.");
        }
        ModuloConexao.validarLink();
        super.conectarServidor();
        System.out.println("Agente de Imagem ["+this.nome+"] processando requisição para: ["+input+"]");
    }

}