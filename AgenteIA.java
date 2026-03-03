public abstract class AgenteIA {
    protected String nome;
    protected String status;

    public AgenteIA(String nome){
        this.nome = nome;

    }
    
    public void usarHabilidade(IAcaoAgente ferramenta, String comando) throws Exception {
        ferramenta.processarRequisicao(comando);
    }

    public String getNome(){
        return nome;
    }

    public void conectarServidor()throws ErroComunicacaoIAException{
        if (Math.random() > 0.7) { // 30% de chance de falha
            throw new ErroComunicacaoIAException("Falha na conexão com o cluster de GPUs (Timeout).");
        }
    System.out.println("Servidor conectado");

}
    
    public abstract void processarRequisicao(String input) 
        throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException;



    }