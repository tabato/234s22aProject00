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
        members.add(new TeamMember("Jake Clause"));
        members.add(new TeamMember("Colin Conway"));
        members.add(new TeamMember("Luke Suppa"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
