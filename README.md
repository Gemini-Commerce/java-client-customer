# openapi-java-client

CDP Service
- API version: v1
  - Build date: 2024-11-18T16:36:56.693582318Z[Etc/UTC]
  - Generator version: 7.9.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:v1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import GeminiCommerce.Customer.ApiClient;
import GeminiCommerce.Customer.ApiException;
import GeminiCommerce.Customer.Configuration;
import GeminiCommerce.Customer.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cdp.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    CustomerApi apiInstance = new CustomerApi(defaultClient);
    CustomerCreateSubscriberRequest body = new CustomerCreateSubscriberRequest(); // CustomerCreateSubscriberRequest | 
    try {
      CustomerSubscriberResponse result = apiInstance.customerAcquireSubscriber(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#customerAcquireSubscriber");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://cdp.api.gogemini.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CustomerApi* | [**customerAcquireSubscriber**](docs/CustomerApi.md#customerAcquireSubscriber) | **POST** /customer/acquire_subscriber | 
*CustomerApi* | [**customerAcquireSubscriber2**](docs/CustomerApi.md#customerAcquireSubscriber2) | **POST** /customer.Customer/AcquireSubscriber | 
*CustomerApi* | [**customerAcquireUnsubscriber**](docs/CustomerApi.md#customerAcquireUnsubscriber) | **POST** /customer/acquire_unsubscriber | 
*CustomerApi* | [**customerAcquireUnsubscriber2**](docs/CustomerApi.md#customerAcquireUnsubscriber2) | **POST** /customer.Customer/AcquireUnsubscriber | 
*CustomerApi* | [**customerAddCustomerToGroup**](docs/CustomerApi.md#customerAddCustomerToGroup) | **POST** /customer/add_customer_to_segment | 
*CustomerApi* | [**customerAddCustomerToGroup2**](docs/CustomerApi.md#customerAddCustomerToGroup2) | **POST** /customer.Customer/AddCustomerToGroup | 
*CustomerApi* | [**customerAssignAgent**](docs/CustomerApi.md#customerAssignAgent) | **POST** /customer.Customer/AssignAgent | 
*CustomerApi* | [**customerBulkUpdate**](docs/CustomerApi.md#customerBulkUpdate) | **POST** /customer/bulk_update | 
*CustomerApi* | [**customerBulkUpdate2**](docs/CustomerApi.md#customerBulkUpdate2) | **POST** /customer.Customer/BulkUpdate | 
*CustomerApi* | [**customerCreate**](docs/CustomerApi.md#customerCreate) | **POST** /customer/create | 
*CustomerApi* | [**customerCreate2**](docs/CustomerApi.md#customerCreate2) | **POST** /customer.Customer/Create | 
*CustomerApi* | [**customerCreateAddress**](docs/CustomerApi.md#customerCreateAddress) | **POST** /customer/create_address | 
*CustomerApi* | [**customerCreateAddress2**](docs/CustomerApi.md#customerCreateAddress2) | **POST** /customer.Customer/CreateAddress | 
*CustomerApi* | [**customerCreateGroup**](docs/CustomerApi.md#customerCreateGroup) | **POST** /customer/create_segment | 
*CustomerApi* | [**customerCreateGroup2**](docs/CustomerApi.md#customerCreateGroup2) | **POST** /customer.Customer/CreateGroup | 
*CustomerApi* | [**customerCreateSubscriber**](docs/CustomerApi.md#customerCreateSubscriber) | **POST** /customer/create_subscriber | 
*CustomerApi* | [**customerCreateSubscriber2**](docs/CustomerApi.md#customerCreateSubscriber2) | **POST** /customer.Customer/CreateSubscriber | 
*CustomerApi* | [**customerDeleteAddress**](docs/CustomerApi.md#customerDeleteAddress) | **POST** /customer/delete_address | 
*CustomerApi* | [**customerDeleteAddress2**](docs/CustomerApi.md#customerDeleteAddress2) | **POST** /customer.Customer/DeleteAddress | 
*CustomerApi* | [**customerDeleteGroup**](docs/CustomerApi.md#customerDeleteGroup) | **POST** /customer/delete_segment | 
*CustomerApi* | [**customerDeleteGroup2**](docs/CustomerApi.md#customerDeleteGroup2) | **POST** /customer.Customer/DeleteGroup | 
*CustomerApi* | [**customerFind**](docs/CustomerApi.md#customerFind) | **POST** /customer/find | 
*CustomerApi* | [**customerFind2**](docs/CustomerApi.md#customerFind2) | **POST** /customer.Customer/Find | 
*CustomerApi* | [**customerFindByEmail**](docs/CustomerApi.md#customerFindByEmail) | **POST** /customer/find_by_email | 
*CustomerApi* | [**customerFindByEmail2**](docs/CustomerApi.md#customerFindByEmail2) | **POST** /customer.Customer/FindByEmail | 
*CustomerApi* | [**customerFindById**](docs/CustomerApi.md#customerFindById) | **POST** /customer/find_by_id | 
*CustomerApi* | [**customerFindById2**](docs/CustomerApi.md#customerFindById2) | **POST** /customer.Customer/FindById | 
*CustomerApi* | [**customerFindSubscriberByEmail**](docs/CustomerApi.md#customerFindSubscriberByEmail) | **POST** /customer/find_subscriber_by_email | 
*CustomerApi* | [**customerFindSubscriberByEmail2**](docs/CustomerApi.md#customerFindSubscriberByEmail2) | **POST** /customer.Customer/FindSubscriberByEmail | 
*CustomerApi* | [**customerFindSubscriberById**](docs/CustomerApi.md#customerFindSubscriberById) | **POST** /customer/find_subscriber_by_id | 
*CustomerApi* | [**customerFindSubscriberById2**](docs/CustomerApi.md#customerFindSubscriberById2) | **POST** /customer.Customer/FindSubscriberById | 
*CustomerApi* | [**customerGetGroupByCode**](docs/CustomerApi.md#customerGetGroupByCode) | **POST** /customer/get_segment_by_code | 
*CustomerApi* | [**customerGetGroupByCode2**](docs/CustomerApi.md#customerGetGroupByCode2) | **POST** /customer.Customer/GetGroupByCode | 
*CustomerApi* | [**customerGetGroupById**](docs/CustomerApi.md#customerGetGroupById) | **POST** /customer/get_segment_by_id | 
*CustomerApi* | [**customerGetGroupById2**](docs/CustomerApi.md#customerGetGroupById2) | **POST** /customer.Customer/GetGroupById | 
*CustomerApi* | [**customerGrantPermissions**](docs/CustomerApi.md#customerGrantPermissions) | **POST** /customer/grant_permissions | 
*CustomerApi* | [**customerGrantPermissions2**](docs/CustomerApi.md#customerGrantPermissions2) | **POST** /customer.Customer/GrantPermissions | 
*CustomerApi* | [**customerListConsents**](docs/CustomerApi.md#customerListConsents) | **POST** /customer.Customer/ListConsents | ListConsents list all consents of a customer
*CustomerApi* | [**customerListCustomers**](docs/CustomerApi.md#customerListCustomers) | **POST** /customer/list_customers | 
*CustomerApi* | [**customerListCustomers2**](docs/CustomerApi.md#customerListCustomers2) | **POST** /customer.Customer/ListCustomers | 
*CustomerApi* | [**customerListGroups**](docs/CustomerApi.md#customerListGroups) | **POST** /customer/list_segments | 
*CustomerApi* | [**customerListGroups2**](docs/CustomerApi.md#customerListGroups2) | **POST** /customer.Customer/ListGroups | 
*CustomerApi* | [**customerRemoveCustomerFromGroup**](docs/CustomerApi.md#customerRemoveCustomerFromGroup) | **POST** /customer/remove_customer_from_segment | 
*CustomerApi* | [**customerRemoveCustomerFromGroup2**](docs/CustomerApi.md#customerRemoveCustomerFromGroup2) | **POST** /customer.Customer/RemoveCustomerFromGroup | 
*CustomerApi* | [**customerRemoveDefaultAddress**](docs/CustomerApi.md#customerRemoveDefaultAddress) | **POST** /customer/remove_default_address | 
*CustomerApi* | [**customerRemoveDefaultAddress2**](docs/CustomerApi.md#customerRemoveDefaultAddress2) | **POST** /customer.Customer/RemoveDefaultAddress | 
*CustomerApi* | [**customerRevokePermissions**](docs/CustomerApi.md#customerRevokePermissions) | **POST** /customer/revoke_permissions | 
*CustomerApi* | [**customerRevokePermissions2**](docs/CustomerApi.md#customerRevokePermissions2) | **POST** /customer.Customer/RevokePermissions | 
*CustomerApi* | [**customerSearch**](docs/CustomerApi.md#customerSearch) | **POST** /customer/search | 
*CustomerApi* | [**customerSearch2**](docs/CustomerApi.md#customerSearch2) | **POST** /customer.Customer/Search | 
*CustomerApi* | [**customerSetDefaultAddress**](docs/CustomerApi.md#customerSetDefaultAddress) | **POST** /customer/set_default_address | 
*CustomerApi* | [**customerSetDefaultAddress2**](docs/CustomerApi.md#customerSetDefaultAddress2) | **POST** /customer.Customer/SetDefaultAddress | 
*CustomerApi* | [**customerSetPermissions**](docs/CustomerApi.md#customerSetPermissions) | **POST** /customer/set_permissions | 
*CustomerApi* | [**customerSetPermissions2**](docs/CustomerApi.md#customerSetPermissions2) | **POST** /customer.Customer/SetPermissions | 
*CustomerApi* | [**customerUnassignAgent**](docs/CustomerApi.md#customerUnassignAgent) | **POST** /customer.Customer/UnassignAgent | 
*CustomerApi* | [**customerUnsubscribe**](docs/CustomerApi.md#customerUnsubscribe) | **POST** /customer/unsubscribe | 
*CustomerApi* | [**customerUnsubscribe2**](docs/CustomerApi.md#customerUnsubscribe2) | **POST** /customer.Customer/Unsubscribe | 
*CustomerApi* | [**customerUpdate**](docs/CustomerApi.md#customerUpdate) | **POST** /customer/update | 
*CustomerApi* | [**customerUpdate2**](docs/CustomerApi.md#customerUpdate2) | **POST** /customer.Customer/Update | 
*CustomerApi* | [**customerUpdateAddress**](docs/CustomerApi.md#customerUpdateAddress) | **POST** /customer/update_address | 
*CustomerApi* | [**customerUpdateAddress2**](docs/CustomerApi.md#customerUpdateAddress2) | **POST** /customer.Customer/UpdateAddress | 
*CustomerApi* | [**customerUpdateGroup**](docs/CustomerApi.md#customerUpdateGroup) | **POST** /customer/update_segment | 
*CustomerApi* | [**customerUpdateGroup2**](docs/CustomerApi.md#customerUpdateGroup2) | **POST** /customer.Customer/UpdateGroup | 
*CustomerApi* | [**customerUpdateSubscriber**](docs/CustomerApi.md#customerUpdateSubscriber) | **POST** /customer/update_subscriber | 
*CustomerApi* | [**customerUpdateSubscriber2**](docs/CustomerApi.md#customerUpdateSubscriber2) | **POST** /customer.Customer/UpdateSubscriber | 


## Documentation for Models

 - [BulkUpdateRequestAction](docs/BulkUpdateRequestAction.md)
 - [CustomerAddCustomerToGroupRequest](docs/CustomerAddCustomerToGroupRequest.md)
 - [CustomerAddressCreateRequest](docs/CustomerAddressCreateRequest.md)
 - [CustomerAddressCreateRequestKind](docs/CustomerAddressCreateRequestKind.md)
 - [CustomerAddressCustomerResponse](docs/CustomerAddressCustomerResponse.md)
 - [CustomerAddressCustomerResponseKind](docs/CustomerAddressCustomerResponseKind.md)
 - [CustomerAddressDeleteRequest](docs/CustomerAddressDeleteRequest.md)
 - [CustomerAddressDeleteResponse](docs/CustomerAddressDeleteResponse.md)
 - [CustomerAddressEntity](docs/CustomerAddressEntity.md)
 - [CustomerAddressEntityKind](docs/CustomerAddressEntityKind.md)
 - [CustomerAddressUpdateRequest](docs/CustomerAddressUpdateRequest.md)
 - [CustomerAddressUpdateResponse](docs/CustomerAddressUpdateResponse.md)
 - [CustomerAssignAgentRequest](docs/CustomerAssignAgentRequest.md)
 - [CustomerBulkUpdateRequest](docs/CustomerBulkUpdateRequest.md)
 - [CustomerBulkUpdateResponse](docs/CustomerBulkUpdateResponse.md)
 - [CustomerConsent](docs/CustomerConsent.md)
 - [CustomerConsentSource](docs/CustomerConsentSource.md)
 - [CustomerCreateConsentRequest](docs/CustomerCreateConsentRequest.md)
 - [CustomerCreateGroupRequest](docs/CustomerCreateGroupRequest.md)
 - [CustomerCreateRequest](docs/CustomerCreateRequest.md)
 - [CustomerCreateSubscriberRequest](docs/CustomerCreateSubscriberRequest.md)
 - [CustomerCustomerResponse](docs/CustomerCustomerResponse.md)
 - [CustomerDeleteGroupRequest](docs/CustomerDeleteGroupRequest.md)
 - [CustomerDeleteGroupResponse](docs/CustomerDeleteGroupResponse.md)
 - [CustomerEMFields](docs/CustomerEMFields.md)
 - [CustomerFindByEmailRequest](docs/CustomerFindByEmailRequest.md)
 - [CustomerFindByIdRequest](docs/CustomerFindByIdRequest.md)
 - [CustomerFindManyRequest](docs/CustomerFindManyRequest.md)
 - [CustomerFindManyRequestFilter](docs/CustomerFindManyRequestFilter.md)
 - [CustomerFindManyResponse](docs/CustomerFindManyResponse.md)
 - [CustomerFindSubscriberByEmailRequest](docs/CustomerFindSubscriberByEmailRequest.md)
 - [CustomerFindSubscriberByIdRequest](docs/CustomerFindSubscriberByIdRequest.md)
 - [CustomerGetGroupByCodeRequest](docs/CustomerGetGroupByCodeRequest.md)
 - [CustomerGetGroupByIdRequest](docs/CustomerGetGroupByIdRequest.md)
 - [CustomerGrantPermissionsRequest](docs/CustomerGrantPermissionsRequest.md)
 - [CustomerGroupResponse](docs/CustomerGroupResponse.md)
 - [CustomerListConsentsRequest](docs/CustomerListConsentsRequest.md)
 - [CustomerListConsentsResponse](docs/CustomerListConsentsResponse.md)
 - [CustomerListCustomersRequest](docs/CustomerListCustomersRequest.md)
 - [CustomerListCustomersRequestFilter](docs/CustomerListCustomersRequestFilter.md)
 - [CustomerListCustomersResponse](docs/CustomerListCustomersResponse.md)
 - [CustomerListGroupsRequest](docs/CustomerListGroupsRequest.md)
 - [CustomerListGroupsRequestFilter](docs/CustomerListGroupsRequestFilter.md)
 - [CustomerListGroupsResponse](docs/CustomerListGroupsResponse.md)
 - [CustomerNewsletterRequest](docs/CustomerNewsletterRequest.md)
 - [CustomerNewsletterResponse](docs/CustomerNewsletterResponse.md)
 - [CustomerPassword](docs/CustomerPassword.md)
 - [CustomerPermission](docs/CustomerPermission.md)
 - [CustomerRemoveCustomerFromGroupRequest](docs/CustomerRemoveCustomerFromGroupRequest.md)
 - [CustomerRemoveDefaultAddressRequest](docs/CustomerRemoveDefaultAddressRequest.md)
 - [CustomerRevokePermissionsRequest](docs/CustomerRevokePermissionsRequest.md)
 - [CustomerSearchRequest](docs/CustomerSearchRequest.md)
 - [CustomerSearchRequestFilter](docs/CustomerSearchRequestFilter.md)
 - [CustomerSearchResponse](docs/CustomerSearchResponse.md)
 - [CustomerSetDefaultAddressRequest](docs/CustomerSetDefaultAddressRequest.md)
 - [CustomerSetPermissionsRequest](docs/CustomerSetPermissionsRequest.md)
 - [CustomerSubscriberRequest](docs/CustomerSubscriberRequest.md)
 - [CustomerSubscriberResponse](docs/CustomerSubscriberResponse.md)
 - [CustomerSubscriberResponseWithNewsletterRequest](docs/CustomerSubscriberResponseWithNewsletterRequest.md)
 - [CustomerUnassignAgentRequest](docs/CustomerUnassignAgentRequest.md)
 - [CustomerUnsubscribeRequest](docs/CustomerUnsubscribeRequest.md)
 - [CustomerUnsubscribeResponse](docs/CustomerUnsubscribeResponse.md)
 - [CustomerUpdateGroupRequest](docs/CustomerUpdateGroupRequest.md)
 - [CustomerUpdateGroupRequestPayload](docs/CustomerUpdateGroupRequestPayload.md)
 - [CustomerUpdateRequest](docs/CustomerUpdateRequest.md)
 - [CustomerUpdateRequestPayload](docs/CustomerUpdateRequestPayload.md)
 - [CustomerUpdateSubscriberRequest](docs/CustomerUpdateSubscriberRequest.md)
 - [GooglerpcStatus](docs/GooglerpcStatus.md)
 - [ListConsentsRequestFilters](docs/ListConsentsRequestFilters.md)
 - [ListConsentsRequestSort](docs/ListConsentsRequestSort.md)
 - [ListCustomersRequestFilterDate](docs/ListCustomersRequestFilterDate.md)
 - [PasswordPasswordType](docs/PasswordPasswordType.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [ProtobufNullValue](docs/ProtobufNullValue.md)
 - [SortSortField](docs/SortSortField.md)
 - [SortSortOrder](docs/SortSortOrder.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Authorization"></a>
### Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

<a id="standardAuthorization"></a>
### standardAuthorization

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@gemini-commerce.com

