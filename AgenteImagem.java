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

        if (input.equalsIgnoreCase("hackear") || input.equalsIgnoreCase("roubar")) {
            throw new PromptInadequadoException("O prompt contém termos proibidos relacionados à segurança.");
        }
        ModuloConexao.validarLink();
        super.conectarServidor();
        System.out.println("Agente de Imagem ["+this.nome+"] processando requisição para: ["+input+"]");
    }

}