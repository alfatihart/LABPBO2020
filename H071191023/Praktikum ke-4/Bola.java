public class Bola extends BangunRuang{

    double r;
    @Override
    public double Volume() {
        double volume = (4*3.14*r)/3;
        return volume;
    }
    @Override
    public double LuasPermukaan() {
        double LP = 4*3.14*r*r;
        return LP; 
    }

}