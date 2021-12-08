public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0; //알맹이의 개수

    public GumballMachine(int count){ //처음에 몇개인지 지정
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public GumballMachine() {

    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("알맹이가 나가고 있습니다.");
            count = count - 1;
            if (count == 0) {
                System.out.println("더 이상 알맹이가 없습니다.");
                state = SOLD_OUT;
            }
            else {
                state = NO_QUARTER;
            }
        }
        else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        }
        else if (state == SOLD_OUT) {
            System.out.println("매진입니다.");
        }
        else if (state == HAS_QUARTER) {
            System.out.println("알맹이가 나갈 수 없습니다.");
        }
    }
}
