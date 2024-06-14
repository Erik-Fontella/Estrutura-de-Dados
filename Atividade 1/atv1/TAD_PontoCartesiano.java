package atv1;
public class TAD_PontoCartesiano {
    float x1, y1, x2, y2;
    float distancia;

    public TAD_PontoCartesiano(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public float distancia() {
        float dx = x2 - x1;
        float dy = y2 - y1;
        distancia = (float) Math.sqrt(dx * dx + dy * dy);
        return distancia;
    }
}
