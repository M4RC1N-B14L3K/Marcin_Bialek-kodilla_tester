public class AdvColors {
    public String colors() {
        String userSelected = UserDialogs.getUserSelection();
        String a = UserDialogs.getValue();
        String result = 0;
        switch (userSelected) {
            case "GRE":
                System.out.println("GREEN");
                break;                     // [1]
            case "BLE":
                System.out.println("Black");
                break;                     // [2]
            case "RED":
                System.out.println("RED");
                break;                     // [3]
            case "BLU":
                System.out.println("BLUE");
                break;                     // [4]
        }
        return result;
    }
}