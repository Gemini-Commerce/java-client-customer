/*
 * CDP Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import GeminiCommerce_Customer.ApiException;
import org.openapitools.client.model.CustomerAddCustomerToGroupRequest;
import org.openapitools.client.model.CustomerAddressCreateRequest;
import org.openapitools.client.model.CustomerAddressCustomerResponse;
import org.openapitools.client.model.CustomerAddressDeleteRequest;
import org.openapitools.client.model.CustomerAddressDeleteResponse;
import org.openapitools.client.model.CustomerAddressUpdateRequest;
import org.openapitools.client.model.CustomerAddressUpdateResponse;
import org.openapitools.client.model.CustomerAssignAgentRequest;
import org.openapitools.client.model.CustomerBulkUpdateRequest;
import org.openapitools.client.model.CustomerBulkUpdateResponse;
import org.openapitools.client.model.CustomerCreateGroupRequest;
import org.openapitools.client.model.CustomerCreateRequest;
import org.openapitools.client.model.CustomerCreateSubscriberRequest;
import org.openapitools.client.model.CustomerCustomerResponse;
import org.openapitools.client.model.CustomerDeleteGroupRequest;
import org.openapitools.client.model.CustomerDeleteGroupResponse;
import org.openapitools.client.model.CustomerFindByEmailRequest;
import org.openapitools.client.model.CustomerFindByIdRequest;
import org.openapitools.client.model.CustomerFindManyRequest;
import org.openapitools.client.model.CustomerFindManyResponse;
import org.openapitools.client.model.CustomerFindSubscriberByEmailRequest;
import org.openapitools.client.model.CustomerFindSubscriberByIdRequest;
import org.openapitools.client.model.CustomerGetGroupByCodeRequest;
import org.openapitools.client.model.CustomerGetGroupByIdRequest;
import org.openapitools.client.model.CustomerGrantPermissionsRequest;
import org.openapitools.client.model.CustomerGroupResponse;
import org.openapitools.client.model.CustomerListConsentsRequest;
import org.openapitools.client.model.CustomerListConsentsResponse;
import org.openapitools.client.model.CustomerListCustomersRequest;
import org.openapitools.client.model.CustomerListCustomersResponse;
import org.openapitools.client.model.CustomerListGroupsRequest;
import org.openapitools.client.model.CustomerListGroupsResponse;
import org.openapitools.client.model.CustomerRemoveCustomerFromGroupRequest;
import org.openapitools.client.model.CustomerRemoveDefaultAddressRequest;
import org.openapitools.client.model.CustomerRevokePermissionsRequest;
import org.openapitools.client.model.CustomerSearchRequest;
import org.openapitools.client.model.CustomerSearchResponse;
import org.openapitools.client.model.CustomerSetDefaultAddressRequest;
import org.openapitools.client.model.CustomerSetPermissionsRequest;
import org.openapitools.client.model.CustomerSubscriberResponse;
import org.openapitools.client.model.CustomerUnassignAgentRequest;
import org.openapitools.client.model.CustomerUnsubscribeRequest;
import org.openapitools.client.model.CustomerUnsubscribeResponse;
import org.openapitools.client.model.CustomerUpdateGroupRequest;
import org.openapitools.client.model.CustomerUpdateRequest;
import org.openapitools.client.model.CustomerUpdateSubscriberRequest;
import org.openapitools.client.model.GooglerpcStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerApi
 */
@Disabled
public class CustomerApiTest {

    private final CustomerApi api = new CustomerApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerAcquireSubscriberTest() throws ApiException {
        CustomerCreateSubscriberRequest body = null;
        CustomerSubscriberResponse response = api.customerAcquireSubscriber(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerAcquireSubscriber2Test() throws ApiException {
        CustomerCreateSubscriberRequest body = null;
        CustomerSubscriberResponse response = api.customerAcquireSubscriber2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerAcquireUnsubscriberTest() throws ApiException {
        CustomerUnsubscribeRequest body = null;
        CustomerUnsubscribeResponse response = api.customerAcquireUnsubscriber(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerAcquireUnsubscriber2Test() throws ApiException {
        CustomerUnsubscribeRequest body = null;
        CustomerUnsubscribeResponse response = api.customerAcquireUnsubscriber2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerAddCustomerToGroupTest() throws ApiException {
        CustomerAddCustomerToGroupRequest body = null;
        CustomerGroupResponse response = api.customerAddCustomerToGroup(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerAddCustomerToGroup2Test() throws ApiException {
        CustomerAddCustomerToGroupRequest body = null;
        CustomerGroupResponse response = api.customerAddCustomerToGroup2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerAssignAgentTest() throws ApiException {
        CustomerAssignAgentRequest body = null;
        Object response = api.customerAssignAgent(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerBulkUpdateTest() throws ApiException {
        CustomerBulkUpdateRequest body = null;
        CustomerBulkUpdateResponse response = api.customerBulkUpdate(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerBulkUpdate2Test() throws ApiException {
        CustomerBulkUpdateRequest body = null;
        CustomerBulkUpdateResponse response = api.customerBulkUpdate2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerCreateTest() throws ApiException {
        CustomerCreateRequest body = null;
        CustomerCustomerResponse response = api.customerCreate(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerCreate2Test() throws ApiException {
        CustomerCreateRequest body = null;
        CustomerCustomerResponse response = api.customerCreate2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerCreateAddressTest() throws ApiException {
        CustomerAddressCreateRequest body = null;
        CustomerAddressCustomerResponse response = api.customerCreateAddress(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerCreateAddress2Test() throws ApiException {
        CustomerAddressCreateRequest body = null;
        CustomerAddressCustomerResponse response = api.customerCreateAddress2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerCreateGroupTest() throws ApiException {
        CustomerCreateGroupRequest body = null;
        CustomerGroupResponse response = api.customerCreateGroup(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerCreateGroup2Test() throws ApiException {
        CustomerCreateGroupRequest body = null;
        CustomerGroupResponse response = api.customerCreateGroup2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerCreateSubscriberTest() throws ApiException {
        CustomerCreateSubscriberRequest body = null;
        CustomerSubscriberResponse response = api.customerCreateSubscriber(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerCreateSubscriber2Test() throws ApiException {
        CustomerCreateSubscriberRequest body = null;
        CustomerSubscriberResponse response = api.customerCreateSubscriber2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerDeleteAddressTest() throws ApiException {
        CustomerAddressDeleteRequest body = null;
        CustomerAddressDeleteResponse response = api.customerDeleteAddress(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerDeleteAddress2Test() throws ApiException {
        CustomerAddressDeleteRequest body = null;
        CustomerAddressDeleteResponse response = api.customerDeleteAddress2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerDeleteGroupTest() throws ApiException {
        CustomerDeleteGroupRequest body = null;
        CustomerDeleteGroupResponse response = api.customerDeleteGroup(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerDeleteGroup2Test() throws ApiException {
        CustomerDeleteGroupRequest body = null;
        CustomerDeleteGroupResponse response = api.customerDeleteGroup2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerFindTest() throws ApiException {
        CustomerFindManyRequest body = null;
        CustomerFindManyResponse response = api.customerFind(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerFind2Test() throws ApiException {
        CustomerFindManyRequest body = null;
        CustomerFindManyResponse response = api.customerFind2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerFindByEmailTest() throws ApiException {
        CustomerFindByEmailRequest body = null;
        CustomerCustomerResponse response = api.customerFindByEmail(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerFindByEmail2Test() throws ApiException {
        CustomerFindByEmailRequest body = null;
        CustomerCustomerResponse response = api.customerFindByEmail2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerFindByIdTest() throws ApiException {
        CustomerFindByIdRequest body = null;
        CustomerCustomerResponse response = api.customerFindById(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerFindById2Test() throws ApiException {
        CustomerFindByIdRequest body = null;
        CustomerCustomerResponse response = api.customerFindById2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerFindSubscriberByEmailTest() throws ApiException {
        CustomerFindSubscriberByEmailRequest body = null;
        CustomerSubscriberResponse response = api.customerFindSubscriberByEmail(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerFindSubscriberByEmail2Test() throws ApiException {
        CustomerFindSubscriberByEmailRequest body = null;
        CustomerSubscriberResponse response = api.customerFindSubscriberByEmail2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerFindSubscriberByIdTest() throws ApiException {
        CustomerFindSubscriberByIdRequest body = null;
        CustomerSubscriberResponse response = api.customerFindSubscriberById(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerFindSubscriberById2Test() throws ApiException {
        CustomerFindSubscriberByIdRequest body = null;
        CustomerSubscriberResponse response = api.customerFindSubscriberById2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerGetGroupByCodeTest() throws ApiException {
        CustomerGetGroupByCodeRequest body = null;
        CustomerGroupResponse response = api.customerGetGroupByCode(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerGetGroupByCode2Test() throws ApiException {
        CustomerGetGroupByCodeRequest body = null;
        CustomerGroupResponse response = api.customerGetGroupByCode2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerGetGroupByIdTest() throws ApiException {
        CustomerGetGroupByIdRequest body = null;
        CustomerGroupResponse response = api.customerGetGroupById(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerGetGroupById2Test() throws ApiException {
        CustomerGetGroupByIdRequest body = null;
        CustomerGroupResponse response = api.customerGetGroupById2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerGrantPermissionsTest() throws ApiException {
        CustomerGrantPermissionsRequest body = null;
        Object response = api.customerGrantPermissions(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerGrantPermissions2Test() throws ApiException {
        CustomerGrantPermissionsRequest body = null;
        Object response = api.customerGrantPermissions2(body);
        // TODO: test validations
    }

    /**
     * ListConsents list all consents of a customer
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerListConsentsTest() throws ApiException {
        CustomerListConsentsRequest body = null;
        CustomerListConsentsResponse response = api.customerListConsents(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerListCustomersTest() throws ApiException {
        CustomerListCustomersRequest body = null;
        CustomerListCustomersResponse response = api.customerListCustomers(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerListCustomers2Test() throws ApiException {
        CustomerListCustomersRequest body = null;
        CustomerListCustomersResponse response = api.customerListCustomers2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerListGroupsTest() throws ApiException {
        CustomerListGroupsRequest body = null;
        CustomerListGroupsResponse response = api.customerListGroups(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerListGroups2Test() throws ApiException {
        CustomerListGroupsRequest body = null;
        CustomerListGroupsResponse response = api.customerListGroups2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerRemoveCustomerFromGroupTest() throws ApiException {
        CustomerRemoveCustomerFromGroupRequest body = null;
        CustomerGroupResponse response = api.customerRemoveCustomerFromGroup(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerRemoveCustomerFromGroup2Test() throws ApiException {
        CustomerRemoveCustomerFromGroupRequest body = null;
        CustomerGroupResponse response = api.customerRemoveCustomerFromGroup2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerRemoveDefaultAddressTest() throws ApiException {
        CustomerRemoveDefaultAddressRequest body = null;
        CustomerCustomerResponse response = api.customerRemoveDefaultAddress(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerRemoveDefaultAddress2Test() throws ApiException {
        CustomerRemoveDefaultAddressRequest body = null;
        CustomerCustomerResponse response = api.customerRemoveDefaultAddress2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerRevokePermissionsTest() throws ApiException {
        CustomerRevokePermissionsRequest body = null;
        Object response = api.customerRevokePermissions(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerRevokePermissions2Test() throws ApiException {
        CustomerRevokePermissionsRequest body = null;
        Object response = api.customerRevokePermissions2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerSearchTest() throws ApiException {
        CustomerSearchRequest body = null;
        CustomerSearchResponse response = api.customerSearch(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerSearch2Test() throws ApiException {
        CustomerSearchRequest body = null;
        CustomerSearchResponse response = api.customerSearch2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerSetDefaultAddressTest() throws ApiException {
        CustomerSetDefaultAddressRequest body = null;
        CustomerCustomerResponse response = api.customerSetDefaultAddress(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerSetDefaultAddress2Test() throws ApiException {
        CustomerSetDefaultAddressRequest body = null;
        CustomerCustomerResponse response = api.customerSetDefaultAddress2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerSetPermissionsTest() throws ApiException {
        CustomerSetPermissionsRequest body = null;
        Object response = api.customerSetPermissions(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerSetPermissions2Test() throws ApiException {
        CustomerSetPermissionsRequest body = null;
        Object response = api.customerSetPermissions2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerUnassignAgentTest() throws ApiException {
        CustomerUnassignAgentRequest body = null;
        Object response = api.customerUnassignAgent(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerUnsubscribeTest() throws ApiException {
        CustomerUnsubscribeRequest body = null;
        CustomerUnsubscribeResponse response = api.customerUnsubscribe(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerUnsubscribe2Test() throws ApiException {
        CustomerUnsubscribeRequest body = null;
        CustomerUnsubscribeResponse response = api.customerUnsubscribe2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerUpdateTest() throws ApiException {
        CustomerUpdateRequest body = null;
        CustomerCustomerResponse response = api.customerUpdate(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerUpdate2Test() throws ApiException {
        CustomerUpdateRequest body = null;
        CustomerCustomerResponse response = api.customerUpdate2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerUpdateAddressTest() throws ApiException {
        CustomerAddressUpdateRequest body = null;
        CustomerAddressUpdateResponse response = api.customerUpdateAddress(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerUpdateAddress2Test() throws ApiException {
        CustomerAddressUpdateRequest body = null;
        CustomerAddressUpdateResponse response = api.customerUpdateAddress2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerUpdateGroupTest() throws ApiException {
        CustomerUpdateGroupRequest body = null;
        CustomerGroupResponse response = api.customerUpdateGroup(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerUpdateGroup2Test() throws ApiException {
        CustomerUpdateGroupRequest body = null;
        CustomerGroupResponse response = api.customerUpdateGroup2(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerUpdateSubscriberTest() throws ApiException {
        CustomerUpdateSubscriberRequest body = null;
        CustomerSubscriberResponse response = api.customerUpdateSubscriber(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerUpdateSubscriber2Test() throws ApiException {
        CustomerUpdateSubscriberRequest body = null;
        CustomerSubscriberResponse response = api.customerUpdateSubscriber2(body);
        // TODO: test validations
    }

}