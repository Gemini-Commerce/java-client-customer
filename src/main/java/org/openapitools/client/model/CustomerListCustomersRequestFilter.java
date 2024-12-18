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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ListCustomersRequestFilterDate;

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
 * CustomerListCustomersRequestFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T16:36:56.693582318Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CustomerListCustomersRequestFilter {
  public static final String SERIALIZED_NAME_GENDERS = "genders";
  @SerializedName(SERIALIZED_NAME_GENDERS)
  private List<String> genders = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private List<ListCustomersRequestFilterDate> createdAt = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private List<String> countries = new ArrayList<>();

  public static final String SERIALIZED_NAME_AGENT_GRN = "agentGrn";
  @SerializedName(SERIALIZED_NAME_AGENT_GRN)
  private String agentGrn;

  public CustomerListCustomersRequestFilter() {
  }

  public CustomerListCustomersRequestFilter genders(List<String> genders) {
    this.genders = genders;
    return this;
  }

  public CustomerListCustomersRequestFilter addGendersItem(String gendersItem) {
    if (this.genders == null) {
      this.genders = new ArrayList<>();
    }
    this.genders.add(gendersItem);
    return this;
  }

  /**
   * Get genders
   * @return genders
   */
  @javax.annotation.Nullable
  public List<String> getGenders() {
    return genders;
  }

  public void setGenders(List<String> genders) {
    this.genders = genders;
  }


  public CustomerListCustomersRequestFilter createdAt(List<ListCustomersRequestFilterDate> createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public CustomerListCustomersRequestFilter addCreatedAtItem(ListCustomersRequestFilterDate createdAtItem) {
    if (this.createdAt == null) {
      this.createdAt = new ArrayList<>();
    }
    this.createdAt.add(createdAtItem);
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public List<ListCustomersRequestFilterDate> getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(List<ListCustomersRequestFilterDate> createdAt) {
    this.createdAt = createdAt;
  }


  public CustomerListCustomersRequestFilter countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public CustomerListCustomersRequestFilter addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * Get countries
   * @return countries
   */
  @javax.annotation.Nullable
  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }


  public CustomerListCustomersRequestFilter agentGrn(String agentGrn) {
    this.agentGrn = agentGrn;
    return this;
  }

  /**
   * Get agentGrn
   * @return agentGrn
   */
  @javax.annotation.Nullable
  public String getAgentGrn() {
    return agentGrn;
  }

  public void setAgentGrn(String agentGrn) {
    this.agentGrn = agentGrn;
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
   * @return the CustomerListCustomersRequestFilter instance itself
   */
  public CustomerListCustomersRequestFilter putAdditionalProperty(String key, Object value) {
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
    CustomerListCustomersRequestFilter customerListCustomersRequestFilter = (CustomerListCustomersRequestFilter) o;
    return Objects.equals(this.genders, customerListCustomersRequestFilter.genders) &&
        Objects.equals(this.createdAt, customerListCustomersRequestFilter.createdAt) &&
        Objects.equals(this.countries, customerListCustomersRequestFilter.countries) &&
        Objects.equals(this.agentGrn, customerListCustomersRequestFilter.agentGrn)&&
        Objects.equals(this.additionalProperties, customerListCustomersRequestFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genders, createdAt, countries, agentGrn, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListCustomersRequestFilter {\n");
    sb.append("    genders: ").append(toIndentedString(genders)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    agentGrn: ").append(toIndentedString(agentGrn)).append("\n");
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
    openapiFields.add("genders");
    openapiFields.add("createdAt");
    openapiFields.add("countries");
    openapiFields.add("agentGrn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomerListCustomersRequestFilter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerListCustomersRequestFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerListCustomersRequestFilter is not found in the empty JSON string", CustomerListCustomersRequestFilter.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("genders") != null && !jsonObj.get("genders").isJsonNull() && !jsonObj.get("genders").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `genders` to be an array in the JSON string but got `%s`", jsonObj.get("genders").toString()));
      }
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        JsonArray jsonArraycreatedAt = jsonObj.getAsJsonArray("createdAt");
        if (jsonArraycreatedAt != null) {
          // ensure the json data is an array
          if (!jsonObj.get("createdAt").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be an array in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
          }

          // validate the optional field `createdAt` (array)
          for (int i = 0; i < jsonArraycreatedAt.size(); i++) {
            ListCustomersRequestFilterDate.validateJsonElement(jsonArraycreatedAt.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("countries") != null && !jsonObj.get("countries").isJsonNull() && !jsonObj.get("countries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `countries` to be an array in the JSON string but got `%s`", jsonObj.get("countries").toString()));
      }
      if ((jsonObj.get("agentGrn") != null && !jsonObj.get("agentGrn").isJsonNull()) && !jsonObj.get("agentGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentGrn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerListCustomersRequestFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerListCustomersRequestFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerListCustomersRequestFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerListCustomersRequestFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerListCustomersRequestFilter>() {
           @Override
           public void write(JsonWriter out, CustomerListCustomersRequestFilter value) throws IOException {
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
           public CustomerListCustomersRequestFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CustomerListCustomersRequestFilter instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CustomerListCustomersRequestFilter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomerListCustomersRequestFilter
   * @throws IOException if the JSON string is invalid with respect to CustomerListCustomersRequestFilter
   */
  public static CustomerListCustomersRequestFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerListCustomersRequestFilter.class);
  }

  /**
   * Convert an instance of CustomerListCustomersRequestFilter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

