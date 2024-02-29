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
import org.openapitools.client.model.CustomerCustomerResponse;

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
 * CustomerListCustomersResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T12:05:51.588588303Z[Etc/UTC]")
public class CustomerListCustomersResponse {
  public static final String SERIALIZED_NAME_CUSTOMERS = "customers";
  @SerializedName(SERIALIZED_NAME_CUSTOMERS)
  private List<CustomerCustomerResponse> customers;

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public CustomerListCustomersResponse() {
  }

  public CustomerListCustomersResponse customers(List<CustomerCustomerResponse> customers) {
    this.customers = customers;
    return this;
  }

  public CustomerListCustomersResponse addCustomersItem(CustomerCustomerResponse customersItem) {
    if (this.customers == null) {
      this.customers = new ArrayList<>();
    }
    this.customers.add(customersItem);
    return this;
  }

   /**
   * Get customers
   * @return customers
  **/
  @javax.annotation.Nullable
  public List<CustomerCustomerResponse> getCustomers() {
    return customers;
  }

  public void setCustomers(List<CustomerCustomerResponse> customers) {
    this.customers = customers;
  }


  public CustomerListCustomersResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Get nextPageToken
   * @return nextPageToken
  **/
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerListCustomersResponse customerListCustomersResponse = (CustomerListCustomersResponse) o;
    return Objects.equals(this.customers, customerListCustomersResponse.customers) &&
        Objects.equals(this.nextPageToken, customerListCustomersResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customers, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListCustomersResponse {\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
    openapiFields.add("customers");
    openapiFields.add("nextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerListCustomersResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerListCustomersResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerListCustomersResponse is not found in the empty JSON string", CustomerListCustomersResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerListCustomersResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerListCustomersResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("customers") != null && !jsonObj.get("customers").isJsonNull()) {
        JsonArray jsonArraycustomers = jsonObj.getAsJsonArray("customers");
        if (jsonArraycustomers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customers` to be an array in the JSON string but got `%s`", jsonObj.get("customers").toString()));
          }

          // validate the optional field `customers` (array)
          for (int i = 0; i < jsonArraycustomers.size(); i++) {
            CustomerCustomerResponse.validateJsonElement(jsonArraycustomers.get(i));
          };
        }
      }
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerListCustomersResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerListCustomersResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerListCustomersResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerListCustomersResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerListCustomersResponse>() {
           @Override
           public void write(JsonWriter out, CustomerListCustomersResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerListCustomersResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerListCustomersResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerListCustomersResponse
  * @throws IOException if the JSON string is invalid with respect to CustomerListCustomersResponse
  */
  public static CustomerListCustomersResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerListCustomersResponse.class);
  }

 /**
  * Convert an instance of CustomerListCustomersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
