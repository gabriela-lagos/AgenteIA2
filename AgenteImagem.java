public class AgenteImagem extends AgenteIA {
    
    
public AgenteImagem(String nome){
        super(nome);
        this.status = "status";
    }
    
    @Override
    public void processarRequisicao(String input){
        super.conectarServidor();
        String normalizado = prompt.toLowerCase();
        if (normalizado.contains("hackear") || normalizado.contains("roubar")) {
            throw new PromptInadequadoException("O prompt contém termos proibidos relacionados à segurança.");
        }
    }

}