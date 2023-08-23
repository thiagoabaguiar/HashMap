package classes;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        
        AgendaEventos minhaAgenda = new AgendaEventos();
        
        System.out.println(minhaAgenda);
        minhaAgenda.adicionarEvento(LocalDate.of(2023, 10, 15), "UFC Brasil", "Maguila X Popó");
        minhaAgenda.adicionarEvento(LocalDate.of(2023, 12, 31), "Especial Fim de Ano", "Roberto Carlos em Israel");
        
        System.out.println(minhaAgenda);
    }
}
