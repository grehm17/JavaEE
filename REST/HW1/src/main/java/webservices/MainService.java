package webservices;

import entities.representations.ProductRep;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;

@Path("/")
@Api(value = "MainService", description = "JAX-RS")
public class MainService {
    @Inject
    private SubService subService;

    @GET
    @Path("/products/all")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get all products")
    public Collection<ProductRep> getAllProducts() {
        return subService.getAll();
    }

    @GET
    @Path("/products/byID/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get product by id")
    public ProductRep getProductById(@ApiParam(name = "id", value = "Product id to get") @PathParam("id") long id) {
        return subService.getById(id);
    }

    @GET
    @Path("/products/byNAME/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get product by name")
    public ProductRep getProductByName(@ApiParam(name = "name", value = "Product name to get") @PathParam("name") String name) {
        return subService.getByName(name);
    }

    @GET
    @Path("/products/byCAT/{catId}")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get product by id")
    public Collection<ProductRep> getProductByCategory(@ApiParam(name = "catId", value = "Product id to get") @PathParam("catId") long catId) {
        return subService.getByCategory(catId);
    }

    @POST
    @Path("/products")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_HTML)
    @ApiOperation(value = "Add new product")
    public Response addProduct(@ApiParam(value = "New product to add") ProductRep product) {
        long id = subService.addProduct(product);
        return Response.accepted(String.format("New product with id %d created", id)).build();
    }

    @DELETE
    @Path("/products/{id}")
    @ApiOperation(value = "Delete product")
    public Response deleteProduct(@ApiParam(name = "id", value = "Product id to delete") @PathParam("id") long id) {
        subService.deleteProduct(id);
        return Response.accepted().build();
    }

}
