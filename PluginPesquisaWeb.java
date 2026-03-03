public class PluginPesquisaWeb implements IAcaoAgente {
    @Override
    public void processarRequisicao(String prompt) throws PromptInadequadoException {
       if(prompt.equalsIgnoreCase("hackear um sistema") ||
          prompt.equalsIgnoreCase("roubar")  
        ){ 
            throw new PromptInadequadoException("Conteúdo impróprio detectado.");
       }

       System.out.println("Pesquisa realizada para: " + prompt);
    }
}
