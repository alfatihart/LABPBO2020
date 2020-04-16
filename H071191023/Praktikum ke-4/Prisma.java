public class Prisma extends BangunRuang{
    double La,t,K;

    @Override
    public double Volume() {
        double volume = La*t;
        return volume;
    }
    @Override
    public double LuasPermukaan() {
        double LA = (2*La) + (K*t);
        return LA;
    }
    
}