public class SimpleVector{
    
    private final int xVal;
    private final int yVal;

    public SimpleVector(int xVal, int yVal){
        this.xVal = xVal;
        this.yVal = yVal;
    }

    public String toString(){
        return "(" + xVal + "," + yVal + ")";
    }

    public boolean equals(SimpleVector v){
        if (v == null) return false;
        else if (this.xVal == v.xVal && this.yVal == v.yVal) return true; 
        else return false;
    }

    /*
    this is a vector with dimensions (x,y)
    other is a vector with dimensions (u,v)
    c is a constant so that c * (x,y) = (cx, cy)
    */

    public SimpleVector negation(){
        SimpleVector v = new SimpleVector(xVal, yVal);
        return v.multiply(-1);
    }

    public SimpleVector add(SimpleVector other){
        return new SimpleVector(this.xVal + other.xVal, this.yVal + other.yVal);
    }

    public SimpleVector subtract(SimpleVector other){
        return other.negation().add(this);
    }

    public SimpleVector multiply(int c){
        return new SimpleVector(this.xVal * c, this.yVal * c);
    }

    //unassessed
    public double length(){
        return Math.sqrt((Math.pow(this.xVal, 2) + (Math.pow(this.yVal, 2))));
    }

    public static SimpleVector sum(SimpleVector[] vectors){
        int sumx = 0;
        int sumy = 0;
        for(int i = 0; i < vectors.length; i++){
            sumx += vectors[i].xVal;
            sumy += vectors[i].yVal;
        }
        return new SimpleVector(sumx, sumy);
    }
}