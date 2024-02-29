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
 * CustomerUnsubscribeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T12:05:51.588588303Z[Etc/UTC]")
public class CustomerUnsubscribeResponse {
  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private Boolean response;

  public static final String SERIALIZED_NAME_SUBSCRIBER_EXIST = "subscriberExist";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_EXIST)
  private Boolean subscriberExist;

  public static final String SERIALIZED_NAME_ACTIVE_NEWSLETTER_GRN = "activeNewsletterGrn";
  @SerializedName(SERIALIZED_NAME_ACTIVE_NEWSLETTER_GRN)
  private List<String> activeNewsletterGrn;

  public CustomerUnsubscribeResponse() {
  }

  public CustomerUnsubscribeResponse response(Boolean response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nullable
  public Boolean getResponse() {
    return response;
  }

  public void setResponse(Boolean response) {
    this.response = response;
  }


  public CustomerUnsubscribeResponse subscriberExist(Boolean subscriberExist) {
    this.subscriberExist = subscriberExist;
    return this;
  }

   /**
   * Get subscriberExist
   * @return subscriberExist
  **/
  @javax.annotation.Nullable
  public Boolean getSubscriberExist() {
    return subscriberExist;
  }

  public void setSubscriberExist(Boolean subscriberExist) {
    this.subscriberExist = subscriberExist;
  }


  public CustomerUnsubscribeResponse activeNewsletterGrn(List<String> activeNewsletterGrn) {
    this.activeNewsletterGrn = activeNewsletterGrn;
    return this;
  }

  public CustomerUnsubscribeResponse addActiveNewsletterGrnItem(String activeNewsletterGrnItem) {
    if (this.activeNewsletterGrn == null) {
      this.activeNewsletterGrn = new ArrayList<>();
    }
    this.activeNewsletterGrn.add(activeNewsletterGrnItem);
    return this;
  }

   /**
   * Get activeNewsletterGrn
   * @return activeNewsletterGrn
  **/
  @javax.annotation.Nullable
  public List<String> getActiveNewsletterGrn() {
    return activeNewsletterGrn;
  }

  public void setActiveNewsletterGrn(List<String> activeNewsletterGrn) {
    this.activeNewsletterGrn = activeNewsletterGrn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerUnsubscribeResponse customerUnsubscribeResponse = (CustomerUnsubscribeResponse) o;
    return Objects.equals(this.response, customerUnsubscribeResponse.response) &&
        Objects.equals(this.subscriberExist, customerUnsubscribeResponse.subscriberExist) &&
        Objects.equals(this.activeNewsletterGrn, customerUnsubscribeResponse.activeNewsletterGrn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, subscriberExist, activeNewsletterGrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUnsubscribeResponse {\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    subscriberExist: ").append(toIndentedString(subscriberExist)).append("\n");
    sb.append("    activeNewsletterGrn: ").append(toIndentedString(activeNewsletterGrn)).append("\n");
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
    openapiFields.add("response");
    openapiFields.add("subscriberExist");
    openapiFields.add("activeNewsletterGrn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerUnsubscribeResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerUnsubscribeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerUnsubscribeResponse is not found in the empty JSON string", CustomerUnsubscribeResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerUnsubscribeResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerUnsubscribeResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("activeNewsletterGrn") != null && !jsonObj.get("activeNewsletterGrn").isJsonNull() && !jsonObj.get("activeNewsletterGrn").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `activeNewsletterGrn` to be an array in the JSON string but got `%s`", jsonObj.get("activeNewsletterGrn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerUnsubscribeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerUnsubscribeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerUnsubscribeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerUnsubscribeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerUnsubscribeResponse>() {
           @Override
           public void write(JsonWriter out, CustomerUnsubscribeResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerUnsubscribeResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerUnsubscribeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerUnsubscribeResponse
  * @throws IOException if the JSON string is invalid with respect to CustomerUnsubscribeResponse
  */
  public static CustomerUnsubscribeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerUnsubscribeResponse.class);
  }

 /**
  * Convert an instance of CustomerUnsubscribeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
