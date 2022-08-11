package es.pmac.deadball.domain.entity.team;

import es.pmac.deadball.domain.common.helpers.ValidatorHelper;
import es.pmac.deadball.domain.entity.player.Player;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class Team {

    private String id;
    private String name;
    private List<Player> roster;

    private Team(String id, String name, List<Player> roster) {
        this.id = id;
        this.name = name;
        this.roster = roster;
        Validate();
    }

    private void Validate() {
        ValidatorHelper.validateNonBlank(this.id, "id");
        ValidatorHelper.validateNonBlank(this.name, "name");
        ValidatorHelper.validateNonNull(this.roster, "roster");
    }
}