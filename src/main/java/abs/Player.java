package abs;

import lombok.Data;

@Data
public abstract class Player implements Playable, Test{
    private int trackNumber;
    private String model;

}
