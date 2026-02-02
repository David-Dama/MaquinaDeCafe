package src.maquinasDeCafe.inventario;

public class IngredientesYStock {

    //Atributos
    private int agua;
    private int leche;
    private int cafe;
    private int cacao;
    private int te;
    private int azucar;
    private int vasos;
    private int cucharitas;
    private final int maxAgua;
    private final int maxLeche;
    private final int maxCafe;
    private final int maxCacao;
    private final int maxTe;
    private final int maxAzucar;
    private final int maxVasos;
    private final int maxCucharitas;

    //Constructor
    public IngredientesYStock(int maxAgua, int maxLeche, int maxCafe, int maxCacao, int maxTe, int maxAzucar, int maxVasos, int maxCucharitas) {
        this.maxAgua = maxAgua;
        this.maxLeche = maxLeche;
        this.maxCafe = maxCafe;
        this.maxCacao = maxCacao;
        this.maxTe = maxTe;
        this.maxAzucar = maxAzucar;
        this.maxVasos = maxVasos;
        this.maxCucharitas = maxCucharitas;
        recargaIngredientes();
        recargaStock();
    }

    //Getters y setters
    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getLeche() {
        return leche;
    }

    public void setLeche(int leche) {
        this.leche = leche;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCacao() {
        return cacao;
    }

    public void setCacao(int cacao) {
        this.cacao = cacao;
    }

    public int getTe() {
        return te;
    }

    public void setTe(int te) {
        this.te = te;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public int getVaso() {
        return vasos;
    }

    public void setVaso(int vasos) {
        this.vasos = vasos;
    }

    public int getCucharita() {
        return cucharitas;
    }

    public void setCucharita(int cucharitas) {
        this.cucharitas = cucharitas;
    }

    //ToString
    @Override
    public String toString() {
        return String.format("""
                Cantidad de cada ingredientes y stock:
                    Agua = %d
                    Leche = %d
                    Cafe = %d
                    Cacao = %d
                    Te = %d
                    Azúcar = %d
                    Vasos = %d
                    cucharitas = %d
                """, agua, leche, cafe, cacao, te, azucar, vasos, cucharitas);
    }

    //-----METODOS-----

    //Este metodo poner la cantidad de ingredientes al máximo
    public void recargaIngredientes() {
        agua = maxAgua;
        leche = maxLeche;
        cafe = maxCafe;
        cacao = maxCacao;
        te = maxTe;
        azucar = maxAzucar;
    }

    //Este metodo pone el stock al máximo
    public void recargaStock() {
        vasos = maxVasos;
        cucharitas = maxCucharitas;
    }
}
