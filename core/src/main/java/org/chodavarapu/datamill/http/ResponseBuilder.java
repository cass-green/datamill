package org.chodavarapu.datamill.http;

/**
 * @author Ravi Chodavarapu (rchodava@gmail.com)
 */
public interface ResponseBuilder {
    Response noContent();
    Response notFound();
    Response ok();
}