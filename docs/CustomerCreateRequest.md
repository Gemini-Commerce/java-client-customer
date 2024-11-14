# # CustomerCreateRequest


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   | [optional]
**em**| [**CustomerEMFields**](CustomerEMFields.md) |   | [optional]
**name**| **String** |   | [optional]
**surname**| **String** |   | [optional]
**email**| **String** |   | [optional]
**birthdate**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**gender**| **String** |   | [optional]
**enabled**| **Boolean** |   | [optional]
**source**| **String** |   | [optional]
**addresses**| [**List<CustomerAddressEntity>**](CustomerAddressEntity.md) |   | [optional] [default to new ArrayList<>()]
**phoneNumber**| **String** |   | [optional]
**nationality**| **String** |   | [optional]
**groups**| **List<String>** |   | [optional] [default to new ArrayList<>()]
**deleted**| **Boolean** |   | [optional]
**newsletters**| [**List<CustomerNewsletterRequest>**](CustomerNewsletterRequest.md) |   | [optional] [default to new ArrayList<>()]
**doNotNotify**| **Boolean** |   | [optional]
**attributes**| [**Map<String, ProtobufAny>**](ProtobufAny.md) |   | [optional] [default to new HashMap<>()]
**migratedPassword**| [**CustomerPassword**](CustomerPassword.md) |   | [optional]
**market**| **String** |   | [optional]
**preferredLocale**| **String** |   | [optional]
**taxCode**| **String** |   | [optional]
**certifiedEmail**| **String** |   | [optional]
**sdiCode**| **String** |   | [optional]
**fiscalCode**| **String** |   | [optional]
**companyName**| **String** |   | [optional]
**additionalInfo**| **Object** |   | [optional]
**externalIds**| **Map<String, String>** |   | [optional] [default to new HashMap<>()]
**consent**| [**CustomerCreateConsentRequest**](CustomerCreateConsentRequest.md) |   | [optional]
**aggregationId**| **String** |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

