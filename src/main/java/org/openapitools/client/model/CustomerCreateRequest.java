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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.CustomerAddressEntity;
import org.openapitools.client.model.CustomerCreateConsentRequest;
import org.openapitools.client.model.CustomerEMFields;
import org.openapitools.client.model.CustomerNewsletterRequest;
import org.openapitools.client.model.CustomerPassword;
import org.openapitools.client.model.ProtobufAny;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Customer.JSON;

/**
 * CustomerCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T12:05:51.588588303Z[Etc/UTC]")
public class CustomerCreateRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_EM = "em";
  @SerializedName(SERIALIZED_NAME_EM)
  private CustomerEMFields em;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SURNAME = "surname";
  @SerializedName(SERIALIZED_NAME_SURNAME)
  private String surname;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_BIRTHDATE = "birthdate";
  @SerializedName(SERIALIZED_NAME_BIRTHDATE)
  private OffsetDateTime birthdate;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<CustomerAddressEntity> addresses;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_NEWSLETTERS = "newsletters";
  @SerializedName(SERIALIZED_NAME_NEWSLETTERS)
  private List<CustomerNewsletterRequest> newsletters;

  public static final String SERIALIZED_NAME_DO_NOT_NOTIFY = "doNotNotify";
  @SerializedName(SERIALIZED_NAME_DO_NOT_NOTIFY)
  private Boolean doNotNotify;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, ProtobufAny> attributes = new HashMap<>();

  public static final String SERIALIZED_NAME_MIGRATED_PASSWORD = "migratedPassword";
  @SerializedName(SERIALIZED_NAME_MIGRATED_PASSWORD)
  private CustomerPassword migratedPassword;

  public static final String SERIALIZED_NAME_MARKET = "market";
  @SerializedName(SERIALIZED_NAME_MARKET)
  private String market;

  public static final String SERIALIZED_NAME_PREFERRED_LOCALE = "preferredLocale";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LOCALE)
  private String preferredLocale;

  public static final String SERIALIZED_NAME_TAX_CODE = "taxCode";
  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private String taxCode;

  public static final String SERIALIZED_NAME_CERTIFIED_EMAIL = "certifiedEmail";
  @SerializedName(SERIALIZED_NAME_CERTIFIED_EMAIL)
  private String certifiedEmail;

  public static final String SERIALIZED_NAME_SDI_CODE = "sdiCode";
  @SerializedName(SERIALIZED_NAME_SDI_CODE)
  private String sdiCode;

  public static final String SERIALIZED_NAME_FISCAL_CODE = "fiscalCode";
  @SerializedName(SERIALIZED_NAME_FISCAL_CODE)
  private String fiscalCode;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private Object additionalInfo;

  public static final String SERIALIZED_NAME_EXTERNAL_IDS = "externalIds";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDS)
  private Map<String, String> externalIds = new HashMap<>();

  public static final String SERIALIZED_NAME_CONSENT = "consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private CustomerCreateConsentRequest consent;

  public static final String SERIALIZED_NAME_AGGREGATION_ID = "aggregationId";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_ID)
  private String aggregationId;

  public CustomerCreateRequest() {
  }

  public CustomerCreateRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public CustomerCreateRequest em(CustomerEMFields em) {
    this.em = em;
    return this;
  }

   /**
   * Get em
   * @return em
  **/
  @javax.annotation.Nullable
  public CustomerEMFields getEm() {
    return em;
  }

  public void setEm(CustomerEMFields em) {
    this.em = em;
  }


  public CustomerCreateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CustomerCreateRequest surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  @javax.annotation.Nullable
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }


  public CustomerCreateRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public CustomerCreateRequest birthdate(OffsetDateTime birthdate) {
    this.birthdate = birthdate;
    return this;
  }

   /**
   * Get birthdate
   * @return birthdate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(OffsetDateTime birthdate) {
    this.birthdate = birthdate;
  }


  public CustomerCreateRequest gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public CustomerCreateRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CustomerCreateRequest source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public CustomerCreateRequest addresses(List<CustomerAddressEntity> addresses) {
    this.addresses = addresses;
    return this;
  }

  public CustomerCreateRequest addAddressesItem(CustomerAddressEntity addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nullable
  public List<CustomerAddressEntity> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<CustomerAddressEntity> addresses) {
    this.addresses = addresses;
  }


  public CustomerCreateRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public CustomerCreateRequest nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @javax.annotation.Nullable
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public CustomerCreateRequest groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public CustomerCreateRequest addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public CustomerCreateRequest deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public CustomerCreateRequest newsletters(List<CustomerNewsletterRequest> newsletters) {
    this.newsletters = newsletters;
    return this;
  }

  public CustomerCreateRequest addNewslettersItem(CustomerNewsletterRequest newslettersItem) {
    if (this.newsletters == null) {
      this.newsletters = new ArrayList<>();
    }
    this.newsletters.add(newslettersItem);
    return this;
  }

   /**
   * Get newsletters
   * @return newsletters
  **/
  @javax.annotation.Nullable
  public List<CustomerNewsletterRequest> getNewsletters() {
    return newsletters;
  }

  public void setNewsletters(List<CustomerNewsletterRequest> newsletters) {
    this.newsletters = newsletters;
  }


  public CustomerCreateRequest doNotNotify(Boolean doNotNotify) {
    this.doNotNotify = doNotNotify;
    return this;
  }

   /**
   * Get doNotNotify
   * @return doNotNotify
  **/
  @javax.annotation.Nullable
  public Boolean getDoNotNotify() {
    return doNotNotify;
  }

  public void setDoNotNotify(Boolean doNotNotify) {
    this.doNotNotify = doNotNotify;
  }


  public CustomerCreateRequest attributes(Map<String, ProtobufAny> attributes) {
    this.attributes = attributes;
    return this;
  }

  public CustomerCreateRequest putAttributesItem(String key, ProtobufAny attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  public Map<String, ProtobufAny> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, ProtobufAny> attributes) {
    this.attributes = attributes;
  }


  public CustomerCreateRequest migratedPassword(CustomerPassword migratedPassword) {
    this.migratedPassword = migratedPassword;
    return this;
  }

   /**
   * Get migratedPassword
   * @return migratedPassword
  **/
  @javax.annotation.Nullable
  public CustomerPassword getMigratedPassword() {
    return migratedPassword;
  }

  public void setMigratedPassword(CustomerPassword migratedPassword) {
    this.migratedPassword = migratedPassword;
  }


  public CustomerCreateRequest market(String market) {
    this.market = market;
    return this;
  }

   /**
   * Get market
   * @return market
  **/
  @javax.annotation.Nullable
  public String getMarket() {
    return market;
  }

  public void setMarket(String market) {
    this.market = market;
  }


  public CustomerCreateRequest preferredLocale(String preferredLocale) {
    this.preferredLocale = preferredLocale;
    return this;
  }

   /**
   * Get preferredLocale
   * @return preferredLocale
  **/
  @javax.annotation.Nullable
  public String getPreferredLocale() {
    return preferredLocale;
  }

  public void setPreferredLocale(String preferredLocale) {
    this.preferredLocale = preferredLocale;
  }


  public CustomerCreateRequest taxCode(String taxCode) {
    this.taxCode = taxCode;
    return this;
  }

   /**
   * Get taxCode
   * @return taxCode
  **/
  @javax.annotation.Nullable
  public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }


  public CustomerCreateRequest certifiedEmail(String certifiedEmail) {
    this.certifiedEmail = certifiedEmail;
    return this;
  }

   /**
   * Get certifiedEmail
   * @return certifiedEmail
  **/
  @javax.annotation.Nullable
  public String getCertifiedEmail() {
    return certifiedEmail;
  }

  public void setCertifiedEmail(String certifiedEmail) {
    this.certifiedEmail = certifiedEmail;
  }


  public CustomerCreateRequest sdiCode(String sdiCode) {
    this.sdiCode = sdiCode;
    return this;
  }

   /**
   * Get sdiCode
   * @return sdiCode
  **/
  @javax.annotation.Nullable
  public String getSdiCode() {
    return sdiCode;
  }

  public void setSdiCode(String sdiCode) {
    this.sdiCode = sdiCode;
  }


  public CustomerCreateRequest fiscalCode(String fiscalCode) {
    this.fiscalCode = fiscalCode;
    return this;
  }

   /**
   * Get fiscalCode
   * @return fiscalCode
  **/
  @javax.annotation.Nullable
  public String getFiscalCode() {
    return fiscalCode;
  }

  public void setFiscalCode(String fiscalCode) {
    this.fiscalCode = fiscalCode;
  }


  public CustomerCreateRequest companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public CustomerCreateRequest additionalInfo(Object additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  public Object getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Object additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public CustomerCreateRequest externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public CustomerCreateRequest putExternalIdsItem(String key, String externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new HashMap<>();
    }
    this.externalIds.put(key, externalIdsItem);
    return this;
  }

   /**
   * Get externalIds
   * @return externalIds
  **/
  @javax.annotation.Nullable
  public Map<String, String> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }


  public CustomerCreateRequest consent(CustomerCreateConsentRequest consent) {
    this.consent = consent;
    return this;
  }

   /**
   * Get consent
   * @return consent
  **/
  @javax.annotation.Nullable
  public CustomerCreateConsentRequest getConsent() {
    return consent;
  }

  public void setConsent(CustomerCreateConsentRequest consent) {
    this.consent = consent;
  }


  public CustomerCreateRequest aggregationId(String aggregationId) {
    this.aggregationId = aggregationId;
    return this;
  }

   /**
   * Get aggregationId
   * @return aggregationId
  **/
  @javax.annotation.Nullable
  public String getAggregationId() {
    return aggregationId;
  }

  public void setAggregationId(String aggregationId) {
    this.aggregationId = aggregationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCreateRequest customerCreateRequest = (CustomerCreateRequest) o;
    return Objects.equals(this.tenantId, customerCreateRequest.tenantId) &&
        Objects.equals(this.em, customerCreateRequest.em) &&
        Objects.equals(this.name, customerCreateRequest.name) &&
        Objects.equals(this.surname, customerCreateRequest.surname) &&
        Objects.equals(this.email, customerCreateRequest.email) &&
        Objects.equals(this.birthdate, customerCreateRequest.birthdate) &&
        Objects.equals(this.gender, customerCreateRequest.gender) &&
        Objects.equals(this.enabled, customerCreateRequest.enabled) &&
        Objects.equals(this.source, customerCreateRequest.source) &&
        Objects.equals(this.addresses, customerCreateRequest.addresses) &&
        Objects.equals(this.phoneNumber, customerCreateRequest.phoneNumber) &&
        Objects.equals(this.nationality, customerCreateRequest.nationality) &&
        Objects.equals(this.groups, customerCreateRequest.groups) &&
        Objects.equals(this.deleted, customerCreateRequest.deleted) &&
        Objects.equals(this.newsletters, customerCreateRequest.newsletters) &&
        Objects.equals(this.doNotNotify, customerCreateRequest.doNotNotify) &&
        Objects.equals(this.attributes, customerCreateRequest.attributes) &&
        Objects.equals(this.migratedPassword, customerCreateRequest.migratedPassword) &&
        Objects.equals(this.market, customerCreateRequest.market) &&
        Objects.equals(this.preferredLocale, customerCreateRequest.preferredLocale) &&
        Objects.equals(this.taxCode, customerCreateRequest.taxCode) &&
        Objects.equals(this.certifiedEmail, customerCreateRequest.certifiedEmail) &&
        Objects.equals(this.sdiCode, customerCreateRequest.sdiCode) &&
        Objects.equals(this.fiscalCode, customerCreateRequest.fiscalCode) &&
        Objects.equals(this.companyName, customerCreateRequest.companyName) &&
        Objects.equals(this.additionalInfo, customerCreateRequest.additionalInfo) &&
        Objects.equals(this.externalIds, customerCreateRequest.externalIds) &&
        Objects.equals(this.consent, customerCreateRequest.consent) &&
        Objects.equals(this.aggregationId, customerCreateRequest.aggregationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, em, name, surname, email, birthdate, gender, enabled, source, addresses, phoneNumber, nationality, groups, deleted, newsletters, doNotNotify, attributes, migratedPassword, market, preferredLocale, taxCode, certifiedEmail, sdiCode, fiscalCode, companyName, additionalInfo, externalIds, consent, aggregationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCreateRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    em: ").append(toIndentedString(em)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    newsletters: ").append(toIndentedString(newsletters)).append("\n");
    sb.append("    doNotNotify: ").append(toIndentedString(doNotNotify)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    migratedPassword: ").append(toIndentedString(migratedPassword)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    preferredLocale: ").append(toIndentedString(preferredLocale)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    certifiedEmail: ").append(toIndentedString(certifiedEmail)).append("\n");
    sb.append("    sdiCode: ").append(toIndentedString(sdiCode)).append("\n");
    sb.append("    fiscalCode: ").append(toIndentedString(fiscalCode)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    aggregationId: ").append(toIndentedString(aggregationId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tenantId");
    openapiFields.add("em");
    openapiFields.add("name");
    openapiFields.add("surname");
    openapiFields.add("email");
    openapiFields.add("birthdate");
    openapiFields.add("gender");
    openapiFields.add("enabled");
    openapiFields.add("source");
    openapiFields.add("addresses");
    openapiFields.add("phoneNumber");
    openapiFields.add("nationality");
    openapiFields.add("groups");
    openapiFields.add("deleted");
    openapiFields.add("newsletters");
    openapiFields.add("doNotNotify");
    openapiFields.add("attributes");
    openapiFields.add("migratedPassword");
    openapiFields.add("market");
    openapiFields.add("preferredLocale");
    openapiFields.add("taxCode");
    openapiFields.add("certifiedEmail");
    openapiFields.add("sdiCode");
    openapiFields.add("fiscalCode");
    openapiFields.add("companyName");
    openapiFields.add("additionalInfo");
    openapiFields.add("externalIds");
    openapiFields.add("consent");
    openapiFields.add("aggregationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerCreateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerCreateRequest is not found in the empty JSON string", CustomerCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerCreateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      // validate the optional field `em`
      if (jsonObj.get("em") != null && !jsonObj.get("em").isJsonNull()) {
        CustomerEMFields.validateJsonElement(jsonObj.get("em"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("surname") != null && !jsonObj.get("surname").isJsonNull()) && !jsonObj.get("surname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `surname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("surname").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull()) {
        JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
        if (jsonArrayaddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
          }

          // validate the optional field `addresses` (array)
          for (int i = 0; i < jsonArrayaddresses.size(); i++) {
            CustomerAddressEntity.validateJsonElement(jsonArrayaddresses.get(i));
          };
        }
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull() && !jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }
      if (jsonObj.get("newsletters") != null && !jsonObj.get("newsletters").isJsonNull()) {
        JsonArray jsonArraynewsletters = jsonObj.getAsJsonArray("newsletters");
        if (jsonArraynewsletters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("newsletters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `newsletters` to be an array in the JSON string but got `%s`", jsonObj.get("newsletters").toString()));
          }

          // validate the optional field `newsletters` (array)
          for (int i = 0; i < jsonArraynewsletters.size(); i++) {
            CustomerNewsletterRequest.validateJsonElement(jsonArraynewsletters.get(i));
          };
        }
      }
      // validate the optional field `migratedPassword`
      if (jsonObj.get("migratedPassword") != null && !jsonObj.get("migratedPassword").isJsonNull()) {
        CustomerPassword.validateJsonElement(jsonObj.get("migratedPassword"));
      }
      if ((jsonObj.get("market") != null && !jsonObj.get("market").isJsonNull()) && !jsonObj.get("market").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `market` to be a primitive type in the JSON string but got `%s`", jsonObj.get("market").toString()));
      }
      if ((jsonObj.get("preferredLocale") != null && !jsonObj.get("preferredLocale").isJsonNull()) && !jsonObj.get("preferredLocale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferredLocale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferredLocale").toString()));
      }
      if ((jsonObj.get("taxCode") != null && !jsonObj.get("taxCode").isJsonNull()) && !jsonObj.get("taxCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxCode").toString()));
      }
      if ((jsonObj.get("certifiedEmail") != null && !jsonObj.get("certifiedEmail").isJsonNull()) && !jsonObj.get("certifiedEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certifiedEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certifiedEmail").toString()));
      }
      if ((jsonObj.get("sdiCode") != null && !jsonObj.get("sdiCode").isJsonNull()) && !jsonObj.get("sdiCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdiCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdiCode").toString()));
      }
      if ((jsonObj.get("fiscalCode") != null && !jsonObj.get("fiscalCode").isJsonNull()) && !jsonObj.get("fiscalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fiscalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fiscalCode").toString()));
      }
      if ((jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonNull()) && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      // validate the optional field `consent`
      if (jsonObj.get("consent") != null && !jsonObj.get("consent").isJsonNull()) {
        CustomerCreateConsentRequest.validateJsonElement(jsonObj.get("consent"));
      }
      if ((jsonObj.get("aggregationId") != null && !jsonObj.get("aggregationId").isJsonNull()) && !jsonObj.get("aggregationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggregationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerCreateRequest>() {
           @Override
           public void write(JsonWriter out, CustomerCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerCreateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerCreateRequest
  * @throws IOException if the JSON string is invalid with respect to CustomerCreateRequest
  */
  public static CustomerCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerCreateRequest.class);
  }

 /**
  * Convert an instance of CustomerCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
