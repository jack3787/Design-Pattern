public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        Quarter quarter = new Quarter();

        System.out.println(gumballMachine);

        quarter.insertQuarter();
        quarter.turnCrank();

        System.out.println(gumballMachine);

        quarter.insertQuarter();
        quarter.turnCrank();
        quarter.insertQuarter();
        quarter.turnCrank();
        quarter.ejectQuarter();

        System.out.println(gumballMachine);

        quarter.insertQuarter();
        quarter.insertQuarter();
        quarter.turnCrank();
        quarter.insertQuarter();
        quarter.turnCrank();
        quarter.insertQuarter();
        quarter.turnCrank();

        System.out.println(gumballMachine);
    }
}
