package com.example.demo.TeamMembers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamMemberServiceImpl implements TeamMemberService {
    @Autowired
    private TeamMemberRepository repository;

    @Override
    public TeamMember addTeamMember(TeamMember teamMember) {
        return repository.save(teamMember);
    }

    @Override
    public List<TeamMember> getAllTeamMembers() {
        return repository.findAll();
    }
}
