public class Main {

    public static void main(String[] args) {

        String[] prompts = {
                "Olá, IA!",
                "",
                "Quero hackear um sistema",
                "Explique inteligência artificial",
                "Este é um prompt extremamente longo que ultrapassa o limite permitido pelo modelo atual e deve gerar erro"
        };

        List<AgenteIA> orquestrador = new ArrayList<>();
        orquestrador.add(new AgenteTexto(nome: "Agente chat#1"));
        orquestrador.add(new AgenteTexto(nome: "Agente chat#2"));

        for (AgenteIA agenteIA : orquestrador) {
            for (int i = 0; i < prompts.length; i++) {
                try {
                System.out.println("Processando Req #" + (i + 1) + "...");
                agente.processarPrompt(prompts[i]);
                
                } catch (PromptInadequadoException e) {
                imprimirLog("SEGURANÇA", e.getMessage());
                } catch (FalhaProcessamentoAgenteException e) {
                imprimirLog("DOMÍNIO", e.getMessage() + " | Timestamp: " + e.getTimestamp());
                } catch (ErroComunicacaoIAException e) {
                imprimirLog("INFRA", e.getMessage());
                }
                System.out.println("-----------------------------------");
            }
    }

    private static void imprimirLog(String nivel, String mensagem) {
        String hora = java.time.LocalTime.now().toString().substring(0, 8);
        System.err.println("[LOG-AGENTE] [" + hora + "] [" + nivel + "] Erro: " + mensagem);
    }
}