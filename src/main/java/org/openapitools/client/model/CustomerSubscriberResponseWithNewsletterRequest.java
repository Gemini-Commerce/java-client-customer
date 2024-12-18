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
import java.util.List;
import org.openapitools.client.model.CustomerCreateConsentRequest;
import org.openapitools.client.model.CustomerEMFields;
import org.openapitools.client.model.CustomerNewsletterRequest;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Customer.JSON;

/**
 * CustomerSubscriberResponseWithNewsletterRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T16:36:56.693582318Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CustomerSubscriberResponseWithNewsletterRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_BIRTHDATE = "birthdate";
  @SerializedName(SERIALIZED_NAME_BIRTHDATE)
  private OffsetDateTime birthdate;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_EM = "em";
  @SerializedName(SERIALIZED_NAME_EM)
  private CustomerEMFields em;

  public static final String SERIALIZED_NAME_PREFERRED_LOCALE = "preferredLocale";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LOCALE)
  private String preferredLocale;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_NEWSLETTERS = "newsletters";
  @SerializedName(SERIALIZED_NAME_NEWSLETTERS)
  private List<CustomerNewsletterRequest> newsletters = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONSENT = "consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private CustomerCreateConsentRequest consent;

  public CustomerSubscriberResponseWithNewsletterRequest() {
  }

  public CustomerSubscriberResponseWithNewsletterRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CustomerSubscriberResponseWithNewsletterRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CustomerSubscriberResponseWithNewsletterRequest lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Get lastname
   * @return lastname
   */
  @javax.annotation.Nullable
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public CustomerSubscriberResponseWithNewsletterRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public CustomerSubscriberResponseWithNewsletterRequest country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public CustomerSubscriberResponseWithNewsletterRequest gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public CustomerSubscriberResponseWithNewsletterRequest birthdate(OffsetDateTime birthdate) {
    this.birthdate = birthdate;
    return this;
  }

  /**
   * Get birthdate
   * @return birthdate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(OffsetDateTime birthdate) {
    this.birthdate = birthdate;
  }


  public CustomerSubscriberResponseWithNewsletterRequest nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
   */
  @javax.annotation.Nullable
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public CustomerSubscriberResponseWithNewsletterRequest em(CustomerEMFields em) {
    this.em = em;
    return this;
  }

  /**
   * Get em
   * @return em
   */
  @javax.annotation.Nullable
  public CustomerEMFields getEm() {
    return em;
  }

  public void setEm(CustomerEMFields em) {
    this.em = em;
  }


  public CustomerSubscriberResponseWithNewsletterRequest preferredLocale(String preferredLocale) {
    this.preferredLocale = preferredLocale;
    return this;
  }

  /**
   * Get preferredLocale
   * @return preferredLocale
   */
  @javax.annotation.Nullable
  public String getPreferredLocale() {
    return preferredLocale;
  }

  public void setPreferredLocale(String preferredLocale) {
    this.preferredLocale = preferredLocale;
  }


  public CustomerSubscriberResponseWithNewsletterRequest createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CustomerSubscriberResponseWithNewsletterRequest updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CustomerSubscriberResponseWithNewsletterRequest newsletters(List<CustomerNewsletterRequest> newsletters) {
    this.newsletters = newsletters;
    return this;
  }

  public CustomerSubscriberResponseWithNewsletterRequest addNewslettersItem(CustomerNewsletterRequest newslettersItem) {
    if (this.newsletters == null) {
      this.newsletters = new ArrayList<>();
    }
    this.newsletters.add(newslettersItem);
    return this;
  }

  /**
   * Get newsletters
   * @return newsletters
   */
  @javax.annotation.Nullable
  public List<CustomerNewsletterRequest> getNewsletters() {
    return newsletters;
  }

  public void setNewsletters(List<CustomerNewsletterRequest> newsletters) {
    this.newsletters = newsletters;
  }


  public CustomerSubscriberResponseWithNewsletterRequest consent(CustomerCreateConsentRequest consent) {
    this.consent = consent;
    return this;
  }

  /**
   * Get consent
   * @return consent
   */
  @javax.annotation.Nullable
  public CustomerCreateConsentRequest getConsent() {
    return consent;
  }

  public void setConsent(CustomerCreateConsentRequest consent) {
    this.consent = consent;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CustomerSubscriberResponseWithNewsletterRequest instance itself
   */
  public CustomerSubscriberResponseWithNewsletterRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerSubscriberResponseWithNewsletterRequest customerSubscriberResponseWithNewsletterRequest = (CustomerSubscriberResponseWithNewsletterRequest) o;
    return Objects.equals(this.id, customerSubscriberResponseWithNewsletterRequest.id) &&
        Objects.equals(this.name, customerSubscriberResponseWithNewsletterRequest.name) &&
        Objects.equals(this.lastname, customerSubscriberResponseWithNewsletterRequest.lastname) &&
        Objects.equals(this.email, customerSubscriberResponseWithNewsletterRequest.email) &&
        Objects.equals(this.country, customerSubscriberResponseWithNewsletterRequest.country) &&
        Objects.equals(this.gender, customerSubscriberResponseWithNewsletterRequest.gender) &&
        Objects.equals(this.birthdate, customerSubscriberResponseWithNewsletterRequest.birthdate) &&
        Objects.equals(this.nationality, customerSubscriberResponseWithNewsletterRequest.nationality) &&
        Objects.equals(this.em, customerSubscriberResponseWithNewsletterRequest.em) &&
        Objects.equals(this.preferredLocale, customerSubscriberResponseWithNewsletterRequest.preferredLocale) &&
        Objects.equals(this.createdAt, customerSubscriberResponseWithNewsletterRequest.createdAt) &&
        Objects.equals(this.updatedAt, customerSubscriberResponseWithNewsletterRequest.updatedAt) &&
        Objects.equals(this.newsletters, customerSubscriberResponseWithNewsletterRequest.newsletters) &&
        Objects.equals(this.consent, customerSubscriberResponseWithNewsletterRequest.consent)&&
        Objects.equals(this.additionalProperties, customerSubscriberResponseWithNewsletterRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastname, email, country, gender, birthdate, nationality, em, preferredLocale, createdAt, updatedAt, newsletters, consent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSubscriberResponseWithNewsletterRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    em: ").append(toIndentedString(em)).append("\n");
    sb.append("    preferredLocale: ").append(toIndentedString(preferredLocale)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    newsletters: ").append(toIndentedString(newsletters)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("lastname");
    openapiFields.add("email");
    openapiFields.add("country");
    openapiFields.add("gender");
    openapiFields.add("birthdate");
    openapiFields.add("nationality");
    openapiFields.add("em");
    openapiFields.add("preferredLocale");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("newsletters");
    openapiFields.add("consent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomerSubscriberResponseWithNewsletterRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerSubscriberResponseWithNewsletterRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerSubscriberResponseWithNewsletterRequest is not found in the empty JSON string", CustomerSubscriberResponseWithNewsletterRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("lastname") != null && !jsonObj.get("lastname").isJsonNull()) && !jsonObj.get("lastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastname").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      // validate the optional field `em`
      if (jsonObj.get("em") != null && !jsonObj.get("em").isJsonNull()) {
        CustomerEMFields.validateJsonElement(jsonObj.get("em"));
      }
      if ((jsonObj.get("preferredLocale") != null && !jsonObj.get("preferredLocale").isJsonNull()) && !jsonObj.get("preferredLocale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferredLocale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferredLocale").toString()));
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
      // validate the optional field `consent`
      if (jsonObj.get("consent") != null && !jsonObj.get("consent").isJsonNull()) {
        CustomerCreateConsentRequest.validateJsonElement(jsonObj.get("consent"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerSubscriberResponseWithNewsletterRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerSubscriberResponseWithNewsletterRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerSubscriberResponseWithNewsletterRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerSubscriberResponseWithNewsletterRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerSubscriberResponseWithNewsletterRequest>() {
           @Override
           public void write(JsonWriter out, CustomerSubscriberResponseWithNewsletterRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerSubscriberResponseWithNewsletterRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CustomerSubscriberResponseWithNewsletterRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomerSubscriberResponseWithNewsletterRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomerSubscriberResponseWithNewsletterRequest
   * @throws IOException if the JSON string is invalid with respect to CustomerSubscriberResponseWithNewsletterRequest
   */
  public static CustomerSubscriberResponseWithNewsletterRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerSubscriberResponseWithNewsletterRequest.class);
  }

  /**
   * Convert an instance of CustomerSubscriberResponseWithNewsletterRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

