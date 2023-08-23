package classes;

import java.time.LocalDate;
import java.util.HashMap;

public class AgendaEventos {

    private HashMap<LocalDate, Evento> agendaEventos = new HashMap<>();

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {        
        Evento novoEvento = new Evento(nomeEvento, nomeAtracao);        
        agendaEventos.put(data, novoEvento);        
    }

    public void removerEvento(Evento evento) {
    }

    public void obterProximoEvento() {
    }

    public void exibirAgenda() {
    }

    @Override
    public String toString() {
        return "### Agenda de Eventos ### \n" + agendaEventos;
    }    
    

}
