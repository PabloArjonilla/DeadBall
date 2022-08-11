package es.pmac.deadball.usecases.team;

import es.pmac.deadball.domain.entity.team.Team;
import es.pmac.deadball.domain.entity.team.TeamRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.jbosslog.JBossLog;

@JBossLog
@RequiredArgsConstructor
public class FindTeamById {
    private final TeamRepository teamRepository;

    public Team execute(String id) {
        return teamRepository.findById(id);
    }
}
