
public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Settanan Liamyongyai Head"); 
        groupMembers.add("Watcharasak Chuenchom"); 
        groupMembers.add("Kamonchanok Sriha"); 
        groupMembers.add("Krit Limtreerattana"); 
        groupMembers.add("Tananan Tiyachaipanich"); 
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}