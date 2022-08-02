package Semana1;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Augusto", 60f, 1.70f);
        Paciente paciente2 = new Paciente("Ana", 66f, 1.63f);
        
        paciente1.resposta(paciente1);
        paciente2.resposta(paciente2);
    }
}
