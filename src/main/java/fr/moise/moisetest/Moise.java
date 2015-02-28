package fr.moise.moisetest;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by Moïse on 24/02/15.
 */
@Data
@AllArgsConstructor
public class Moise {

    @Id
    private final Long id;

    private final String content;
}
