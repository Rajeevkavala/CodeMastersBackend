package com.example.demo.TeamMembers;

import java.util.List;



public interface TeamMemberService {
    TeamMember addTeamMember(TeamMember teamMember);
    List<TeamMember> getAllTeamMembers(); // Corrected return type
}
