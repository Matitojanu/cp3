public class SurfaceArea {
    static float rectangle(float a, float b){
        return a*b;
    }

    static float circle(float radius){
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    static float triangle(float base, float height){
        return (base*height)/2;
    }
}
