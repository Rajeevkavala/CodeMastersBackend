package com.example.demo.TeamMembers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/team-members")
@CrossOrigin(origins = "https://codemasters-edu.netlify.app/")
public class TeamMemberController {
    @Autowired
    private TeamMemberService service;

    @PostMapping
    public TeamMember addTeamMember(@RequestBody TeamMember teamMember) {
        return service.addTeamMember(teamMember);
    }

    @GetMapping
    public List<TeamMember> getAllTeamMembers() {
        return service.getAllTeamMembers();
    }
}
