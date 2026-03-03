import java.util.ArrayList;
import java.util.List;

public class DashboardAgenteAvancado {

    public static void main(String[] args) {

        String[] prompts = {
                "Olá, IA!",
                "",
                "Quero hackear um sistema",
                "Explique inteligência artificial",
                "Este é um prompt extremamente longo que ultrapassa o limite permitido pelo modelo atual e deve gerar erro"
        };

        List<AgenteIA> orquestrador = new ArrayList<>();
        orquestrador.add(new AgenteTexto("Agente chat#1"));
        orquestrador.add(new AgenteImagem("Agente chat#2"));

        for (AgenteIA agenteIA : orquestrador) {
            for (int i = 0; i < prompts.length; i++) {
                System.out.println("Processando Req #" + (i + 1) + "...");
                try {
                
                    agenteIA.usarHabilidade(new PluginPesquisaWeb(), prompts[i]);
                    agenteIA.usarHabilidade(new PluginGeradorCodigo(), prompts[i]);
                } catch (Exception e) {
                    imprimirLog("ERRO GERAL", e.getMessage());
                }
                System.out.println("-----------------------------------");
            }
    }
}
    private static void imprimirLog(String nivel, String mensagem) {
        String hora = java.time.LocalTime.now().toString().substring(0, 8);
        System.err.println("[LOG-AGENTE] [" + hora + "] [" + nivel + "] Erro: " + mensagem);
    }
}