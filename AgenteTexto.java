public class AgenteTexto extends AgenteIA {

    public AgenteTexto(String nome){
        super(nome);
        
    }
    
    @Override
    public void processarRequisicao(String input)
            throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException{
            
            if(input.length() > 500){
                throw new FalhaProcessamentoAgenteException("Prompt muito longo para o modelo atual.");
            }

            else if(input.length() == 0){
                throw new FalhaProcessamentoAgenteException("Prompt vazio não é permitido.");
            }

        ModuloConexao.validarLink();
        super.conectarServidor();
        System.out.println("Agente de Texto ["+this.nome+"] processando requisição para: ["+input+"]");

    }    
}
        
        

        