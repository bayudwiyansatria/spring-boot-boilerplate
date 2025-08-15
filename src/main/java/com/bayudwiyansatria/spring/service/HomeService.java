package com.bayudwiyansatria.spring.service;

import com.bayudwiyansatria.spring.model.Response;
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
public interface HomeService {
    Response<?> getHome();
}