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
import java.util.Arrays;
import org.openapitools.client.model.CustomerUpdateRequestPayload;

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
 * CustomerUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T12:05:51.588588303Z[Etc/UTC]")
public class CustomerUpdateRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private CustomerUpdateRequestPayload payload;

  public static final String SERIALIZED_NAME_FIELD_MASK = "fieldMask";
  @SerializedName(SERIALIZED_NAME_FIELD_MASK)
  private String fieldMask;

  public CustomerUpdateRequest() {
  }

  public CustomerUpdateRequest tenantId(String tenantId) {
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


  public CustomerUpdateRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public CustomerUpdateRequest payload(CustomerUpdateRequestPayload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  public CustomerUpdateRequestPayload getPayload() {
    return payload;
  }

  public void setPayload(CustomerUpdateRequestPayload payload) {
    this.payload = payload;
  }


  public CustomerUpdateRequest fieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

   /**
   * Get fieldMask
   * @return fieldMask
  **/
  @javax.annotation.Nullable
  public String getFieldMask() {
    return fieldMask;
  }

  public void setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerUpdateRequest customerUpdateRequest = (CustomerUpdateRequest) o;
    return Objects.equals(this.tenantId, customerUpdateRequest.tenantId) &&
        Objects.equals(this.customerId, customerUpdateRequest.customerId) &&
        Objects.equals(this.payload, customerUpdateRequest.payload) &&
        Objects.equals(this.fieldMask, customerUpdateRequest.fieldMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, customerId, payload, fieldMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUpdateRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    fieldMask: ").append(toIndentedString(fieldMask)).append("\n");
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
    openapiFields.add("customerId");
    openapiFields.add("payload");
    openapiFields.add("fieldMask");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerUpdateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerUpdateRequest is not found in the empty JSON string", CustomerUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerUpdateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      // validate the optional field `payload`
      if (jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) {
        CustomerUpdateRequestPayload.validateJsonElement(jsonObj.get("payload"));
      }
      if ((jsonObj.get("fieldMask") != null && !jsonObj.get("fieldMask").isJsonNull()) && !jsonObj.get("fieldMask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldMask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldMask").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerUpdateRequest>() {
           @Override
           public void write(JsonWriter out, CustomerUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to CustomerUpdateRequest
  */
  public static CustomerUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerUpdateRequest.class);
  }

 /**
  * Convert an instance of CustomerUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

