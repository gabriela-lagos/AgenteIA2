public class PluginGeradorCodigo implements IAcaoAgente {
    @Override
    public void processarRequisicao(String prompt) throws PromptInadequadoException {
        if(prompt.length() > 500){
            throw new PromptInadequadoException("Prompt muito longo para geração de código.");
        }
       
    }
}