
public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Watcharasak Chuenchom"); 
        groupMembers.add("Settanan Liamyongyai"); 
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}