package Calculator_OOP;

public class Calculation {
    int x;
    int y;

    Calculation(){
        x = 0;
        y = 0;
    }

    Calculation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int sum(){
        return x + y;
    }
    public int multiplication(){
        return this.x * this.y;
    }
}
