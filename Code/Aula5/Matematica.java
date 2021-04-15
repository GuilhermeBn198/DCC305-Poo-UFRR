public class Matematica {
    Double x;
    Double y;
    Double z;
    Double xx;
    Double yy;

    public Double getx(){
        return x;
    }
    public void setx(Double x){
        this.x = x;
    }
    public Double gety(){
        return y;
    }
    public void sety(Double y){
        this.y = y;
    }
    public Double getz(){
        return z;
    }
    public void setz(Double z){
        this.z = z;
    }
    public Double getxx(){
        return xx;
    }
    public void setxx(Double xx){
        this.xx = xx;
    }
    public Double getyy(){
        return yy;
    }
    public void setyy(Double yy){
        this.yy = yy;
    }

    public Double add(Double x, Double y){
        return x+y;
    }
    public Double add3(Double x, Double y, Double z){
        return x+y+z;
    } public Double add4(Double x, Double y, Double z,  Double xx){
        return x+y+z+xx;
    } public Double add5(Double x, Double y,  Double z, Double xx,  Double yy){
        return x+y+z+xx+yy;
    }
    public Double mult(Double x, Double y){
        return x*y;
    }
    public Double mult3(Double x, Double y, Double z){
        return x*y*z;
    }
    public Double mult4(Double x, Double y, Double z, Double xx){
        return x*y*z*xx;
    }
    public Double mult5(Double x, Double y, Double z, Double xx, Double yy){
        return x*y*z*xx*yy;
    }
    public Double sub(Double x, Double y){
        return x-y;
    }
    public Double sub3(Double x, Double y, Double z){
        return x-y-z;
    }
    public Double sub4(Double x, Double y, Double z, Double xx){
        return x-y-z-xx;
    }
    public Double sub5(Double x, Double y, Double z, Double xx, Double yy){
        return x-y-z-xx-yy;
    }
    public Double div(Double x, Double y){
        return x/y;
    }
    public Double div3(Double x, Double y,Double z){
        return x/y/z;
    }
    public Double div4(Double x, Double y, Double z, Double xx){
        return x/y/z/xx;
    }
    public Double div5(Double x, Double y, Double z, Double xx, Double yy){
        return x/y/z/xx/yy;
    }
    public Double pot(Double x, Double y){
        return Math.pow(x, y);
    }
    public Double pot3(Double x, Double y, Double z){
        return Math.pow(Math.pow(x, y), z);
    }
    public Double pot4(Double x, Double y, Double z, Double xx){
        return Math.pow(Math.pow(Math.pow(x, y), z), xx);
    }
    public Double pot5(Double x, Double y, Double z, Double xx, Double yy){
        return Math.pow(Math.pow(Math.pow(Math.pow(x, y), z), xx), yy);
    }
    


}
