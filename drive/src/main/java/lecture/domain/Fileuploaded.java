package lecture.domain;

import lecture.domain.*;
import lecture.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Fileuploaded extends AbstractEvent {

    private Long id;

    public Fileuploaded(File aggregate){
        super(aggregate);
    }
    public Fileuploaded(){
        super();
    }
}
