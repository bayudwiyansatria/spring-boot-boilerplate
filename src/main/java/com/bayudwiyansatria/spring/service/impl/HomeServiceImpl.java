package com.bayudwiyansatria.spring.service.impl;

import com.bayudwiyansatria.spring.model.Response;
import com.bayudwiyansatria.spring.service.HomeService;
import org.springframework.stereotype.Service;

/**
 * HomeMongoRepository
 * <p>
 * This interface represents the repository for the Home entity. It extends {@code MongoRepository}
 * to provide CRUD operations for the Home entity.
 *
 * <p>It is annotated with {@code @Repository} to indicate that it is a Spring Data repository.</p>
 *
 * @author Bayu Dwiyan Satria
 * @version 0.0.1
 * @since 0.0.1
 */
@Service
public class HomeServiceImpl implements HomeService {

    /**
     * HomeMongoRepository
     * <p>
     * This interface represents the repository for the Home entity. It extends
     * {@code MongoRepository} to provide CRUD operations for the Home entity.
     *
     * <p>It is annotated with {@code @Repository} to indicate that it is a Spring Data
     * repository.</p>
     *
     * @since 0.0.1
     */
    public HomeServiceImpl(
    ) {
    }

    /**
     * Returns a response indicating the success of the operation.
     *
     * @return a Response object with a success message, status, and no data
     * @since 0.0.1
     */
    public Response<?> getHome() {
        return new Response<>(
            "Success",
            true,
            null
        );
    }
}
