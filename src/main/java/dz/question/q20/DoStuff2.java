package dz.question.q20;

public interface DoStuff2 {
    float getRange(int low, int high);
}
interface DoMore{
    float getAvg(int a, int b, int c);}

abstract class DoAbstract implements DoStuff2, DoMore{}
class DoStuff implements DoStuff2{
    @Override
    public float getRange(int x, int y) {
        return 3.14f;
    }
}
interface DoAll extends DoMore{

    float getAvg(int a, int b, int c,int d);
}
class TT implements DoAll {

    @Override
    public float getAvg(int a, int b, int c) {
        return 0;
    }

    @Override
    public float getAvg(int a, int b, int c, int d) {
        return 0;
    }
}