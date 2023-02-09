package TicTacToe;

public enum CellValue {
    X("X")
    ,
    O("O"),
    EMPTY(" ");

    private final String value;
    CellValue(String value){
    this.value = value;
    }

    public String printValue(){
        return value;
    }

}







