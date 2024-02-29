# # CustomerUpdateRequestPayload


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**em**| [**CustomerEMFields**](CustomerEMFields.md) |   | [optional]
**name**| **String** |   | [optional]
**surname**| **String** |   | [optional]
**email**| **String** |   | [optional]
**birthdate**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**gender**| **String** |   | [optional]
**enabled**| **Boolean** |   | [optional]
**source**| **String** |   | [optional]
**addresses**| [**List<CustomerAddressEntity>**](CustomerAddressEntity.md) |   | [optional]
**defaultBillingAddressId**| **String** |   | [optional]
**defaultShippingAddressId**| **String** |   | [optional]
**phoneNumber**| **String** |   | [optional]
**nationality**| **String** |   | [optional]
**groups**| **List<String>** |   | [optional]
**deleted**| **Boolean** |   | [optional]
**newsletters**| [**List<CustomerNewsletterRequest>**](CustomerNewsletterRequest.md) |   | [optional]
**attributes**| [**Map<String, ProtobufAny>**](ProtobufAny.md) |   | [optional] [default to new HashMap<>()]
**migratedPassword**| [**CustomerPassword**](CustomerPassword.md) |   | [optional]
**preferredLocale**| **String** |   | [optional]
**taxCode**| **String** |   | [optional]
**certifiedEmail**| **String** |   | [optional]
**sdiCode**| **String** |   | [optional]
**fiscalCode**| **String** |   | [optional]
**companyName**| **String** |   | [optional]
**additionalInfo**| **Object** |   | [optional]
**market**| **String** |   | [optional]
**externalIds**| **Map<String, String>** |   | [optional] [default to new HashMap<>()]
**consent**| [**CustomerCreateConsentRequest**](CustomerCreateConsentRequest.md) |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

