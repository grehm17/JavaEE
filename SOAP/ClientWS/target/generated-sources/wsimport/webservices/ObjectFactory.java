
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteProduct_QNAME = new QName("http://webservices/", "deleteProduct");
    private final static QName _GetByCategory_QNAME = new QName("http://webservices/", "getByCategory");
    private final static QName _GetByName_QNAME = new QName("http://webservices/", "getByName");
    private final static QName _AddProdCategory_QNAME = new QName("http://webservices/", "addProdCategory");
    private final static QName _GetById_QNAME = new QName("http://webservices/", "getById");
    private final static QName _DeleteProductResponse_QNAME = new QName("http://webservices/", "deleteProductResponse");
    private final static QName _GetByNameResponse_QNAME = new QName("http://webservices/", "getByNameResponse");
    private final static QName _AddProdCategoryResponse_QNAME = new QName("http://webservices/", "addProdCategoryResponse");
    private final static QName _GetByCategoryResponse_QNAME = new QName("http://webservices/", "getByCategoryResponse");
    private final static QName _AddProductResponse_QNAME = new QName("http://webservices/", "addProductResponse");
    private final static QName _GetAllResponse_QNAME = new QName("http://webservices/", "getAllResponse");
    private final static QName _AddProduct_QNAME = new QName("http://webservices/", "addProduct");
    private final static QName _GetAll_QNAME = new QName("http://webservices/", "getAll");
    private final static QName _GetByIdResponse_QNAME = new QName("http://webservices/", "getByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetByIdResponse }
     * 
     */
    public GetByIdResponse createGetByIdResponse() {
        return new GetByIdResponse();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetByCategoryResponse }
     * 
     */
    public GetByCategoryResponse createGetByCategoryResponse() {
        return new GetByCategoryResponse();
    }

    /**
     * Create an instance of {@link AddProdCategoryResponse }
     * 
     */
    public AddProdCategoryResponse createAddProdCategoryResponse() {
        return new AddProdCategoryResponse();
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link GetByNameResponse }
     * 
     */
    public GetByNameResponse createGetByNameResponse() {
        return new GetByNameResponse();
    }

    /**
     * Create an instance of {@link GetById }
     * 
     */
    public GetById createGetById() {
        return new GetById();
    }

    /**
     * Create an instance of {@link AddProdCategory }
     * 
     */
    public AddProdCategory createAddProdCategory() {
        return new AddProdCategory();
    }

    /**
     * Create an instance of {@link GetByCategory }
     * 
     */
    public GetByCategory createGetByCategory() {
        return new GetByCategory();
    }

    /**
     * Create an instance of {@link GetByName }
     * 
     */
    public GetByName createGetByName() {
        return new GetByName();
    }

    /**
     * Create an instance of {@link DeleteProduct }
     * 
     */
    public DeleteProduct createDeleteProduct() {
        return new DeleteProduct();
    }

    /**
     * Create an instance of {@link ProductRep }
     * 
     */
    public ProductRep createProductRep() {
        return new ProductRep();
    }

    /**
     * Create an instance of {@link CategoryRep }
     * 
     */
    public CategoryRep createCategoryRep() {
        return new CategoryRep();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "deleteProduct")
    public JAXBElement<DeleteProduct> createDeleteProduct(DeleteProduct value) {
        return new JAXBElement<DeleteProduct>(_DeleteProduct_QNAME, DeleteProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getByCategory")
    public JAXBElement<GetByCategory> createGetByCategory(GetByCategory value) {
        return new JAXBElement<GetByCategory>(_GetByCategory_QNAME, GetByCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getByName")
    public JAXBElement<GetByName> createGetByName(GetByName value) {
        return new JAXBElement<GetByName>(_GetByName_QNAME, GetByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProdCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "addProdCategory")
    public JAXBElement<AddProdCategory> createAddProdCategory(AddProdCategory value) {
        return new JAXBElement<AddProdCategory>(_AddProdCategory_QNAME, AddProdCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getById")
    public JAXBElement<GetById> createGetById(GetById value) {
        return new JAXBElement<GetById>(_GetById_QNAME, GetById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "deleteProductResponse")
    public JAXBElement<DeleteProductResponse> createDeleteProductResponse(DeleteProductResponse value) {
        return new JAXBElement<DeleteProductResponse>(_DeleteProductResponse_QNAME, DeleteProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getByNameResponse")
    public JAXBElement<GetByNameResponse> createGetByNameResponse(GetByNameResponse value) {
        return new JAXBElement<GetByNameResponse>(_GetByNameResponse_QNAME, GetByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProdCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "addProdCategoryResponse")
    public JAXBElement<AddProdCategoryResponse> createAddProdCategoryResponse(AddProdCategoryResponse value) {
        return new JAXBElement<AddProdCategoryResponse>(_AddProdCategoryResponse_QNAME, AddProdCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getByCategoryResponse")
    public JAXBElement<GetByCategoryResponse> createGetByCategoryResponse(GetByCategoryResponse value) {
        return new JAXBElement<GetByCategoryResponse>(_GetByCategoryResponse_QNAME, GetByCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getByIdResponse")
    public JAXBElement<GetByIdResponse> createGetByIdResponse(GetByIdResponse value) {
        return new JAXBElement<GetByIdResponse>(_GetByIdResponse_QNAME, GetByIdResponse.class, null, value);
    }

}
