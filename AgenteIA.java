public abstract class AgenteIA {
    protected String nome;
    protected String status;

    public AgenteIA(String nome){
        this.nome = nome;

    }

    public String getNome(){
        return nome;
    }
    
    public abstract void processarRequisicao(String input) 
        throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException;

    
    public void conectarServidor()throws ErroComunicacaoIAException{
        if (Math.random() > 0.7) { // 30% de chance de falha
            throw new ErroComunicacaoIAException("Falha na conexão com o cluster de GPUs (Timeout).");
        }
        System.out.println("Servidor conectado");

    }


    // Método auxiliar de segurança (Exercício 1)
    public void verificarSeguranca(String prompt) throws PromptInadequadoException {
        String p = prompt.toLowerCase();
        if (p.contains("hackear") || p.contains("roubar")) {
            throw new PromptInadequadoException("Intenção maliciosa detectada pelo Safety Guard.");
        }
    }

    // Método de simulação de API (Exercício 2)
    private void chamarModeloExterno() throws ErroComunicacaoIAException {
        if (Math.random() > 0.7) { // 30% de chance de falha
            throw new ErroComunicacaoIAException("Falha na conexão com o cluster de GPUs (Timeout).");
        }
    }
}