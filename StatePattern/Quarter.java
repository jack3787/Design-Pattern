public class Quarter {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;

    GumballMachine g = new GumballMachine();

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전은 한 개만 넣어주세요.");
        }
        else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
        }
        else if (state == SOLD) {
            System.out.println("잠시만 기다려 주세요. 알맹이가 곧 나옵니다.");
        }
        else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전이 투입되었습니다.");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전이 반환됩니다.");
            state = NO_QUARTER;
        }
        else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        }
        else if (state == SOLD) {
            System.out.println("이미 알맹이를 뽑으셧습니다.");
        }
        else if (state == SOLD_OUT) {
            System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("손잡이는 한 번만 돌려주세요.");
        }
        else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        }
        else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        }
        else if (state == HAS_QUARTER) {
            System.out.println("손잡이를 돌리셨습니다.");
            state = SOLD;
            g.dispense();
        }
    }

}
