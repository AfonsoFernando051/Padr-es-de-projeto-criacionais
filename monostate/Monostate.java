package monostate;

public class Monostate {
    // Variáveis de instância declaradas como estáticas
    private static int data = 0;

    // Métodos para acessar e modificar o estado
    public static int getData() {
        return data;
    }

    public static void setData(int newData) {
        data = newData;
    }
}
