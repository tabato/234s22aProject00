public class TeamSix extends Team
{
    public TeamSix(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Thomas Abato"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
