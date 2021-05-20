package alamsyah.praktikumPBO.pertemuan2.guided.method;

public class TestPass {
    int nomer1, nomer2;

    public TestPass(int nomer1, int nomer2) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }

    // Passed by value
    void calculate(int m, int n) {
        m = m * 2;
        n = n / 2;
    }

    // Passed by reference
    void calculate(TestPass tp) {
        tp.nomer1 = tp.nomer1 * 10;
        tp.nomer2 = tp.nomer2 / 2;
    }
}
