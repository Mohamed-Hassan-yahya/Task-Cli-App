public enum TaskStatus {
    TODO("Todo"),
    IN_PROGRESS("In Progress"),
    DONE("Done");
    private String status;

    private TaskStatus(String status){
        this.status=status;
    }
    public String getStatus(){
        return status;
    }
}
