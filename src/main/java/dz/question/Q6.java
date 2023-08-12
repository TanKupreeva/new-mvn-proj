package dz.question;

public class Q6 {

}
class One{
    public One foo(){return this;}
}

class Two extends One{
    public One foo() {return  this;}
}
class Three extends Two{
//    public One foo(){return  this;}
    public Two foo(){return  this;}
}
