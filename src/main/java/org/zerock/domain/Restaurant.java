package org.zerock.domain;

import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Setter
@ToString
public class Restaurant {

    @Setter(onMethod = @__(@Autowired))
    private Chef chef;
}
