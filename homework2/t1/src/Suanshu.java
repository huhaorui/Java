class Suanshu {
    private float a, b;

    float AddAB() {
        return a + b;
    }

    float SubAB() {
        return a - b;
    }

    float MultiAB() {
        return a * b;
    }

    float DivAB() {
        return a / b;
    }

    Suanshu() {
        a = 10;
        b = 5;
    }
}

class TestSuanshu {
    static public void main(String[] args) {
        Suanshu suanshu = new Suanshu();
        System.out.println(suanshu.AddAB());
        System.out.println(suanshu.SubAB());
        System.out.println(suanshu.MultiAB());
        System.out.println(suanshu.DivAB());
    }
}