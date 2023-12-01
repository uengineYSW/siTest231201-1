package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class 의류상품HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<의류상품>> {

    @Override
    public EntityModel<의류상품> process(EntityModel<의류상품> model) {
        return model;
    }
}
