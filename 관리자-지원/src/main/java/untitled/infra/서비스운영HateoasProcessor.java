package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class 서비스운영HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<서비스운영>> {

    @Override
    public EntityModel<서비스운영> process(EntityModel<서비스운영> model) {
        return model;
    }
}
