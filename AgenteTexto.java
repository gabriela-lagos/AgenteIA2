public class AgenteTexto extends AgenteIA {

    public AgenteTexto(String nome){
        super(nome);
        
    }
    
    @Override
    public void processarRequisicao(String prompt)
            throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException{
            
            if(prompt.lenght() > 500){
                throw new FalhaProcessamentoAgenteException("Prompt muito longo para o modelo atual.");
            }

            super.conectarServidor();
            System.out.println("Agente de Texto ["+this.nome+"] gerando resposta para: ["+prompt+"]");


    }    
}
        
        

        