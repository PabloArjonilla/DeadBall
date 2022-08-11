package es.pmac.deadball.domain.entity.player;

import es.pmac.deadball.domain.common.helpers.ValidatorHelper;
import es.pmac.deadball.domain.entity.team.Team;
import lombok.Builder;
import lombok.Data;


@Data
@Builder(toBuilder = true)
public class Player {

    private String id;
    private String name;
    private Team team;

    private Player(String id, String name, Team team) {
        this.id = id;
        this.name = name;
        this.team = team;
        Validate();
    }

    private void Validate() {
        ValidatorHelper.validateNonBlank(this.id, "id");
        ValidatorHelper.validateNonBlank(this.name, "name");
        //ValidatorHelper.validateNonNull(this.team, "team");
    }
}