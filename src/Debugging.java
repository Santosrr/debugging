public class Debugging {
    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main.");
        a ();
        System.out.println("\"finalizou do programa no método main.");
        
    }

    static void a() {
        System.out.println("entrou no método a.");
        b();
        System.out.println("finalizou o método a.");
    }

    static void b(){
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("finalizou o método b.");

    }

    static void c() {
        System.out.println("Entrou no método c.");
        Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
    
}
