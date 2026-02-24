public class AgenteTexto extends AgenteIA {

    public AgenteTexto(String nome){
        super(nome);
        this.status = "status";
    }
    
    @Override
    public void processarRequisicao(String input)
            throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException;
        this.status = "CONECTANDO";
        super.conectarServidor();

        if(prompt.lenght() > 500){
            throw new FalhaProcessamentoAgenteException("Prompt muito longo para o modelo atual.");
        }
}