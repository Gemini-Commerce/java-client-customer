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
import org.openapitools.client.model.ListConsentsRequestFilters;
import org.openapitools.client.model.ListConsentsRequestSort;

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
 * CustomerListConsentsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T16:36:56.693582318Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CustomerListConsentsRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize;

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "pageToken";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private String pageToken;

  public static final String SERIALIZED_NAME_SORTS = "sorts";
  @SerializedName(SERIALIZED_NAME_SORTS)
  private List<ListConsentsRequestSort> sorts = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILTERS_MASK = "filtersMask";
  @SerializedName(SERIALIZED_NAME_FILTERS_MASK)
  private String filtersMask;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private ListConsentsRequestFilters filters;

  public CustomerListConsentsRequest() {
  }

  public CustomerListConsentsRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public CustomerListConsentsRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   */
  @javax.annotation.Nullable
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public CustomerListConsentsRequest pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Get pageToken
   * @return pageToken
   */
  @javax.annotation.Nullable
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }


  public CustomerListConsentsRequest sorts(List<ListConsentsRequestSort> sorts) {
    this.sorts = sorts;
    return this;
  }

  public CustomerListConsentsRequest addSortsItem(ListConsentsRequestSort sortsItem) {
    if (this.sorts == null) {
      this.sorts = new ArrayList<>();
    }
    this.sorts.add(sortsItem);
    return this;
  }

  /**
   * Get sorts
   * @return sorts
   */
  @javax.annotation.Nullable
  public List<ListConsentsRequestSort> getSorts() {
    return sorts;
  }

  public void setSorts(List<ListConsentsRequestSort> sorts) {
    this.sorts = sorts;
  }


  public CustomerListConsentsRequest filtersMask(String filtersMask) {
    this.filtersMask = filtersMask;
    return this;
  }

  /**
   * Get filtersMask
   * @return filtersMask
   */
  @javax.annotation.Nullable
  public String getFiltersMask() {
    return filtersMask;
  }

  public void setFiltersMask(String filtersMask) {
    this.filtersMask = filtersMask;
  }


  public CustomerListConsentsRequest filters(ListConsentsRequestFilters filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @javax.annotation.Nullable
  public ListConsentsRequestFilters getFilters() {
    return filters;
  }

  public void setFilters(ListConsentsRequestFilters filters) {
    this.filters = filters;
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
   * @return the CustomerListConsentsRequest instance itself
   */
  public CustomerListConsentsRequest putAdditionalProperty(String key, Object value) {
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
    CustomerListConsentsRequest customerListConsentsRequest = (CustomerListConsentsRequest) o;
    return Objects.equals(this.tenantId, customerListConsentsRequest.tenantId) &&
        Objects.equals(this.pageSize, customerListConsentsRequest.pageSize) &&
        Objects.equals(this.pageToken, customerListConsentsRequest.pageToken) &&
        Objects.equals(this.sorts, customerListConsentsRequest.sorts) &&
        Objects.equals(this.filtersMask, customerListConsentsRequest.filtersMask) &&
        Objects.equals(this.filters, customerListConsentsRequest.filters)&&
        Objects.equals(this.additionalProperties, customerListConsentsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, pageSize, pageToken, sorts, filtersMask, filters, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListConsentsRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("    sorts: ").append(toIndentedString(sorts)).append("\n");
    sb.append("    filtersMask: ").append(toIndentedString(filtersMask)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("pageSize");
    openapiFields.add("pageToken");
    openapiFields.add("sorts");
    openapiFields.add("filtersMask");
    openapiFields.add("filters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomerListConsentsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerListConsentsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerListConsentsRequest is not found in the empty JSON string", CustomerListConsentsRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("pageToken") != null && !jsonObj.get("pageToken").isJsonNull()) && !jsonObj.get("pageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageToken").toString()));
      }
      if (jsonObj.get("sorts") != null && !jsonObj.get("sorts").isJsonNull()) {
        JsonArray jsonArraysorts = jsonObj.getAsJsonArray("sorts");
        if (jsonArraysorts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sorts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sorts` to be an array in the JSON string but got `%s`", jsonObj.get("sorts").toString()));
          }

          // validate the optional field `sorts` (array)
          for (int i = 0; i < jsonArraysorts.size(); i++) {
            ListConsentsRequestSort.validateJsonElement(jsonArraysorts.get(i));
          };
        }
      }
      if ((jsonObj.get("filtersMask") != null && !jsonObj.get("filtersMask").isJsonNull()) && !jsonObj.get("filtersMask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filtersMask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filtersMask").toString()));
      }
      // validate the optional field `filters`
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        ListConsentsRequestFilters.validateJsonElement(jsonObj.get("filters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerListConsentsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerListConsentsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerListConsentsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerListConsentsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerListConsentsRequest>() {
           @Override
           public void write(JsonWriter out, CustomerListConsentsRequest value) throws IOException {
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
           public CustomerListConsentsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CustomerListConsentsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CustomerListConsentsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomerListConsentsRequest
   * @throws IOException if the JSON string is invalid with respect to CustomerListConsentsRequest
   */
  public static CustomerListConsentsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerListConsentsRequest.class);
  }

  /**
   * Convert an instance of CustomerListConsentsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

